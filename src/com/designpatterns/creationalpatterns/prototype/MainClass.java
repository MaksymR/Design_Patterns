package com.designpatterns.creationalpatterns.prototype;

public class MainClass {

    public static void main(String[] args) throws CloneNotSupportedException {
        Sheep dolly = new SheepDolly();
        dolly.whatsName();

        Sheep dollyClone = dolly.clone();
        dollyClone.whatsName();

        System.out.println();
        System.out.println("Test change name and result");
        dolly.setName("Kazka");
        dolly.whatsName();
        dollyClone.whatsName();

    }

}
