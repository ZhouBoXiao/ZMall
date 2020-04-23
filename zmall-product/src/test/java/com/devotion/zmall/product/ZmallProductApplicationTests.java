package com.devotion.zmall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.devotion.zmall.product.entity.BrandEntity;
import com.devotion.zmall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ZmallProductApplicationTests {

    @Autowired
    BrandService typeService;

    // 创建题目类型
    @Test
    void testCreateType() {
        BrandEntity typeEntity = new BrandEntity();
        typeEntity.setDescript("javaBasic");
        typeService.save(typeEntity);
        System.out.println("创建成功");

        List<BrandEntity> typeEntityList = typeService.list(new QueryWrapper<BrandEntity>().eq("brandId",1L));
        typeEntityList.forEach((item)-> {
            System.out.println(item);
        });
        System.out.println("查询成功");
        typeService.removeById(1L);
    }

}
