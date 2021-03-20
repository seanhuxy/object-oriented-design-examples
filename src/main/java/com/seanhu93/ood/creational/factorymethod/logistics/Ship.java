package com.seanhu93.ood.creational.factorymethod.logistics;

public class Ship implements Transport {

    @Override
    public String deliver() {
        return "Deliver by ship";
    }
}
