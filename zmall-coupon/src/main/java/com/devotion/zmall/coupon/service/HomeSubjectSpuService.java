package com.devotion.zmall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.devotion.common.utils.PageUtils;
import com.devotion.zmall.coupon.entity.HomeSubjectSpuEntity;

import java.util.Map;

/**
 * 专题商品
 *
 * @author apayaduo
 * @email apayaduo@gmail.com
 * @date 2020-04-23 23:08:57
 */
public interface HomeSubjectSpuService extends IService<HomeSubjectSpuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

