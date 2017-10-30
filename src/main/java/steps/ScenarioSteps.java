package steps;

import cucumber.api.java.en.When;
import pages.StartPage;

public class ScenarioSteps {

    StartPage startPage = new StartPage();

    @When("^пользователь нажимает на кнопку Кредит")
    public void clickButtonTakeCreditStep(){
        startPage.getTakeCreditButton().isDisplayed();
    }

}
