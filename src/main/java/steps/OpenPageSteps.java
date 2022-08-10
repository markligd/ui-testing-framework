package steps;

import common.EnvironmentProperties;
import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;
import org.aeonbits.owner.ConfigFactory;

public class OpenPageSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();
    private static final EnvironmentProperties environmentProperties = ConfigFactory.create(EnvironmentProperties.class);

    private HomePage homePage() {
        return pageFactory.on(HomePage.class);
    }

    public HomePageSteps openHomepage() {
        homePage().open(environmentProperties.homePageUrl());
        return new HomePageSteps();


    }


}
