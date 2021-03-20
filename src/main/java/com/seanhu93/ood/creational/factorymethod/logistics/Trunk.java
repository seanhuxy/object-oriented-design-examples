package com.seanhu93.ood.creational.factorymethod.logistics;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Trunk implements Transport {

    @Override
    public String deliver() {
        return "Deliver by trunk";
    }
}
