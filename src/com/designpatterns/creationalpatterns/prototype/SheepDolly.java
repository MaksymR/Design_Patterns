package com.designpatterns.creationalpatterns.prototype;

public class SheepDolly extends Sheep {

    public SheepDolly() {
        name = "Dolly";
    }

    @Override
    public Sheep clone() throws CloneNotSupportedException {
        return (SheepDolly) super.clone();
    }

}
