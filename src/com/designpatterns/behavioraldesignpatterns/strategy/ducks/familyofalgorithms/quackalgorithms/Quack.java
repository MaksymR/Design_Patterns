package com.designpatterns.behavioraldesignpatterns.strategy.ducks.familyofalgorithms.quackalgorithms;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack");
    }
}
