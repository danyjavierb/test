package com.danyjavierb.callcenter.model;

import java.util.Random;

public class Call implements Runnable {

    private int duration;
    private String callId;

    public Employee getAttendedBy() {
        return attendedBy;
    }

    public void setAttendedBy(Employee attendedBy) {
        this.attendedBy = attendedBy;
    }

    private Employee attendedBy;

    public Call(String callId) {
        this.callId = callId;
       this.duration =  1000* (new Random().nextInt((10 - 5) + 1) + 5);
    }

    public int getDuration() {
        return duration;
    }

    public void callBack() {
        System.out.println("Employee " + this.attendedBy.getEmployeeName() + "  finished call  " + this.getCallId() + "\n");
        this.attendedBy.notifyFreeStateToCallCenter();
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(this.duration);
            this.callBack();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
