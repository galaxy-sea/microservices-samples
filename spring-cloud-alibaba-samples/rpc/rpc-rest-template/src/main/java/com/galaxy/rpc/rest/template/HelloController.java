package com.galaxy.rpc.rest.template;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author galaxy
 */
@RestController
public class HelloController {


    private final RestTemplate restTemplate;

    public HelloController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/hello")
    public String hello() {
        return this.restTemplate.getForObject("http://rpc-provider/hello/rpc-rest-template", String.class);
    }
}
