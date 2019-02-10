package fillForm.positive;

import fillForm.positive.steps.NavigatingUser;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenFillingEveryFieldsOnFormsByAssetTokens {

    @Steps
    NavigatingUser user;

    @Managed
    WebDriver driver;

    @Test
    public void should_see_page_with_thank_you(){

        user.select_section_asset_tokens();
        user.filling_contact_info_form();
        user.filling_project_info_form();
        //user.verify_is_page_thank_you_is_displayed();
    }
}
