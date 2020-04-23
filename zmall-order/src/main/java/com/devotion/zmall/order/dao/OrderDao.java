package com.devotion.zmall.order.dao;

import com.devotion.zmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author apayaduo
 * @email apayaduo@gmail.com
 * @date 2020-04-23 23:02:55
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
