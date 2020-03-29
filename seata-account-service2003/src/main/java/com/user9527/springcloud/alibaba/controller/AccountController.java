package com.user9527.springcloud.alibaba.controller;

import com.user9527.springcloud.alibaba.domain.CommonResult;
import com.user9527.springcloud.alibaba.service.AccountService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.math.BigDecimal;

/**
 * @date 2020/3/28 - 16:51
 */
@RequestMapping("account")
@RestController
public class AccountController
{
    @Resource
    private AccountService accountService;

    @RequestMapping("decrease")
    public CommonResult decrease(@RequestParam("userId") Long userId, @RequestParam("money") BigDecimal money)
    {
        this.accountService.decrease(userId,money);
        return new CommonResult(200,"减余额成功");
    }
}
