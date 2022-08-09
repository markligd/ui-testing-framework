package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

public interface SearchSidebar {

//Search process

    @Description("Search header button")
    @FindBy("//*[@id=\"main-header\"]/div/div[1]/ul/li[2]")
    ExtendedMyWebElement searchHeaderButton();

    @Description("Item search input")
    @FindBy("//*[@id=\"modal-ember571\"]/div/div[2]/form/div[1]")
    ExtendedMyWebElement itemSearchInput();

    @Description("Item search button")
    @FindBy("//*[@id=\"modal-ember571\"]/div/div[2]/form/button")
    ExtendedMyWebElement itemSearchButton();

//Others


    @Description("Cart Button")
    @FindBy("//*[@id=\"main-header\"]/div/div[1]/ul/li[5]")
    ExtendedMyWebElement cartButton();

    @Description("Account Icon")
    @FindBy("//*[@id=\"main-header\"]/div/div[1]/ul/li[3]")
    ExtendedMyWebElement accountIcon();


}
