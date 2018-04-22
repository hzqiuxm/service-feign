package com.springboot;

import feign.Feign;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

/**
 * Copyright © 2017年 ziniuxiaozhu. All rights reserved.
 * 关闭Hystrix功能的配置类
 * @Author 临江仙 hzqiuxm@163.com
 * @Date 2018/4/22 0022 16:26
 */
public class DisableHystrixConfiguration {

    @Bean
    @Scope("prototype")
    public Feign.Builder feignBuilder(){

        return Feign.builder();
    }

}
