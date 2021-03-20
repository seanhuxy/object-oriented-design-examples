package com.seanhu93.ood.creational.builder.computer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComputerBuilderTest {

    @Test
    public void testComputerBuilder() {

        ComputerBuilder computerBuilder = new ComputerBuilder();
        Director director = new Director();

        director.buildAppleMacbook15(computerBuilder);
        Computer macbook = computerBuilder.build();
        Assertions.assertEquals(macbook.getBrand(), "Apple");
        Assertions.assertEquals(macbook.getCpuBrand(), "Intel");
        Assertions.assertEquals(macbook.getCpuType(), "i9");
        Assertions.assertEquals(macbook.getDisplaySize(), "15 Inch");
        Assertions.assertEquals(macbook.getMemorySize(), "32GB");
        Assertions.assertEquals(macbook.getStorageSize(), "1TB");

        director.builderDellXPS(computerBuilder);
        Computer xps = computerBuilder.build();
        Assertions.assertEquals(xps.getBrand(), "Dell");
        Assertions.assertEquals(xps.getCpuBrand(), "Intel");
        Assertions.assertEquals(xps.getCpuType(), "i7");
        Assertions.assertEquals(xps.getDisplaySize(), "13 Inch");
        Assertions.assertEquals(xps.getMemorySize(), "8GB");
        Assertions.assertEquals(xps.getStorageSize(), "256GB");
    }

    @Test
    public void testComputerManualBuilder() {

        ComputerManualBuilder builder = new ComputerManualBuilder();
        Director director = new Director();

        director.buildAppleMacbook15(builder);
        ComputerManual macbook = builder.build();
        Assertions.assertEquals(macbook.getBrand(), "Apple");
        Assertions.assertEquals(macbook.getCpuBrand(), "Intel");
        Assertions.assertEquals(macbook.getCpuType(), "i9");
        Assertions.assertEquals(macbook.getDisplaySize(), "15 Inch");
        Assertions.assertEquals(macbook.getMemorySize(), "32GB");
        Assertions.assertEquals(macbook.getStorageSize(), "1TB");

        director.builderDellXPS(builder);
        ComputerManual xps = builder.build();
        Assertions.assertEquals(xps.getBrand(), "Dell");
        Assertions.assertEquals(xps.getCpuBrand(), "Intel");
        Assertions.assertEquals(xps.getCpuType(), "i7");
        Assertions.assertEquals(xps.getDisplaySize(), "13 Inch");
        Assertions.assertEquals(xps.getMemorySize(), "8GB");
        Assertions.assertEquals(xps.getStorageSize(), "256GB");
    }
}
