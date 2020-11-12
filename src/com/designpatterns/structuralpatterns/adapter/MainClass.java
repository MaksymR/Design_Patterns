package com.designpatterns.structuralpatterns.adapter;

public class MainClass {

    public static void main(String[] args) {
        Plug americanPlug = new USPlug();
        System.out.println(americanPlug.getVoltage());

        EuroPlugAdapter euroPlugAdapter = new EuroPlugAdapterImpl(americanPlug);
        System.out.println(euroPlugAdapter.getVoltage());
    }

}
