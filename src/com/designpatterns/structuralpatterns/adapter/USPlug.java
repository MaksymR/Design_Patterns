package com.designpatterns.structuralpatterns.adapter;

public class USPlug implements Plug {
    @Override
    public String getVoltage() {
        return "The current-voltage is 120 V for the U.S.";
    }
}
