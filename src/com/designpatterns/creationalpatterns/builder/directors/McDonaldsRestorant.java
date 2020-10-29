package com.designpatterns.creationalpatterns.builder.directors;

import com.designpatterns.creationalpatterns.builder.builders.burgerbuilders.BurgerBuilder;
import com.designpatterns.creationalpatterns.builder.menuitems.burgers.Burger;

public class McDonaldsRestorant {

    private BurgerBuilder burgerBuilder;

    public void setBuilder(BurgerBuilder burgerBuilder) {

        this.burgerBuilder = burgerBuilder;

    }

    public Burger buildBurger() {

        burgerBuilder.buildBun();
        burgerBuilder.buildMeat();
        burgerBuilder.buildSalad();
        burgerBuilder.buildCheese();
        burgerBuilder.buildSauce();
        return burgerBuilder.build();

    }

}
