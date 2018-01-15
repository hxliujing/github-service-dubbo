package com.javens.serivce.impl;

import com.javens.api.RpcClusterFailfastService;
import com.javens.api.RpcClusterFailsafeService;
import org.springframework.stereotype.Service;

@Service("rpcClusterFailsafeService")
public class RpcClusterFailsafeServiceImpl implements RpcClusterFailsafeService {
    @Override
    public String clusterFailsafe() {
        return "clusterFailsafe";
    }
}
