package com.javens.restart;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RestartMainThread extends RestartParent {
    protected static final Logger logger = LoggerFactory.getLogger(RestartMainThread.class);


    public RestartMainThread(int times,long sleep){
        super(times,sleep);
    }

    @Override
    public void run() {
        for(int i=0;i<times;i++){
            try {
                logger.info("MAIN-Count:"+i);
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }


}
