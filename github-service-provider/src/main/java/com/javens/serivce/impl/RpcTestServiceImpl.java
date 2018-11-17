package com.javens.serivce.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.javens.api.RpcTestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * @author liujing
 */
@Service(version = "${dubbo.version}",
        application = "${dubbo.application.id}",
        protocol = "${dubbo.protocol.id}",
        registry = "${dubbo.registry.id}"
)
@Component
public class RpcTestServiceImpl implements RpcTestService {
    private static final Logger log = LoggerFactory.getLogger(RpcTestServiceImpl.class);
    @Override
    public String hello() {
        log.info("hello");
        return "hello";
    }

    @Override
    public String exit() {
        log.info("exit");
        return "exit";
    }

}
