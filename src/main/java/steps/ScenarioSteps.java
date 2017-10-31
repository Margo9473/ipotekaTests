package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CalculatePage;
import pages.StartPage;

import static org.junit.Assert.assertTrue;
import static steps.BaseSteps.driver;

public class ScenarioSteps {

    StartPage startPage = new StartPage();
    StartSteps startSteps = new StartSteps();
    CalculatePage calculatePage = new CalculatePage();
    CalculateSteps calculateSteps = new CalculateSteps();

    @When("^пользователь нажимает на кнопку Взять кредит")
    public void checkClickButtonTake(){
        startSteps.takeCreditButton();
        assertTrue("Кнопка нажата",startPage.isElementPresent(startPage.getReadyHouse()));
    }

    @When("^пользователь нажимает на кнопку Приобретение готового жилья")
    public void clickReadyHouse(){
        startSteps.clickReadyHouseSteps();
    }
    @When("^пользователь выбирает расчитать кредит")
    public void clickCalculate() {
        startSteps.clickCalculateSteps();

        while (!driver.getTitle().equals("Домклик - Ипотека от Сбербанка Онлайн")) {
            for (String handle : driver.getWindowHandles()) {
                driver.switchTo().window(handle);
            }
        }

    }

    @When("^пользователь выбирает Купить готовую квартиру")
    public void clickCheckBoxButton() {
        calculateSteps.clickCheckBoxButtonSteps();

    }
    @When("^выбираем стоимость 6000000")
    public void fillPriceHouse(){
        calculateSteps.fillPriceHouseSteps();
    }
    @When("Сколько у меня есть")
    public void fillMoney(){
        calculateSteps.fillMoneySteps();
    }

    @When("Сколько лет?")
    public void fieldYear(){
        calculateSteps.fieldYearSteps();
    }

    @When("^Я молод")
    public void youngFamilyDiscounts(){
        calculateSteps.youngFamilyDiscountSteps();
    }

    @When("^Я получаю зп на карту сбера и Молодая семья")
    public void paidToCard(){
        calculateSteps.paidToCardSteps();
    }


    @Then("Я получу кредит на 3000000")
    public void creditConditions(){
        assertTrue(calculateSteps.creditConditionsSteps());
    }

  /*  @When("^Я молодая семья")
    public void youngFamilyDiscount(){
        calculateSteps.youngFamilyDiscountSteps();


    }
*/

}
