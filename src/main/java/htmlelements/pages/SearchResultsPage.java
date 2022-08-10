package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import htmlelements.ExtendedWebPage;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;

import java.util.List;

public interface SearchResultsPage extends ExtendedWebPage {

    @Description("Search of items results page")
    @FindBy("div.qa-search-results-list > div")
    List<ExtendedMyWebElement> searchResultList();



}
