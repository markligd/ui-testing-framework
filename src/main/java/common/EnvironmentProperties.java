package common;

import org.aeonbits.owner.Config;


@Config.Sources({"file:./src/main/resources/environment.properties"})
public interface EnvironmentProperties extends Config {

    @Key("homepage.url")
    String homePageUrl();

}
