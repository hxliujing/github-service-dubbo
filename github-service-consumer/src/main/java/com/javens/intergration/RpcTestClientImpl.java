/**
 * fshows.com
 * Copyright (C) 2013-2018 All Rights Reserved.
 */
package com.javens.intergration;

import com.alibaba.dubbo.config.annotation.Reference;
import com.javens.api.RpcTestService;
import org.springframework.stereotype.Component;

/**
 *
 * @author liujing01
 * @version RpcTestClientImpl.java, v 0.1 2018-11-17 23:11 
 */
@Component
public class RpcTestClientImpl implements RpcTestClient {

    @Reference(version = "${dubbo.version}",
               application = "${dubbo.application.id}"
    )
    private RpcTestService rpcTestService;
    @Override
    public String hello() {
        return rpcTestService.hello();
    }

    @Override
    public String exit() {
        return rpcTestService.exit();
    }
}
