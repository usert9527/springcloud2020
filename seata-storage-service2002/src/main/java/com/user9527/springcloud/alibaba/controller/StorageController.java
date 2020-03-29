package com.user9527.springcloud.alibaba.controller;

import com.user9527.springcloud.alibaba.domain.CommonResult;
import com.user9527.springcloud.alibaba.service.StorageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @date 2020/3/28 - 16:51
 */
@RequestMapping("storage")
@RestController
public class StorageController
{
    @Resource
    private StorageService storageService;

    @RequestMapping("decrease")
    public CommonResult decrease(@RequestParam("productId") Long productId, @RequestParam("count") Integer count)
    {
        this.storageService.decrease(productId,count);
        return new CommonResult(200,"减库存成功");
    }
}
