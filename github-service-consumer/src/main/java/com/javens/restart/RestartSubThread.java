package com.javens.restart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestartSubThread extends RestartParent implements Runnable {
    protected static final Logger logger = LoggerFactory.getLogger(RestartSubThread.class);

    public RestartSubThread(){}
    public RestartSubThread(int times,long sleep){
       super(times,sleep);
    }
    @Override
    public void run() {
        for(int i=0;i<times;i++){
            try {
                logger.info("SUB-Count:"+i);
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
