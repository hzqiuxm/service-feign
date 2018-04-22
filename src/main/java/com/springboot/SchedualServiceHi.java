package com.springboot;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

/**
 * Copyright © 2017年 ziniuxiaozhu. All rights reserved.
 *
 * @Author 临江仙 hzqiuxm@163.com
 * @Date 2017/12/16 0016 16:59
 * 定义一个feign接口，通过@ FeignClient（“服务名”），来指定调用哪个服务
 * feign是自带断路器的，并且是已经打开了只需要在SchedualServiceHi接口的注解中加上fallback的指定类
 */
@FeignClient(value = "service-hi", fallback = SchedualServiceHiHystric.class)
public interface SchedualServiceHi {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

    @GetMapping(value = "/hibyAge")
    String sayHiFromClientOne(@RequestHeader("name") String name,@RequestHeader("age") Integer age);

    @PostMapping(value = "/hibyUser")
    String sayHiFromClientOne(@RequestBody User user);

}
