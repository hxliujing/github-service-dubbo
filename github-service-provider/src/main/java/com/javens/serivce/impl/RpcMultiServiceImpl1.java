package com.javens.serivce.impl;

import com.javens.api.RpcMultiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.UUID;
@Service("rpcMultiService1")
public class RpcMultiServiceImpl1 implements RpcMultiService {
    protected static final Logger logger = LoggerFactory.getLogger(RpcMultiServiceImpl1.class);


    @Override
    public String hello() {
        logger.info("1->"+ UUID.randomUUID().toString());
      /*  try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return "hello-1";
    }
}
