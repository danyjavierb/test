package com.danyjavierb.callcenter.model;

import com.danyjavierb.callcenter.services.Dispatcher;

public class Director extends Employee {

    public Director(Dispatcher callcenter, String name){
        super(callcenter,name,3);
    }
}
