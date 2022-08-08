package htmlelements;

import common.RunConfigurationProperties;
import io.qameta.htmlelements.WebPage;
import io.qameta.htmlelements.WebPageFactory;
import io.qameta.htmlelements.statement.RetryStatement;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import selenium.WebDriverFactory;

public class MyPageFactory {
    private static final RunConfigurationProperties runConfigurationProperties = ConfigFactory.create(RunConfigurationProperties.class);

    public <T extends WebPage> T on(Class<T> webpage) {
        WebPageFactory webPageFactory = new WebPageFactory();
        webPageFactory.property(RetryStatement.TIMEOUT_KEY, runConfigurationProperties.timeoutLong());
        return webPageFactory.get(getDriver(), webpage);
    }

    public WebDriver getDriver() {
        WebDriver driver = WebDriverFactory.get();
        return driver;
    }

}
