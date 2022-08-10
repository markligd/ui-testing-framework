package steps;

import htmlelements.MyPageFactory;
import htmlelements.MyPageFactoryProvider;
import htmlelements.pages.SearchResultsPage;

public class SearchResultsPageSteps {
    private static MyPageFactory pageFactory = MyPageFactoryProvider.getInstance();

    private SearchResultsPage searchResultsPage() {
        return pageFactory.on(SearchResultsPage.class);
    }


}
