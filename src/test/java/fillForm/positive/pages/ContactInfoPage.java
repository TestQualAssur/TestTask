package fillForm.positive.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://wallet.latoken.com/tokenization/asset-tokens")
public class ContactInfoPage extends PageObject{

    @FindBy(xpath = "//input[@data-field-name='fullName']")
    WebElementFacade fullNameField;

    @FindBy(xpath = "//input[@id='wizard-asset-tokens-mobile-phone']")
    WebElementFacade mobilePhoneField;

    @FindBy(xpath = "//input[@data-field-name='email']")
    WebElementFacade emailField;

    @FindBy(xpath = "//input[@data-field-name='telegram']")
    WebElementFacade telegramField;

    @FindBy(xpath = "//button[@type='submit']")
    WebElementFacade nextButton;

    public void fillFullNameField(String fullName) {
        fullNameField.type(fullName);
    }

    public void fillMobilePhoneField(String mobilePhone) {
        mobilePhoneField.type(mobilePhone);

    }

    public void fillEmailField(String email) {
        emailField.type(email);
    }

    public void fillTelegramContactField(String telegramContact) {
        telegramField.type(telegramContact);
    }

    public void clickOnNextButton() {
        nextButton.click();
    }
}
