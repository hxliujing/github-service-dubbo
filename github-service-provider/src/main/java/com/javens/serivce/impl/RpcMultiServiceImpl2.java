package com.javens.serivce.impl;

import com.javens.api.RpcMultiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service("rpcMultiService2")
public class RpcMultiServiceImpl2 implements RpcMultiService {
    protected static final Logger logger = LoggerFactory.getLogger(RpcMultiServiceImpl2.class);


    @Override
    public String hello() {
        logger.info("2->"+ UUID.randomUUID().toString());
       /* try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "hello-2";
    }

    @Override
    public String hello(int i) {
        logger.info("Receive:"+ i);
        return String.valueOf(i);
    }
}
