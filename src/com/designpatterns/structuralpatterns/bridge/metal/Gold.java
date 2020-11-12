package com.designpatterns.structuralpatterns.bridge.metal;

public class Gold implements Metal {

    @Override
    public String fill() {
        return "Metal is gold.";
    }

}
