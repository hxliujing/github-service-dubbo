package com.javens.serivce.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.javens.api.RpcClusterFailbackService;
import com.javens.api.RpcClusterFailsafeService;
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
public class RpcClusterFailbackServiceImpl implements RpcClusterFailbackService {
    @Override
    public String clusterFailback() {
        return "clusterFailback";
    }
}
