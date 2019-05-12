package com.danyjavierb.callcenter.services;

import com.danyjavierb.callcenter.model.Call;
import com.danyjavierb.callcenter.model.Employee;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;

public class Dispatcher extends Thread {

    private ExecutorService executorService;
    private PriorityBlockingQueue<Employee> employees;
    private ConcurrentLinkedQueue<Call> calls;
    private int poolSize;

    public ExecutorService getExecutorService() {
        return executorService;
    }

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public Queue<Employee> getEmployees() {
        return employees;
    }

    public Queue<Call> getCalls() {
        return calls;
    }

    public Dispatcher() {
        this.poolSize = 10;
        this.executorService = Executors.newFixedThreadPool(poolSize);
        this.employees = new PriorityBlockingQueue<>();
        this.calls = new ConcurrentLinkedQueue<>();

    }

    public int getPoolSize() {
        return poolSize;
    }

    public void setPoolSize(int poolSize) {
        this.poolSize = poolSize;
    }

    public void dispatchCall(Call call) {

        calls.add(call);
    }

    public void notifyFreeEmployee(Employee employee) {

        this.employees.add(employee);

    }

    @Override
    public void run() {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                if (!employees.isEmpty() && !calls.isEmpty()) {
                    Employee availableEmployee = this.employees.take();
                    System.out.println("Available employee " + availableEmployee.getEmployeeName() + "\n");
                    Call pendingCall = this.calls.poll();
                    availableEmployee.setCurrentCall(pendingCall);
                    System.out.println("Employee " + availableEmployee.getEmployeeName() + "  attending call  " + pendingCall.getCallId() + "\n");
                    executorService.execute(availableEmployee.attendCall());
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e); // unreachable
        }
    }
}
