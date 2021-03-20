package com.seanhu93.ood.creational.factorymethod.cloud;

public class AwsCloudProviderClient implements CloudProviderClient {

    @Override
    public String launchInstance() {
        return "Launched an instance from AWS";
    }
}
