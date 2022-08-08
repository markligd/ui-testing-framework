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
    private static RunConfigurationProperties runConfigurationProperties = ConfigFactory.create(RunConfigurationProperties.class);
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
        setUpDimensions(driver);

        return driver;


    }

    private static WebDriver createFirefoxDriver() {
        if (runConfigurationProperties.seleniumVersion().isEmpty()) {
            FirefoxDriverManager.firefoxdriver().setup();
        } else {
            FirefoxDriverManager.firefoxdriver().driverVersion(runConfigurationProperties.seleniumVersion()).setup();
        }
        WebDriver driver = new FirefoxDriver();
        setUpDimensions(driver);

        return driver;


    }

    private static void setUpDimensions(WebDriver driver) {
        Dimension dimension = new Dimension(runConfigurationProperties.browserWidth(), runConfigurationProperties.browserHeight());
        driver.manage().window().setSize(dimension);
    }

    public void end() {
        System.out.println("driver is closing");
        driver.close();
    }

    public WebDriver get() {
        return driver;
    }


}
