package com.javens.serivce.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.javens.api.RpcClusterBroadcastService;
import com.javens.api.RpcClusterForkingService;
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
public class RpcClusterBroadcastServiceImpl implements RpcClusterBroadcastService {
    protected static final Logger logger = LoggerFactory.getLogger(RpcClusterBroadcastServiceImpl.class);


    @Override
    public String clusterBroadcast() {
        logger.info("clusterBroadcast->begin");
        return "clusterBroadcast";
    }
}
