package com.designpatterns.behavioraldesignpatterns.strategy.ducks;

import com.designpatterns.behavioraldesignpatterns.strategy.ducks.familyofalgorithms.flyalgorithms.FlyNoWay;
import com.designpatterns.behavioraldesignpatterns.strategy.ducks.familyofalgorithms.quackalgorithms.Quack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }

}
