package com.devotion.zmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.devotion.common.utils.PageUtils;
import com.devotion.zmall.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author apayaduo
 * @email apayaduo@gmail.com
 * @date 2020-04-23 23:02:55
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

