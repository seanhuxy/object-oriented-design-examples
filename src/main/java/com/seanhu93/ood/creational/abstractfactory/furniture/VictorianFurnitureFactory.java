package com.seanhu93.ood.creational.abstractfactory.furniture;

public class VictorianFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }
}
