package com.javens.serivce.impl;

import com.javens.api.RpcClusterFailbackService;
import com.javens.api.RpcClusterFailsafeService;
import org.springframework.stereotype.Service;

@Service("rpcClusterFailbackService")
public class RpcClusterFailbackServiceImpl implements RpcClusterFailbackService {
    @Override
    public String clusterFailback() {
        return "clusterFailback";
    }
}
