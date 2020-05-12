package com.galaxy.rpc.feign.controller;

import com.galaxy.rpc.feign.feign.client.HelloFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author galaxy
 */
@RestController
public class HelloController {

    private final HelloFeignClient helloFeignClient;

    public HelloController(HelloFeignClient helloFeignClient) {
        this.helloFeignClient = helloFeignClient;
    }

    @GetMapping("/hello")
    public String hello() {
        return helloFeignClient.hello("rpc-feign");
    }
}
