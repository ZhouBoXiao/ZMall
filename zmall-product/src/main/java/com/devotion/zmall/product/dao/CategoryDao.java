package com.devotion.zmall.product.dao;

import com.devotion.zmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author apayaduo
 * @email apayaduo@gmail.com
 * @date 2020-04-23 21:18:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
