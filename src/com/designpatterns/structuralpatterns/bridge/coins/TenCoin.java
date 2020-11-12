package com.designpatterns.structuralpatterns.bridge.coins;

import com.designpatterns.structuralpatterns.bridge.metal.Metal;

public class TenCoin extends Coin {

    public TenCoin(Metal metal) {
        super(metal);
    }

    @Override
    public String mintCoin() {
        return "TenCoin was minted. " + metal.fill();
    }

}
