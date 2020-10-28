package com.designpatterns.creationalpatterns.abstractfactory.components.icon.impl;

import com.designpatterns.creationalpatterns.abstractfactory.components.icon.Icon;

public class IosIconImpl implements Icon {
    @Override
    public void show() {
        System.out.println("You have crated the IOSIcon");
    }
}
