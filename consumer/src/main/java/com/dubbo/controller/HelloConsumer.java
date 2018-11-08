package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.HelloService;
import org.springframework.stereotype.Component;

/**
 * @author Administrator
 * @Description: TODO
 * @date 2018/11/8 19:36
 */
@Component
public class HelloConsumer {

    @Reference(url = "dubbo://192.168.1.104:2181")
    private HelloService helloService;

    public void show(String name){
        System.out.println("consumer send api to provider...");
        helloService.show(name);
    }

}
