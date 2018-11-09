package com.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.service.HelloService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author jp
 * @Description: TODO
 * @date 2018/11/8 18:13
 */
@Component
@Service(version = "1.0.0", timeout = 30000)
public class HelloServiceImpl implements HelloService {
    static Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String show(String name) {
        String msg = "show: welcome use dubbo: " + name;
        logger.info(msg);
        logger.info("consumer Dubbo RPC to provider is finised ");

        return msg;
    }

}
