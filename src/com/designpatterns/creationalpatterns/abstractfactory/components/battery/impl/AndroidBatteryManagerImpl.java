package com.designpatterns.creationalpatterns.abstractfactory.components.battery.impl;

import com.designpatterns.creationalpatterns.abstractfactory.components.battery.BatteryManager;

public class AndroidBatteryManagerImpl implements BatteryManager {
    @Override
    public void show() {
        System.out.println("You have created AndroidBatteryManager");
    }
}
