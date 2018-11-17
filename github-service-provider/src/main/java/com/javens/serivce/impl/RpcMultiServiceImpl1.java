package com.javens.serivce.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.javens.api.RpcMultiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * @author liujing
 */
@Service(version = "${dubbo.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
@Component
public class RpcMultiServiceImpl1 implements RpcMultiService {
    protected static final Logger logger = LoggerFactory.getLogger(RpcMultiServiceImpl1.class);


    @Override
    public String hello() {
        logger.info("1->"+ UUID.randomUUID().toString());
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello-1";
    }

    @Override
    public String hello(int i) {
        logger.info("Receive:"+ i);
        return String.valueOf(i);
    }
}
