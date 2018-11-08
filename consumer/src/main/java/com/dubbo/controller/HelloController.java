package com.dubbo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Administrator
 * @Description: TODO
 * @date 2018/11/8 18:29
 */
@RestController
public class HelloController {

    @Autowired
    private HelloConsumer helloConsumer;

    @RequestMapping("/show/{name}")
    public void show(@PathVariable("name") String name){
        helloConsumer.show(name);
    }

}
