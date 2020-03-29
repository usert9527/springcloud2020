package com.user9527.springcloud.alibaba.service.impl;

import com.user9527.springcloud.alibaba.dao.StorageDao;
import com.user9527.springcloud.alibaba.service.StorageService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @date 2020/3/28 - 16:49
 */
@Service
@Slf4j
public class StorageServiceImpl implements StorageService
{

    @Resource
    private StorageDao storageDao;

    @Override
    public void decrease(Long productId, Integer count)
    {
        log.info("开始减库存");
        this.storageDao.decrease(productId,count);
        log.info("完成减库存");
    }
}
