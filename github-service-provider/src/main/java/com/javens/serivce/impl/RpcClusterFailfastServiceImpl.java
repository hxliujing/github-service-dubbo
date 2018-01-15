package com.javens.serivce.impl;

import com.javens.api.RpcClusterFailfastService;
import com.javens.api.RpcClusterFailoverService;
import org.springframework.stereotype.Service;

@Service("rpcClusterFailfastService")
public class RpcClusterFailfastServiceImpl implements RpcClusterFailfastService {
    @Override
    public String clusterFailfast() {
        return "clusterFailfast";
    }
}
