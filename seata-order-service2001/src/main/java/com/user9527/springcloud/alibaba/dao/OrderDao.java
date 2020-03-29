package com.user9527.springcloud.alibaba.dao;

import com.user9527.springcloud.alibaba.domain.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @date 2020/3/27 - 16:58
 */
@Mapper
public interface OrderDao
{
    //创建订单
    void create(Order order);

    //改状态
    void update(@Param("userId") Long userId, @Param("status") Integer status);
}
