package com.user9527.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.internal.constraintvalidators.bv.number.bound.decimal.DecimalMaxValidatorForBigDecimal;

import java.math.BigDecimal;

/**
 * @date 2020/3/28 - 17:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account
{
    private Long id;

    private Long userId;

    private BigDecimal total;

    private BigDecimal used;

    private BigDecimal residue;
}
