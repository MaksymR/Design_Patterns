package com.designpatterns.creationalpatterns.abstractfactory.components.icon.impl;

import com.designpatterns.creationalpatterns.abstractfactory.components.icon.Icon;

public class AndroidIconImpl implements Icon {

    @Override
    public void show() {
        System.out.println("You have created AndroidIcon");
    }

}
