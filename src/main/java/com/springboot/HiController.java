package com.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Copyright © 2017年 ziniuxiaozhu. All rights reserved.
 *
 * @Author 临江仙 hzqiuxm@163.com
 * @Date 2017/12/16 0016 17:02
 */
@RestController
public class HiController {

    @Resource
    private SchedualServiceHi schedualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(@RequestParam String name){
        return schedualServiceHi.sayHiFromClientOne(name);
    }

    @GetMapping(value ="/hi2" )
    public String sayHi2(){

        StringBuilder sb = new StringBuilder();

        sb.append(schedualServiceHi.sayHiFromClientOne("hzqiuxm")).append("\n");
        sb.append(schedualServiceHi.sayHiFromClientOne("hzqiuxm002",30)).append("\n");
        sb.append(schedualServiceHi.sayHiFromClientOne(new User("hzqixm003",30))).append("\n");

        return sb.toString();
    }
}
