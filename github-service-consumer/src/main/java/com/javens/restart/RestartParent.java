package com.javens.restart;

public abstract class RestartParent {
    int times;
    long sleep;

    public RestartParent(int times, long sleep) {
        this.times = times;
        this.sleep = sleep;
    }
    public RestartParent(){}

    public int getTimes() {
        return times;
    }

    public void setTimes(int times) {
        this.times = times;
    }

    public long getSleep() {
        return sleep;
    }

    public void setSleep(long sleep) {
        this.sleep = sleep;
    }
    public abstract void run();
}
