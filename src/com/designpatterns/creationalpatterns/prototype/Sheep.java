package com.designpatterns.creationalpatterns.prototype;

public class Sheep implements Cloneable {

    protected String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Sheep clone() throws CloneNotSupportedException {
        return (Sheep) super.clone();
    }

    public void whatsName() {
        System.out.println(this.getClass().getSimpleName() + " " + name);
    }

}