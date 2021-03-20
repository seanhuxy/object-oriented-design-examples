package com.seanhu93.ood.creational.builder.computer;

public class Director {

    public void buildAppleMacbook15(Builder builder) {

        builder.withBrand("Apple");
        builder.withCpuBrand("Intel");
        builder.withCpuType("i9");
        builder.withDisplaySize("15 Inch");
        builder.withMemorySize("32GB");
        builder.withStorageSize("1TB");
    }

    public void builderDellXPS(Builder builder) {

        builder.withBrand("Dell");
        builder.withCpuBrand("Intel");
        builder.withCpuType("i7");
        builder.withDisplaySize("13 Inch");
        builder.withMemorySize("8GB");
        builder.withStorageSize("256GB");
    }
}
