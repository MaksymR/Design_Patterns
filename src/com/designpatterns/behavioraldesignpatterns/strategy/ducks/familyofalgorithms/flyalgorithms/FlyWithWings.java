package com.designpatterns.behavioraldesignpatterns.strategy.ducks.familyofalgorithms.flyalgorithms;

public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("I'm flying!!!");
    }

}
