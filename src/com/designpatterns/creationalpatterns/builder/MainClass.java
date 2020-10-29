package com.designpatterns.creationalpatterns.builder;

import com.designpatterns.creationalpatterns.builder.builders.burgerbuilders.CheeseBurgerBuilder;
import com.designpatterns.creationalpatterns.builder.builders.burgerbuilders.ChickenBurgerBuilder;
import com.designpatterns.creationalpatterns.builder.directors.McDonaldsRestorant;
import com.designpatterns.creationalpatterns.builder.menuitems.burgers.Burger;

public class MainClass {

    public static void main(String[] args) {

        McDonaldsRestorant mcDonaldsRestorant = new McDonaldsRestorant();
        mcDonaldsRestorant.setBuilder(new CheeseBurgerBuilder());
        buildBurger(mcDonaldsRestorant);
        mcDonaldsRestorant.setBuilder(new ChickenBurgerBuilder());
        buildBurger(mcDonaldsRestorant);

    }

    private static void buildBurger(McDonaldsRestorant mcDonaldsRestorant) {

        Burger burger = mcDonaldsRestorant.buildBurger();
        burger.print();

    }

}
