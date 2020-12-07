package com.designpatterns.behavioraldesignpatterns.strategy.ducks.familyofalgorithms.quackalgorithms;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
