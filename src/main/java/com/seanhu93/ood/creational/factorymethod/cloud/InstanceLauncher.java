package com.seanhu93.ood.creational.factorymethod.cloud;

public abstract class InstanceLauncher {

    protected abstract CloudProviderClient createCloudProviderClient();

    public String launchInstance() {
        CloudProviderClient cloudProviderClient = createCloudProviderClient();
        return cloudProviderClient.launchInstance();
    }
}
