package com.designpatterns.creationalpatterns.abstractfactory.app;

import com.designpatterns.creationalpatterns.abstractfactory.components.battery.BatteryManager;
import com.designpatterns.creationalpatterns.abstractfactory.components.call.Call;
import com.designpatterns.creationalpatterns.abstractfactory.components.icon.Icon;
import com.designpatterns.creationalpatterns.abstractfactory.components.sms.Sms;
import com.designpatterns.creationalpatterns.abstractfactory.factories.OsFactory;

public class Application {

    private BatteryManager batteryManager;
    private Call call;
    private Icon icon;
    private Sms sms;

    public Application(OsFactory osFactory) {
        this.batteryManager = osFactory.createBatteryManager();
        this.call = osFactory.createCall();
        this.icon = osFactory.createIcon();
        this.sms = osFactory.createSms();
    }

    public void show() {
        batteryManager.show();
        icon.show();
    }

    public void makeCall() {
        call.makeCall();
    }

    public void typeSms() {
        sms.typeSms();
    }

}
