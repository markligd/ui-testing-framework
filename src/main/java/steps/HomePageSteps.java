package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.HomePage;

import static io.qameta.htmlelements.matcher.DisplayedMatcher.displayed;

public class HomePageSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private HomePage homePage() {
        return pageFactory.on(HomePage.class);
    }

    public HomePageSteps acceptPrivacyModal() {
        homePage().acceptPrivacyButton().waitUntil(displayed()).click();
        return this;
    }

    public HomePageSteps clickSearchButton() {
        homePage().clickSearchHeaderButton().click();

        return this;
    }

    public HomePageSteps inputSearchTerm(String term) {
        homePage().itemSearchInput().sendKeys(term);

        return this;
    }

    public HomePageSteps clickSearchIcon() {
        homePage().clickItemSearchButton().click();

        return this;
    }

}
