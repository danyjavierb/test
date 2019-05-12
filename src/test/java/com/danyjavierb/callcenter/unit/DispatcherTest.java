package com.danyjavierb.callcenter.unit;

import com.danyjavierb.callcenter.model.Director;
import com.danyjavierb.callcenter.model.Employee;
import com.danyjavierb.callcenter.model.Operator;
import com.danyjavierb.callcenter.model.Supervisor;
import com.danyjavierb.callcenter.services.Dispatcher;
import org.junit.Assert;
import org.junit.Test;

public class DispatcherTest {

    @Test
    public void testPriorityQueue() {
        Dispatcher callcenter = new Dispatcher();

        Employee e1 = new Director(callcenter, "director 1");
        Assert.assertEquals(1, callcenter.getEmployees().size());
        Employee e2 = new Supervisor(callcenter, "supervisor 1");
        Assert.assertEquals(2, callcenter.getEmployees().size());
        Employee e3 = new Operator(callcenter, "operador 1");
        Assert.assertEquals(3, callcenter.getEmployees().size());


        Assert.assertEquals(callcenter.getEmployees().poll().getEmployeeName(), e3.getEmployeeName());

        Employee e4 = new Operator(callcenter, "operador 4");
        Assert.assertEquals(3, callcenter.getEmployees().size());
        Assert.assertEquals(callcenter.getEmployees().poll().getEmployeeName(), e4.getEmployeeName());


        Assert.assertEquals(callcenter.getEmployees().poll().getEmployeeName(), e2.getEmployeeName());
        Assert.assertEquals(callcenter.getEmployees().poll().getEmployeeName(), e1.getEmployeeName());

        Assert.assertEquals(0, callcenter.getEmployees().size());

    }
}
