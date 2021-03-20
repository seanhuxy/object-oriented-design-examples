package com.seanhu93.ood.creational.factorymethod.cloud;

public class GcpInstanceLauncher extends InstanceLauncher {

    @Override
    protected CloudProviderClient createCloudProviderClient() {
        return new GcpCloudProviderClient();
    }
}
