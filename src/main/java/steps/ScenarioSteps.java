package steps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CalculatePage;
import pages.StartPage;
import static steps.BaseSteps.driver;

public class ScenarioSteps {

    StartPage startPage = new StartPage();
    StartSteps startSteps = new StartSteps();
    CalculatePage calculatePage = new CalculatePage();
    CalculateSteps calculateSteps = new CalculateSteps();

    @When("^пользователь нажимает на кнопку Взять кредит")
    public void checkClickButtonTake(){
        startSteps.takeCreditButton();
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

    @When("^Я получаю зп на карту")
    public void paidToCards(){
        calculateSteps.paidToCardSteps();
    }

    @When("^Я молодая семья")
    public void youngFamilyDiscount(){
        calculateSteps.youngFamilyDiscountSteps();
    }

    @Then("^Я получу кредит на 3000000$")
    public void creditConditions(){
        calculateSteps.creditConditionsSteps();
    }

    @Then("^Ежемесячный платеж составит 37841$")
    public void monthlyPayment(){
        calculateSteps.monthlyPaymentSteps();
    }
    @Then("^Процентная ставка 8.9$")
    public void rade(){
        calculateSteps.radeSteps();
    }


}
