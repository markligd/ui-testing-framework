import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import selenium.WebDriverFactory;
import steps.OpenPageSteps;

public class TestTest {

    @BeforeEach
    public void baseTest() {
        WebDriverFactory.initialize();

    }


    @Test
    public void test1() {

        new OpenPageSteps()
                .openHomepage()
                .acceptPrivacyModal()
                .clickSearchButton()
                .inputSearchTerm("0119_5091_851")
                .clickSearchIcon();
    }


    @AfterEach
    public void close(){
        WebDriverFactory.end();
    }
}


