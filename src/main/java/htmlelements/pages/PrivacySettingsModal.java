package htmlelements.pages;

import htmlelements.ExtendedMyWebElement;
import io.qameta.htmlelements.annotation.Description;
import io.qameta.htmlelements.annotation.FindBy;


public interface PrivacySettingsModal {

    @Description("Accept privacy settings")
    @FindBy("//*[@id=\"modal-ember29\"]/div/div[2]/button[1]")
    ExtendedMyWebElement acceptPrivacySettings();
}
