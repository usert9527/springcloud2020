package com.user9527.springcloud.alibaba.service;

import com.user9527.springcloud.alibaba.domain.CommonResult;
import org.apache.ibatis.annotations.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.math.BigDecimal;

/**
 * @date 2020/3/28 - 15:37
 */
public interface AccountService
{
    void decrease(Long userId,BigDecimal money);
}
