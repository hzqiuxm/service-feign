package com.springboot;


import org.springframework.stereotype.Component;

/**
 * Copyright © 2017年 ziniuxiaozhu. All rights reserved.
 *
 * @Author 临江仙 hzqiuxm@163.com
 * @Date 2017/8/5 0005 16:33
 * 服务调用失败或者断路器打开后调用该类的方法返回
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }

    @Override
    public String sayHiFromClientOne(String name, Integer age) {
        return "sorry " + name + "your age is " + age;
    }

    @Override
    public String sayHiFromClientOne(User user) {
        return "sorry " + user.getName() + "your age is " + user.getAge();
    }

}
