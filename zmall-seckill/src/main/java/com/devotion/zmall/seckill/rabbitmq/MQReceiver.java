package com.devotion.zmall.seckill.rabbitmq;

import com.devotion.zmall.seckill.domain.MiaoshaOrder;
import com.devotion.zmall.seckill.domain.MiaoshaUser;
import com.devotion.zmall.seckill.redis.RedisService;
import com.devotion.zmall.seckill.service.GoodsService;
import com.devotion.zmall.seckill.service.MiaoShaMessageService;
import com.devotion.zmall.seckill.service.MiaoshaService;
import com.devotion.zmall.seckill.service.OrderService;
import com.devotion.zmall.seckill.vo.GoodsVo;
import com.devotion.zmall.seckill.vo.MiaoShaMessageVo;
import com.rabbitmq.client.Channel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class MQReceiver {

		private static Logger log = LoggerFactory.getLogger(MQReceiver.class);
		
		@Autowired
		RedisService redisService;
		
		@Autowired
		GoodsService goodsService;
		
		@Autowired
		OrderService orderService;
		
		@Autowired
		MiaoshaService miaoshaService;

		@Autowired
		MiaoShaMessageService messageService ;
		
		@RabbitListener(queues=MQConfig.MIAOSHA_QUEUE)
		public void receive(String message) {
			log.info("receive message:"+message);
			MiaoshaMessage mm  = RedisService.stringToBean(message, MiaoshaMessage.class);
			MiaoshaUser user = mm.getUser();
			long goodsId = mm.getGoodsId();

			GoodsVo goods = goodsService.getGoodsVoByGoodsId(goodsId);
	    	int stock = goods.getStockCount();
	    	if(stock <= 0) {
	    		return;
	    	}
	    	//判断是否已经秒杀到了
	    	MiaoshaOrder order = orderService.getMiaoshaOrderByUserIdGoodsId(Long.valueOf(user.getNickname()), goodsId);
	    	if(order != null) {
	    		return;
	    	}
	    	//减库存 下订单 写入秒杀订单
	    	miaoshaService.miaosha(user, goods);
		}



	@RabbitListener(queues=MQConfig.MIAOSHATEST)
	public void receiveMiaoShaMessage(Message message, Channel channel) throws IOException {
		log.info("接受到的消息为:{}",message);
		String messRegister = new String(message.getBody(), "UTF-8");
		channel.basicAck(message.getMessageProperties().getDeliveryTag(), true);
		MiaoShaMessageVo msm  = RedisService.stringToBean(messRegister, MiaoShaMessageVo.class);
		messageService.insertMs(msm);
		}
}
