package com.javens;

import com.alibaba.dubbo.config.ProtocolConfig;
import com.javens.api.RpcClusterBroadcastService;
import com.javens.api.RpcClusterFailoverService;
import com.javens.api.RpcMultiService;
import com.javens.api.RpcTestService;
import com.javens.conf.SpringContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.util.Map;
import java.util.Properties;

/**
 * @author
 */
@SpringBootApplication
@ComponentScan("com.javens.*")
public class ConsumerApplication {
    private static final Logger log = LoggerFactory.getLogger(ConsumerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        log.info("github-service-consumer  success----------");

    }
}
