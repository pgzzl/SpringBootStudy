package com.mark.springcloud;

import com.mark.springcloud.config.CustomLoadBalancerClientConfiguration;
import com.mark.springcloud.config.RandomLoadBalancerClientConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@LoadBalancerClient(configuration = RandomLoadBalancerClientConfiguration.class)
public class ClientStarter {
    public static void main(String[] args) {
        SpringApplication.run(ClientStarter.class, args);
    }
}
