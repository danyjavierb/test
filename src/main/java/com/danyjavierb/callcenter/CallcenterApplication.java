package com.danyjavierb.callcenter;

import com.danyjavierb.callcenter.model.Call;
import com.danyjavierb.callcenter.model.Director;
import com.danyjavierb.callcenter.model.Employee;
import com.danyjavierb.callcenter.model.Operator;
import com.danyjavierb.callcenter.model.Supervisor;
import com.danyjavierb.callcenter.services.Dispatcher;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CallcenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(CallcenterApplication.class, args);


        Dispatcher callcenter = new Dispatcher();
        callcenter.start();

        Employee e2 = new Operator(callcenter, "operador 2");
        Employee e3 = new Supervisor(callcenter, "supervisor 1");
        Employee e4 = new Director(callcenter, "director 1");
        Employee e1 = new Operator(callcenter, "operador 1");


        Call call1 = new Call("llamada 1");
        Call call2 = new Call("llamada 2");
        Call call3 = new Call("llamada 3");
        Call call4 = new Call("llamada 4");
        Call call5 = new Call("llamada 5");
        Call call6 = new Call("llamada 6");
        Call call7 = new Call("llamada 7");
        Call call8 = new Call("llamada 8");
        Call call9 = new Call("llamada 9");
        Call call10 = new Call("llamada 10");
        Call call11 = new Call("llamada 11");
        Call call12 = new Call("llamada 12");
        Call call13 = new Call("llamada 13");
        Call call14 = new Call("llamada 14");
        Call call15 = new Call("llamada 15");
        Call call16 = new Call("llamada 16");
        Call call17 = new Call("llamada 17");
        Call call18 = new Call("llamada 18");
        Call call19 = new Call("llamada 19");
        Call call20 = new Call("llamada 20");

        callcenter.dispatchCall(call1);
        callcenter.dispatchCall(call2);
        callcenter.dispatchCall(call3);
        callcenter.dispatchCall(call4);
        callcenter.dispatchCall(call5);
        callcenter.dispatchCall(call6);
        callcenter.dispatchCall(call7);
        callcenter.dispatchCall(call8);
        callcenter.dispatchCall(call9);
        callcenter.dispatchCall(call10);
        callcenter.dispatchCall(call11);
        callcenter.dispatchCall(call12);
        Employee e5 = new Director(callcenter, "director 2");
        Employee e6 = new Operator(callcenter, "Operator 3");
        Employee e7 = new Operator(callcenter, "Operator 4");
        Employee e8 = new Operator(callcenter, "Operator 5");
        Employee e9 = new Operator(callcenter, "Operator 6");
        Employee e10 = new Operator(callcenter, "Operator 7");
        callcenter.dispatchCall(call13);
        callcenter.dispatchCall(call14);
        callcenter.dispatchCall(call15);
        callcenter.dispatchCall(call16);
        callcenter.dispatchCall(call17);
        callcenter.dispatchCall(call18);
        callcenter.dispatchCall(call19);
        callcenter.dispatchCall(call20);


    }
}
