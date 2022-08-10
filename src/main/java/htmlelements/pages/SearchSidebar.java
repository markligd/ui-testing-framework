package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface SearchSidebar extends ExtendedWebPage {

//Search process

    @Description("Search header button")
    @FindBy("//*[@id=\"main-header\"]/div/div[1]/ul/li[2]")
    ExtendedMyWebElement clickSearchHeaderButton();

    @Description("Item search input")
    @FindBy("//*[@id=\"modal-ember571\"]/div/div[2]/form/div[1]")
    ExtendedMyWebElement itemSearchInput();

    @Description("Item search button")
    @FindBy("//*[@id=\"modal-ember571\"]/div/div[2]/form/button")
    ExtendedMyWebElement clickItemSearchButton();

//Others


    @Description("Cart Button")
    @FindBy("//*[@id=\"main-header\"]/div/div[1]/ul/li[5]")
    ExtendedMyWebElement clickCartButton();

    @Description("Account Icon")
    @FindBy("//*[@id=\"main-header\"]/div/div[1]/ul/li[3]")
    ExtendedMyWebElement clickAccountIcon();


}
