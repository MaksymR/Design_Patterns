package com.designpatterns.behavioraldesignpatterns.strategy.ducks;

import com.designpatterns.behavioraldesignpatterns.strategy.ducks.familyofalgorithms.flyalgorithms.FlyBehavior;
import com.designpatterns.behavioraldesignpatterns.strategy.ducks.familyofalgorithms.quackalgorithms.QuackBehavior;

public abstract class Duck {

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void perfomFly() {
        flyBehavior.fly();
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior fb) {
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }

    public void swim() {
        System.out.println("All ducks float, even decoys");
    }

}
