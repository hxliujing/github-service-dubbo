package com.javens.serivce.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.javens.api.RpcClusterFailoverService;
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
public class RpcClusterFailoverServiceImpl implements RpcClusterFailoverService{
    protected static final Logger logger = LoggerFactory.getLogger(RpcClusterFailoverServiceImpl.class);


    @Override
    public String clusterFailover() {
        logger.info("clusterFailover-->begin");
        if(1/0==1)
            System.out.println("PASS");
        return "clusterFailover";
    }
}
