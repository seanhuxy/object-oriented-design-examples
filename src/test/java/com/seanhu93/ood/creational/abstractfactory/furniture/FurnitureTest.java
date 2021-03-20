package com.seanhu93.ood.creational.abstractfactory.furniture;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FurnitureTest {

    @Test
    public void testFurniture() {

        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        Assertions.assertEquals(furnitureFactory.createChair().getName(), "ModernChair");
        Assertions.assertEquals(furnitureFactory.createSofa().getName(), "ModernSofa");

        furnitureFactory = new VictorianFurnitureFactory();
        Assertions.assertEquals(furnitureFactory.createChair().getName(), "VictorianChair");
        Assertions.assertEquals(furnitureFactory.createSofa().getName(), "VictorianSofa");
    }
}
