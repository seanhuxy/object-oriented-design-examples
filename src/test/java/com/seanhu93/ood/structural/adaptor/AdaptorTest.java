package com.seanhu93.ood.structural.adaptor;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Adaptor Design Pattern: Allows objects with incompatible interfaces to collaborate.
 */
public class AdaptorTest {

    @Test
    public void testAdaptor() {

        LegacyAwsCloudInstanceLauncher legacyAwsCloudInstanceLauncher = new LegacyAwsCloudInstanceLauncher();

        CloudInstanceLauncher awsCloudInstanceLauncherAdaptor =
                new AwsCloudInstanceLauncherAdaptor(legacyAwsCloudInstanceLauncher);

        Assertions.assertEquals(awsCloudInstanceLauncherAdaptor.launchInstance(),
                                "start instance from LegacyAwsCloudInstanceLauncher");
    }
}
