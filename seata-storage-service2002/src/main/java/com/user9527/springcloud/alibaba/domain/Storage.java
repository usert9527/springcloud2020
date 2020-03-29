package com.user9527.springcloud.alibaba.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @date 2020/3/28 - 16:37
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Storage
{
    private Long id;

    private Long productId;

    private Integer total;

    private Integer user;

    private Integer residut;

}
