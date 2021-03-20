package com.seanhu93.ood.creational.factorymethod.cloud;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LaunchInstanceTest {

    @Test
    public void testLaunchInstance() {

        InstanceLauncher instanceLauncher = new AwsInstanceLauncher();
        Assertions.assertEquals(instanceLauncher.launchInstance(), "Launched an instance from AWS");

        instanceLauncher = new GcpInstanceLauncher();
        Assertions.assertEquals(instanceLauncher.launchInstance(), "Launched an instance from GCP");
    }
}
