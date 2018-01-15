package com.javens.serivce.impl;

import com.javens.api.RpcClusterForkingService;
import org.springframework.stereotype.Service;

@Service("rpcClusterForkingService")
public class RpcClusterForkingServiceImpl implements RpcClusterForkingService {
    @Override
    public String clusterForking() {
        return "clusterForking";
    }
}
