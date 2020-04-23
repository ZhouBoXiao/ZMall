package com.devotion.zmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.devotion.common.utils.PageUtils;
import com.devotion.zmall.ware.entity.WareInfoEntity;

import java.util.Map;

/**
 * 仓库信息
 *
 * @author apayaduo
 * @email apayaduo@gmail.com
 * @date 2020-04-23 22:58:29
 */
public interface WareInfoService extends IService<WareInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

