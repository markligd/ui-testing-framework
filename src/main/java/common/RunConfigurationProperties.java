package common;


import org.aeonbits.owner.Config;
import org.aeonbits.owner.Config.Sources;

@Sources({"file:./src/main/resources/runConfiguration.properties"})
public interface RunConfigurationProperties extends Config {

    @Key("browser.name")
    String browserName();

    @Key("browser.width")
    int browserWidth();

    @Key("browser.height")
    int browserHeight();

    @Key("selenium.version")
    String seleniumVersion();

    @Key("timeout.long")
    String timeoutLong();

    @Key("timeout.short")
    String timeoutShort();

}
