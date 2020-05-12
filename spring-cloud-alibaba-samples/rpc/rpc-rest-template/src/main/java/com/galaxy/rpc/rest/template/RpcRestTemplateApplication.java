package com.galaxy.rpc.rest.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author galaxy
 */
@SpringBootApplication
public class RpcRestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(RpcRestTemplateApplication.class, args);
    }


    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
