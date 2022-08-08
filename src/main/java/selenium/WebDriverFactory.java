package selenium;

import com.sun.javafx.fxml.PropertyNotFoundException;
import common.RunConfigurationProperties;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.FirefoxDriverManager;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverFactory {
    static RunConfigurationProperties runConfigurationProperties = ConfigFactory.create(RunConfigurationProperties.class);
    private WebDriver driver;


    public static void initialize() {

        switch (runConfigurationProperties.browserName()) {
            case "Chrome":
                createChromeDriver();
                break;

            case "Firefox":
                createFirefoxDriver();
                break;

            default:
                throw new PropertyNotFoundException("please choose in properties chrome or firefox ");

        }

    }

    private static WebDriver createChromeDriver() {
        if (runConfigurationProperties.seleniumVersion().isEmpty()) {
            ChromeDriverManager.chromedriver().setup();

        } else {
            ChromeDriverManager.chromedriver().driverVersion(runConfigurationProperties.seleniumVersion()).setup();
        }
        WebDriver driver = new ChromeDriver();
        Dimension dimension = new Dimension(runConfigurationProperties.browserWidth(), runConfigurationProperties.browserHeight());
        driver.manage().window().setSize(dimension);
        return driver;


    }

    private static WebDriver createFirefoxDriver() {
        if (runConfigurationProperties.seleniumVersion().isEmpty()) {
            FirefoxDriverManager.firefoxdriver().setup();
        } else {
            FirefoxDriverManager.firefoxdriver().driverVersion(runConfigurationProperties.seleniumVersion()).setup();
        }
        WebDriver driver = new FirefoxDriver();
        Dimension dimension = new Dimension(runConfigurationProperties.browserWidth(), runConfigurationProperties.browserHeight());
        driver.manage().window().setSize(dimension);
        return driver;


    }

    public void end() {
        System.out.println("driver is closing");
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public static void main(String[] args) {
        initialize();

    }


}
