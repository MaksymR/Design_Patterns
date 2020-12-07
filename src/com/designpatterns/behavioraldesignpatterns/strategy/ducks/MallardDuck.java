package com.designpatterns.behavioraldesignpatterns.strategy.ducks;

import com.designpatterns.behavioraldesignpatterns.strategy.ducks.familyofalgorithms.flyalgorithms.FlyWithWings;
import com.designpatterns.behavioraldesignpatterns.strategy.ducks.familyofalgorithms.quackalgorithms.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real Mallard duck");
    }

}
