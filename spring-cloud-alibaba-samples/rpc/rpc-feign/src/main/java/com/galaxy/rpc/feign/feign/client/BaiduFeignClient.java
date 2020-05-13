package com.galaxy.rpc.feign.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author galaxy
 */
@FeignClient(value = "baidu", url = "http://www.baidu.com")
public interface BaiduFeignClient {

    /**
     * 百度搜索
     *
     * @return 百度搜索返回的内容
     */
    @GetMapping
    String baidu();

}
