package com.designpatterns.creationalpatterns.abstractfactory.components.call.impl;

import com.designpatterns.creationalpatterns.abstractfactory.components.call.Call;

public class AndroidCallImpl implements Call {

    @Override
    public void makeCall() {
        System.out.println("You can make a call via AndroidOS");
    }
}
