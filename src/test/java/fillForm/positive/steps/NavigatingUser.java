package fillForm.positive.steps;

import fillForm.positive.pages.ContactInfoPage;
import fillForm.positive.pages.ProjectInfoPage;
import fillForm.positive.pages.TokenizationPage;
import net.thucydides.core.annotations.Step;
import org.apache.commons.lang3.RandomStringUtils;

public class NavigatingUser {

    TokenizationPage tokenizationPage;
    ContactInfoPage contactInfoPage;
    ProjectInfoPage projectInfoPage;

    @Step
    public void select_section_asset_tokens() {
        tokenizationPage.open();
        tokenizationPage.selectAssetTokensSection();
    }

    @Step
    public void filling_contact_info_form() {

        contactInfoPage.shouldBeDisplayed();
        contactInfoPage.fillFullNameField(RandomStringUtils.randomAlphabetic(6));
        contactInfoPage.fillMobilePhoneField(RandomStringUtils.randomNumeric(5));
        contactInfoPage.fillEmailField(RandomStringUtils.randomAlphabetic(6)+"@mail.ru");
        contactInfoPage.fillTelegramContactField(RandomStringUtils.randomAlphabetic(6));
        contactInfoPage.clickOnNextButton();
    }

    @Step
    public void filling_project_info_form() {

        projectInfoPage.shouldBeDisplayed();
        projectInfoPage.fillProjectNameField(RandomStringUtils.randomAlphabetic(6));
        projectInfoPage.fillProjectWebsiteField(RandomStringUtils.randomAlphabetic(6)+".com");
        projectInfoPage.selectAssetType(1);
        projectInfoPage.fillProjectIndustry(RandomStringUtils.randomAlphabetic(6));
        projectInfoPage.fillProjectDescriptionField(RandomStringUtils.randomAlphabetic(10));
        projectInfoPage.fillPlansField(RandomStringUtils.randomAlphabetic(10));
        projectInfoPage.fillValuation(RandomStringUtils.randomNumeric(3));
        projectInfoPage.fillTokenizationFieldInPercent(RandomStringUtils.randomNumeric(2));
        projectInfoPage.selectSettlementTerm(3);
        projectInfoPage.clickOnSubmitRequestButton();
    }
}
