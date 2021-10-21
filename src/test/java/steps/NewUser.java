package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.CommonMethods;

public class NewUser extends CommonMethods {

    @When("Navigation and registration of a new player at moneygaming.com")
    public void navigation_and_registration_of_a_new_player_at_moneygaming_com() throws InterruptedException {
            click(getPageManager().getLoginPage().JoinNowButton);
            getSelect(getPageManager().getLoginPage().titleDD).selectByVisibleText("Mr");
            sendText(getPageManager().getLoginPage().firstNameBox,getFakeFirstName());
            sendText(getPageManager().getLoginPage().surnameBox,getFakeLastName());
            click(getPageManager().getLoginPage().tearmAndConditionsCheckBox);
            click(getPageManager().getLoginPage().bigJoinNowButton);
    }



    @Then("Validate message with the text {string} is Displayed under DOB")
    public void validate_message_with_the_text_is_displayed_under_dob(String actualErrorMessage) throws InterruptedException {
        String expectedMessage="This field is required";
        Assert.assertEquals("Messages do not match ",actualErrorMessage,expectedMessage);
    }
}
