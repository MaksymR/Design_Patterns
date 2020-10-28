package com.designpatterns.creationalpatterns.abstractfactory.factories.impl;

import com.designpatterns.creationalpatterns.abstractfactory.components.battery.BatteryManager;
import com.designpatterns.creationalpatterns.abstractfactory.components.battery.impl.IosBatteryManager;
import com.designpatterns.creationalpatterns.abstractfactory.components.call.Call;
import com.designpatterns.creationalpatterns.abstractfactory.components.call.impl.IosCallImpl;
import com.designpatterns.creationalpatterns.abstractfactory.components.icon.Icon;
import com.designpatterns.creationalpatterns.abstractfactory.components.icon.impl.IosIconImpl;
import com.designpatterns.creationalpatterns.abstractfactory.components.sms.Sms;
import com.designpatterns.creationalpatterns.abstractfactory.components.sms.impl.IosSmsImpl;
import com.designpatterns.creationalpatterns.abstractfactory.factories.OsFactory;

public class IosOsFactory implements OsFactory {
    @Override
    public BatteryManager createBatteryManager() {
        return new IosBatteryManager();
    }

    @Override
    public Call createCall() {
        return new IosCallImpl();
    }

    @Override
    public Icon createIcon() {
        return new IosIconImpl();
    }

    @Override
    public Sms createSms() {
        return new IosSmsImpl();
    }
}
