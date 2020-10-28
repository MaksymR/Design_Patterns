package com.designpatterns.creationalpatterns.abstractfactory.components.sms.impl;

import com.designpatterns.creationalpatterns.abstractfactory.components.sms.Sms;

public class AndroidSmsImpl implements Sms {
    @Override
    public void typeSms() {
        System.out.println("You can type the Sms via AndroidOS");
    }
}
