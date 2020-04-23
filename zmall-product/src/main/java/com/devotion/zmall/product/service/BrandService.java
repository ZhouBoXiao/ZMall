package com.devotion.zmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.devotion.common.utils.PageUtils;
import com.devotion.zmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author apayaduo
 * @email apayaduo@gmail.com
 * @date 2020-04-23 21:18:41
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

