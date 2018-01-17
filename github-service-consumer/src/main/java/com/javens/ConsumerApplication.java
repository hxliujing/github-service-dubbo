package com.javens;

import com.javens.api.RpcClusterBroadcastService;
import com.javens.api.RpcClusterFailoverService;
import com.javens.api.RpcMultiService;
import com.javens.api.RpcTestService;
import com.javens.conf.SpringContext;
import com.javens.restart.RestartMainThread;
import com.javens.restart.RestartParent;
import com.javens.restart.RestartSubThread;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import java.util.Map;
import java.util.Properties;

@SpringBootApplication
@ImportResource(locations = "classpath:spring/spring-service-base.xml")
public class ConsumerApplication {
    private static final Logger log = LoggerFactory.getLogger(ConsumerApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
        log.info("github-service-provider  success----------");
        RpcTestService rpcTestService  = (RpcTestService) SpringContext.getBean("rpcTestService");
        log.info("RPC from provider-->" + rpcTestService.hello());
        log.info("RPC from provider-->" + rpcTestService.exit());


        //testRestartServerKill15();
        testFailoverCluster();
        //testBroadcastCluster();

        synchronized (ConsumerApplication.class) {
            while (true) {
                try {
                    ConsumerApplication.class.wait();
                } catch (InterruptedException e) {
                    log.error("== synchronized error:", e);
                }
            }
        }

    }

    private static void testBroadcastCluster() {
        RpcClusterBroadcastService clusterService  = (RpcClusterBroadcastService) SpringContext.getBean("rpcClusterBroadcastService");
        log.info(clusterService.clusterBroadcast());
    }

    private static void testFailoverCluster() {
       // RpcClusterFailoverService clusterService  = (RpcClusterFailoverService) SpringContext.getBean("rpcClusterFailoverService");
       // log.info(clusterService.clusterFailover());
        RpcMultiService clusterService  = (RpcMultiService) SpringContext.getBean("rpcMultiService1");
        log.info(clusterService.hello());
    }

    /**
     * kill-15 进程PID，JVM退出情况测试
     *
     * 结果：
     *      kill -15 PID
     *      kill PID
     *      效果一致，JVM直接shutdown
     */
    private static void testRestartServerKill15() {
        log.info("Run At: "+ System.getProperty("PID"));
        int  times = 100;
        long sleep = 2 * 1000;
        RestartSubThread subThread = new RestartSubThread(times,sleep);
        new Thread(subThread).start();

        RestartParent mainThread = new RestartMainThread(times,sleep);
        mainThread.run();
    }
}
