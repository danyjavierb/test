package com.danyjavierb.callcenter.model;

import com.danyjavierb.callcenter.services.Dispatcher;

public class Operator extends Employee {

    public Operator(Dispatcher callcenter, String name){
        super(callcenter,name,1);
    }
}
