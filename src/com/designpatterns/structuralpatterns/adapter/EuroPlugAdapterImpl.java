package com.designpatterns.structuralpatterns.adapter;

public class EuroPlugAdapterImpl implements EuroPlugAdapter {

    private Plug plug;

    public EuroPlugAdapterImpl(Plug plug) {
        this.plug = plug;
    }

    @Override
    public String getVoltage() {
        return convertUSPlugToEuroPlug(plug.getVoltage());
    }

    private String convertUSPlugToEuroPlug(String plug) {
        return "The current-voltage is 240 V for the Eurozone";
    }
}
