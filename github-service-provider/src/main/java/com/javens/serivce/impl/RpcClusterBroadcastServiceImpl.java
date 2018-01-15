package com.javens.serivce.impl;

import com.javens.api.RpcClusterBroadcastService;
import com.javens.api.RpcClusterForkingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service("rpcClusterBroadcastService")
public class RpcClusterBroadcastServiceImpl implements RpcClusterBroadcastService {
    protected static final Logger logger = LoggerFactory.getLogger(RpcClusterBroadcastServiceImpl.class);


    @Override
    public String clusterBroadcast() {
        logger.info("clusterBroadcast->begin");
        return "clusterBroadcast";
    }
}
