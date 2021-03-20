package com.seanhu93.ood.creational.factorymethod.logistics;

public class RoadLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Trunk();
    }
}
