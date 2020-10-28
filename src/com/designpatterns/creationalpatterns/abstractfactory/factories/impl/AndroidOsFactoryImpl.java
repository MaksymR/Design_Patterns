package com.designpatterns.creationalpatterns.abstractfactory.factories.impl;

import com.designpatterns.creationalpatterns.abstractfactory.components.battery.BatteryManager;
import com.designpatterns.creationalpatterns.abstractfactory.components.battery.impl.AndroidBatteryManagerImpl;
import com.designpatterns.creationalpatterns.abstractfactory.components.call.Call;
import com.designpatterns.creationalpatterns.abstractfactory.components.call.impl.AndroidCallImpl;
import com.designpatterns.creationalpatterns.abstractfactory.components.icon.Icon;
import com.designpatterns.creationalpatterns.abstractfactory.components.icon.impl.AndroidIconImpl;
import com.designpatterns.creationalpatterns.abstractfactory.components.sms.Sms;
import com.designpatterns.creationalpatterns.abstractfactory.components.sms.impl.AndroidSmsImpl;
import com.designpatterns.creationalpatterns.abstractfactory.factories.OsFactory;

public class AndroidOsFactoryImpl implements OsFactory {
    @Override
    public BatteryManager createBatteryManager() {
        return new AndroidBatteryManagerImpl();
    }

    @Override
    public Call createCall() {
        return new AndroidCallImpl();
    }

    @Override
    public Icon createIcon() {
        return new AndroidIconImpl();
    }

    @Override
    public Sms createSms() {
        return new AndroidSmsImpl();
    }
}
