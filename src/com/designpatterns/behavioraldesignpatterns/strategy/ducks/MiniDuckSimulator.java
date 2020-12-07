package com.designpatterns.behavioraldesignpatterns.strategy.ducks;

import com.designpatterns.behavioraldesignpatterns.strategy.ducks.familyofalgorithms.flyalgorithms.FlyRocketPowered;

public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        System.out.println("A mallard duck:");
        mallard.performQuack();
        mallard.perfomFly();
        System.out.println();

        Duck model = new ModelDuck();
        System.out.println("A model duck:");
        model.performQuack();
        model.perfomFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.perfomFly();
    }

}
