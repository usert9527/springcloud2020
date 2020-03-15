package com.user9527.springcloud.lb;

import com.netflix.client.VipAddressResolver;
import com.netflix.loadbalancer.IRule;
import com.netflix.ribbon.proxy.annotation.Var;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @date 2020/3/14 - 22:29
 */
@Component
public class MyLB implements LoadBalancer
{

    private AtomicInteger atomicInteger = new AtomicInteger(0);


    private final int increment()
    {
        int current;
        int next;

        //自旋锁
        do {
            current = this.atomicInteger.get();
            next = current >= Integer.MAX_VALUE ? 0 : current + 1;
        } while (!this.atomicInteger.compareAndSet(current,next));

        System.out.println("第"+next+"访问");
        return next;
    }

    @Override
    public ServiceInstance getInstances(List<ServiceInstance> serviceInstances) {

        //     访问接口的次数 % 服务的总台数
        int index = increment() % serviceInstances.size();

        return serviceInstances.get(index);
    }
}
