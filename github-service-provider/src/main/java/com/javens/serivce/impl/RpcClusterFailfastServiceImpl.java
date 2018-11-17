package com.javens.serivce.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.javens.api.RpcClusterFailfastService;
import com.javens.api.RpcClusterFailoverService;
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
public class RpcClusterFailfastServiceImpl implements RpcClusterFailfastService {
    @Override
    public String clusterFailfast() {
        return "clusterFailfast";
    }
}
