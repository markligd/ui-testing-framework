package common;

import org.aeonbits.owner.ConfigFactory;

public class Configuration {
    public static void main(String[] args) {
        EnvironmentProperties environmentProperties = ConfigFactory.create(EnvironmentProperties.class);
        RunConfigurationProperties runConfigurationProperties = ConfigFactory.create(RunConfigurationProperties.class);


        System.out.println(runConfigurationProperties.browserHeight());
        System.out.println(runConfigurationProperties.browserName());
        System.out.println(runConfigurationProperties.browserWidth());
        System.out.println(runConfigurationProperties.seleniumVersion());

        System.out.println(environmentProperties.homePageUrl());


    }


}
