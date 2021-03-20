package com.seanhu93.ood.creational.factorymethod.logistics;

public class SeaLogistics extends Logistics {

    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
