package com.designpatterns.behavioraldesignpatterns.strategy.ducks.familyofalgorithms.quackalgorithms;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
