package com.javens;

import com.javens.api.RpcTestService;
import com.javens.conf.SpringContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.Map;
import java.util.Properties;

@SpringBootApplication
@ImportResource(locations = "classpath:spring/spring-service-base.xml")
public class ConsumerApplication {
    private static final Logger log = LoggerFactory.getLogger(ConsumerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        log.info("github-service-provider  success----------");
        RpcTestService rpcTestService  = (RpcTestService) SpringContext.getBean("rpcTestService");
        log.info("RPC from provider-->" + rpcTestService.hello());
        log.info("RPC from provider-->" + rpcTestService.exit());
    }
}
