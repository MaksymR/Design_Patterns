package com.designpatterns.structuralpatterns.bridge;

import com.designpatterns.structuralpatterns.bridge.coins.Coin;
import com.designpatterns.structuralpatterns.bridge.coins.FiftyCoin;
import com.designpatterns.structuralpatterns.bridge.coins.OneCoin;
import com.designpatterns.structuralpatterns.bridge.coins.TenCoin;
import com.designpatterns.structuralpatterns.bridge.metal.Copper;
import com.designpatterns.structuralpatterns.bridge.metal.Gold;
import com.designpatterns.structuralpatterns.bridge.metal.Silver;

public class MainClass {

    public static void main(String[] args) {

        Coin oneCopperCoin = new OneCoin(new Copper());
        System.out.println(oneCopperCoin.mintCoin());
        Coin oneSilverCoin = new OneCoin(new Silver());
        System.out.println(oneSilverCoin.mintCoin());
        Coin oneGoldCoin = new OneCoin(new Gold());
        System.out.println(oneGoldCoin.mintCoin());
        System.out.println();

        Coin tenSilverCoin = new TenCoin(new Silver());
        System.out.println(tenSilverCoin.mintCoin());
        System.out.println();

        Coin fiftyGoldCoin = new FiftyCoin(new Gold());
        System.out.println(fiftyGoldCoin.mintCoin());

    }

}