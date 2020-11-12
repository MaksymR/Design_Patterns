package com.designpatterns.structuralpatterns.bridge.coins;

import com.designpatterns.structuralpatterns.bridge.metal.Metal;

public class FiftyCoin extends Coin {

    public FiftyCoin(Metal metal) {
        super(metal);
    }

    @Override
    public String mintCoin() {
        return "FiftyCoin was minted. " + metal.fill();
    }

}