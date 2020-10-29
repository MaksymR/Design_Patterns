package com.designpatterns.creationalpatterns.builder.builders.burgerbuilders;

import com.designpatterns.creationalpatterns.builder.menuitems.burgers.Burger;

public abstract class BurgerBuilder {

    Burger burger = new Burger();

    public abstract void buildBun();

    public abstract void buildMeat();

    public abstract void buildSalad();

    public abstract void buildCheese();

    public abstract void buildSauce();

    public Burger build() {
        return burger;
    }

}
