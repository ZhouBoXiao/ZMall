package com.devotion.zmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.devotion.common.utils.PageUtils;
import com.devotion.zmall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author apayaduo
 * @email apayaduo@gmail.com
 * @date 2020-04-23 21:18:41
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);

    List<CategoryEntity> listWithTree();

}

