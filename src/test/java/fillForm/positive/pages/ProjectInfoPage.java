package fillForm.positive.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProjectInfoPage extends PageObject{

    @FindBy(xpath = "//input[@data-field-name='projectName']")
    WebElementFacade projectNameField;

    @FindBy(xpath = "//input[@data-field-name='projectWebsite']")
    WebElementFacade projectWebsiteField;

    @FindBy(xpath = "//input[@data-field-name='projectIndustry']")
    WebElementFacade projectIndustryField;

    @FindBy(xpath = "//textarea[@data-field-name='projectDescription']")
    WebElementFacade projectDescriptionField;

    @FindBy(xpath = "//textarea[@data-field-name='planToUse']")
    WebElementFacade planField;

    @FindBy(xpath = "//input[@data-field-name='assetTokenValuation']")
    WebElementFacade valuationField;

    @FindBy(xpath = "//input[@id='wizard-art-work-fund-raising-target']")
    WebElementFacade tokenizationField;

    @FindBy(xpath = "//div[@data-field-name='assetType']")
    WebElementFacade assetTypeField;

    @FindBy(xpath = "//div[@data-field-name='settlementTerm']")
    WebElementFacade settlementTermField;

    @FindBy(xpath = "//button[@id='submit-request']")
    WebElementFacade submitRequestButton;

    By assetType = By.xpath("//body/div[3]/div/div/div/ul/li");

    By settlementTerm = By.xpath("//body/div[4]/div/div/div/ul/li");

    public void fillProjectNameField(String projectName) {
        projectNameField.type(projectName);
    }

    public void fillProjectWebsiteField(String projectWebsite) {
        projectWebsiteField.type(projectWebsite);
    }

    public void fillProjectIndustry(String projectIndustry) {
        projectIndustryField.type(projectIndustry);
    }

    public void fillProjectDescriptionField(String projectDescritpion) {
        projectDescriptionField.type(projectDescritpion);
    }

    public void fillPlansField(String plans) {
        planField.type(plans);
    }

    public void fillValuation(String value) {
        valuationField.type(value);
    }

    public void fillTokenizationFieldInPercent(String tokenization) {
        tokenizationField.type(tokenization);
    }

    public void selectAssetType(int indexFromList) {

       assetTypeField.click();
       selectAssetTypeFromDropDownList(indexFromList);
    }

    private void selectAssetTypeFromDropDownList(int i){
        List<WebElementFacade> list = findAll(assetType);
        list.get(i).click();
    }

    public void selectSettlementTerm(int indexFromList) {

        settlementTermField.click();
        selectSettlementTermFromDropDownList(indexFromList);
    }

    private void selectSettlementTermFromDropDownList(int i){
        List<WebElementFacade> list = findAll(settlementTerm);
        list.get(i).click();
    }

    public void clickOnSubmitRequestButton() {
        submitRequestButton.click();
    }
}
