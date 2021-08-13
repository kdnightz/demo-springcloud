package com.funtl.hello.spring.cloud.web.admin.feign.service;

import com.funtl.hello.spring.cloud.web.admin.feign.service.hystrix.AdminServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @ClassName AdminService
 * @Description TODO
 * @Author Administrator
 * @Date 2019/5/14 11:54
 * @Version 1.0
 **/
@FeignClient(value = "hello-spring-cloud-service-admin" , fallback = AdminServiceHystrix.class)
public interface AdminService {

    @RequestMapping(value = "hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam(value = "message") String message);
}
