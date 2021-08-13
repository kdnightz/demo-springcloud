package com.funtl.hello.spring.cloud.web.admin.ribbon.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName RestTemplateConfiguration
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/14 11:28
 * @Version 1.0
 **/
@Configuration
public class RestTemplateConfiguration {

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
