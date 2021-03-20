package com.seanhu93.ood.creational.builder.computer;

public interface Builder {

    Builder withBrand(String brand);

    Builder withCpuType(String cpuType);

    Builder withCpuBrand(String cpuBrand);

    Builder withMemorySize(String memorySize);

    Builder withStorageSize(String storageSize);

    Builder withDisplaySize(String displaySize);
}
