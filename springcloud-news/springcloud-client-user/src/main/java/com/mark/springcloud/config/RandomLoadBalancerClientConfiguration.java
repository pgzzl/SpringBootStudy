package com.mark.springcloud.config;

import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.loadbalancer.core.RandomLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ReactorServiceInstanceLoadBalancer;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.annotation.Bean;

public class RandomLoadBalancerClientConfiguration {
    @Value("${service.name}")
    String serviceId;

    @Bean
    ReactorServiceInstanceLoadBalancer randomLoadBalancer(ObjectProvider<ServiceInstanceListSupplier> serviceInstanceListSupplierProvider){
        return new RandomLoadBalancer(serviceInstanceListSupplierProvider, serviceId);
    }
}
