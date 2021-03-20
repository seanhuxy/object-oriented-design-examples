package com.seanhu93.ood.creational.factorymethod.cloud;

public class AwsInstanceLauncher extends InstanceLauncher {

    @Override
    protected CloudProviderClient createCloudProviderClient() {
        return new AwsCloudProviderClient();
    }
}
