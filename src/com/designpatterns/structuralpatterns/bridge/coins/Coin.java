package com.designpatterns.structuralpatterns.bridge.coins;

import com.designpatterns.structuralpatterns.bridge.metal.Metal;

public abstract class Coin {

    protected Metal metal;

    public Coin(Metal metal) {
        this.metal = metal;
    }

    abstract public String mintCoin();

}
