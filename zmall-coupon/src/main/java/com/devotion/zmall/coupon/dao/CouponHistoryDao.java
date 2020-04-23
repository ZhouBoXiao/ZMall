package com.devotion.zmall.coupon.dao;

import com.devotion.zmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author apayaduo
 * @email apayaduo@gmail.com
 * @date 2020-04-23 23:08:57
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
