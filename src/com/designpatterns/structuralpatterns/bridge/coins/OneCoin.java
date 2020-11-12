package com.designpatterns.structuralpatterns.bridge.coins;

import com.designpatterns.structuralpatterns.bridge.metal.Metal;

public class OneCoin extends Coin {


    public OneCoin(Metal metal) {
        super(metal);
    }

    @Override
    public String mintCoin() {
        return "OneCoin was minted. " + metal.fill();
    }

}
