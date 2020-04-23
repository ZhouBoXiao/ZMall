package com.devotion.zmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.devotion.common.utils.PageUtils;
import com.devotion.zmall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author apayaduo
 * @email apayaduo@gmail.com
 * @date 2020-04-23 21:18:41
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

