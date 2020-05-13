package com.galaxy.rpc.feign.controller;

import com.galaxy.rpc.feign.feign.client.BaiduFeignClient;
import com.galaxy.rpc.feign.feign.client.HelloFeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author galaxy
 */
@RestController
public class HelloController {

    private final HelloFeignClient helloFeignClient;
    private final BaiduFeignClient baiduFeignClient;

    public HelloController(HelloFeignClient helloFeignClient, BaiduFeignClient baiduFeignClient) {
        this.helloFeignClient = helloFeignClient;
        this.baiduFeignClient = baiduFeignClient;
    }

    @GetMapping("/hello")
    public String hello() {
        return helloFeignClient.hello("rpc-feign");
    }

    @GetMapping("/baidu")
    public String baidu() {
        return baiduFeignClient.baidu();
    }
}
