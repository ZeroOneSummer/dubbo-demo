package com.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dubbo.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jp
 * @Description: TODO
 * @date 2018/11/8 18:29
 */
@RestController
public class HelloController {
    static Logger logger = LoggerFactory.getLogger(HelloController.class);

    @Reference(version = "1.0.0")
    private HelloService helloService;

    @RequestMapping("/show/{name}")
    public String show(@PathVariable("name") String name){
        logger.info("consumer Dubbo RPC to provider is start... ");

        return helloService.show(name);
    }

}
