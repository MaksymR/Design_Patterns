package com.designpatterns.creationalpatterns.builder.builders.burgerbuilders;

public class CheeseBurgerBuilder extends BurgerBuilder {
    @Override
    public void buildBun() {
        burger.setBun("Whit Bread");
    }

    @Override
    public void buildMeat() {
        burger.setMeat("Beef");
    }

    @Override
    public void buildSalad() {
        burger.setSalad("Lettuce");
    }

    @Override
    public void buildCheese() {
        burger.setCheese("American Cheese");
    }

    @Override
    public void buildSauce() {
        burger.setSauce("Ketchup");
    }
}
