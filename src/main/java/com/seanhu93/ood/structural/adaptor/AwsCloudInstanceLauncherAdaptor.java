package com.seanhu93.ood.structural.adaptor;

public class AwsCloudInstanceLauncherAdaptor implements CloudInstanceLauncher {

    private LegacyAwsCloudInstanceLauncher legacyAwsCloudInstanceLauncher;

    public AwsCloudInstanceLauncherAdaptor(LegacyAwsCloudInstanceLauncher legacyAwsCloudInstanceLauncher) {
        this.legacyAwsCloudInstanceLauncher = legacyAwsCloudInstanceLauncher;
    }

    @Override
    public String launchInstance() {
        return legacyAwsCloudInstanceLauncher.startInstance();
    }
}
