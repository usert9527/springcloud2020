package com.user9527.springcloud.alibaba.service;

import com.user9527.springcloud.alibaba.domain.CommonResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @date 2020/3/28 - 15:37
 */
@FeignClient("seata-storage-service")
public interface StorageService
{
    @PostMapping(value = "/storage/decrease")
    public CommonResult totalDecrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count);
}
