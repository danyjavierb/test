package com.danyjavierb.callcenter.model;

import com.danyjavierb.callcenter.services.Dispatcher;

public class Supervisor extends Employee {

    public Supervisor(Dispatcher callcenter, String name){
        super(callcenter,name,2);
    }
}
