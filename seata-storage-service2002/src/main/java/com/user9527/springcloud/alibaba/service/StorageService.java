package com.user9527.springcloud.alibaba.service;

import com.user9527.springcloud.alibaba.domain.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @date 2020/3/28 - 15:37
 */
public interface StorageService
{
    void decrease(Long productId,Integer count);
}
