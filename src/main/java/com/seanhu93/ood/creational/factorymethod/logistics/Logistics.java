package com.seanhu93.ood.creational.factorymethod.logistics;

public abstract class Logistics {

    public abstract Transport createTransport();

    public String planDelivery() {
        Transport transport = createTransport();
        return transport.deliver();
    }
}
