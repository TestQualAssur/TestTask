package fillForm.positive.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://wallet.latoken.com/tokenization/")
public class TokenizationPage extends PageObject {

    @FindBy(xpath = "//div[@class='tokenizationBlocks___1w8x']/div[3]")
    WebElementFacade assetSection;

    public void selectAssetTokensSection() {
        assetSection.isClickable();
        assetSection.click();
    }
}
