package com.user9527.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @date 2020/3/27 - 16:58
 */
@Mapper
public interface StorageDao
{
    //减库存
    void decrease(@Param("productId") Long productId,@Param("count") Integer count);

}
