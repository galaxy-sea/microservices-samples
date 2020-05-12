package com.galaxy.rpc.feign.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author galaxy
 */
@FeignClient(name = "rpc-provider")
public interface HelloFeignClient {

    /**
     * feign服务调用测试
     * @param name 服务名称
     * @return 返回
     */
    @GetMapping("/hello/{name}")
    String hello(@PathVariable String name);
}
