package com.user9527.springcloud.alibaba.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.hibernate.validator.internal.constraintvalidators.bv.number.bound.decimal.DecimalMaxValidatorForBigDecimal;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;

import java.math.BigDecimal;

/**
 * @date 2020/3/27 - 16:58
 */
@Mapper
public interface AccountDao
{
    //减余额
    void decrease(@Param("userId") Long userId, @Param("money")BigDecimal money);

}
