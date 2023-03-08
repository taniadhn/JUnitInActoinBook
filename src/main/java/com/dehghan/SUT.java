package com.dehghan;

public class SUT {

    private String systemName;

    public String getSystemName() {
        return systemName;
    }

    public SUT(String our_system_under_test) {
    }

    public void close() {
    }

    public boolean canReceiveRegularWork() {
        return true;
    }

    public boolean canReceiveAdditionalWork() {
        return false;
    }

    public boolean isVerified() {
        return false;
    }

    public void verify() {
    }

    public Object getCurrentJob(Object job) {
        return  job;
    }

    public void addJob(Object job) {

    }

    public void run(int i) {
    }

    public void run() {
    }
}
