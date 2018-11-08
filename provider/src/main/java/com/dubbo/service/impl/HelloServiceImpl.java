package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.HelloService;

/**
 * @author Administrator
 * @Description: TODO
 * @date 2018/11/8 18:13
 */
@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public void show(String name) {
        System.out.println("------------>welcome to provider:" + name);
    }

}
