package com.designpatterns.structuralpatterns.bridge.metal;

public class Copper implements Metal {

    @Override
    public String fill() {
        return "Metal is copper.";
    }

}