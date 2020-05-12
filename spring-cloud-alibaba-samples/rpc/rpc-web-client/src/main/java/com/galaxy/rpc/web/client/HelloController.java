package com.galaxy.rpc.web.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

/**
 * @author galaxy
 */
@RestController
public class HelloController {


    private final WebClient.Builder webClientBuilder;

    public HelloController(WebClient.Builder webClientBuilder) {
        this.webClientBuilder = webClientBuilder;
    }


    @GetMapping("/hello")
    public Mono<String> hello() {
        return webClientBuilder.build()
                .get()
                .uri("http://rpc-provider/hello/rpc-web-client")
                .retrieve()
                .bodyToMono(String.class);
    }
}
