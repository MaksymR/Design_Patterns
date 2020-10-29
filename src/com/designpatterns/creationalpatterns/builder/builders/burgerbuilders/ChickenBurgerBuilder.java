package com.designpatterns.creationalpatterns.builder.builders.burgerbuilders;

public class ChickenBurgerBuilder extends BurgerBuilder {
    @Override
    public void buildBun() {
        burger.setBun("Bread Borodino");
    }

    @Override
    public void buildMeat() {
        burger.setMeat("Chicken");
    }

    @Override
    public void buildSalad() {
        burger.setSalad("Tomato and lettuce");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("Holland cheese");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Garlic sauce");
    }

}
