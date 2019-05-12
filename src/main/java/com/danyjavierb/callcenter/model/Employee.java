package com.danyjavierb.callcenter.model;

import com.danyjavierb.callcenter.services.Dispatcher;

/**
 * Abstract class for an Employee
 */
public abstract class Employee implements Comparable<Employee> {

    private Integer priorityToAttend;
    private boolean isBusy;
    private String employeeName;
    private Dispatcher callcenter;
    private Call currentCall;


    public Employee() {
    }

    public Employee(int priority, boolean isBusy, String name) {
        this.priorityToAttend = priority;
        this.isBusy = isBusy;
        this.employeeName = name;
    }


    public Employee(Dispatcher callcenter, String name, Integer priorityToAttend) {
        this.employeeName = name;
        this.isBusy = false;
        this.callcenter = callcenter;
        this.priorityToAttend = priorityToAttend;
        this.notifyFreeStateToCallCenter();
    }


    public Dispatcher getCallcenter() {
        return callcenter;
    }


    public void setCallcenter(Dispatcher callcenter) {
        this.callcenter = callcenter;
    }


    public int getPriorityToAttend() {
        return priorityToAttend;
    }

    public void setPriorityToAttend(int priority) {
        this.priorityToAttend = priority;
    }

    public boolean isBusy() {
        return isBusy;
    }

    public void setBusy(boolean busy) {
        isBusy = busy;
    }


    public String getEmployeeName() {
        return employeeName;
    }
    
    public void setEmployeeName(String name) {
        this.employeeName = name;
    }

    public void notifyFreeStateToCallCenter() {

        this.callcenter.notifyFreeEmployee(this);
    }

    public void setCurrentCall(Call currentCall) {
        this.currentCall = currentCall;
    }

    public Runnable attendCall() {
        this.currentCall.setAttendedBy(this);
        return this.currentCall;
    }

    @Override
    public int compareTo(Employee employee) {

        return this.priorityToAttend.compareTo(employee.priorityToAttend);
    }

}
