package com.seanhu93.ood.creational.builder.computer;

public class ComputerBuilder implements Builder {

    private String brand;
    private String cpuType;
    private String cpuBrand;
    private String memorySize;
    private String storageSize;
    private String displaySize;

    @Override
    public Builder withBrand(String brand) {
        this.brand = brand;
        return this;
    }

    @Override
    public Builder withCpuType(String cpuType) {
        this.cpuType = cpuType;
        return this;
    }

    @Override
    public Builder withCpuBrand(String cpuBrand) {
        this.cpuBrand = cpuBrand;
        return this;
    }

    @Override
    public Builder withMemorySize(String memorySize) {
        this.memorySize = memorySize;
        return this;
    }

    @Override
    public Builder withStorageSize(String storageSize) {
        this.storageSize = storageSize;
        return this;
    }

    @Override
    public Builder withDisplaySize(String displaySize) {
        this.displaySize = displaySize;
        return this;
    }

    public Computer build() {
        Computer c = new Computer();
        c.setBrand(brand);
        c.setCpuBrand(cpuBrand);
        c.setCpuType(cpuType);
        c.setDisplaySize(displaySize);
        c.setMemorySize(memorySize);
        c.setStorageSize(storageSize);
        return c;
    }
}
