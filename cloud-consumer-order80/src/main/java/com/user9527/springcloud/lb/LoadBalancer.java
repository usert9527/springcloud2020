package com.user9527.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @date 2020/3/14 - 22:26
 */
public interface LoadBalancer
{
    ServiceInstance getInstances(List<ServiceInstance> serviceInstances);
}
