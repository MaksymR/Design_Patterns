package com.designpatterns.creationalpatterns.abstractfactory.factories;

import com.designpatterns.creationalpatterns.abstractfactory.components.battery.BatteryManager;
import com.designpatterns.creationalpatterns.abstractfactory.components.call.Call;
import com.designpatterns.creationalpatterns.abstractfactory.components.icon.Icon;
import com.designpatterns.creationalpatterns.abstractfactory.components.sms.Sms;

public interface OsFactory {

    BatteryManager createBatteryManager();

    Call createCall();

    Icon createIcon();

    Sms createSms();

}
