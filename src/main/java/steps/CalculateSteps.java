package steps;

import org.openqa.selenium.By;
import pages.CalculatePage;
import ru.yandex.qatools.allure.annotations.Step;

public class CalculateSteps {

    CalculatePage calculatePage = new CalculatePage();

    @Step("Нажатие на Купить готовое жилье")
    public void clickCheckBoxButtonSteps(){
        calculatePage.click(calculatePage.getCheckBoxButton());
        calculatePage.click(calculatePage.getToBuyReadyHoume());

    }
    @Step("Выбор стоимости жилья")
    public void fillPriceHouseSteps(){
        calculatePage.click(calculatePage.getPriceHouse());
        calculatePage.clearFieldAndSendCase(calculatePage.getPriceHouse(),"6000000");


    }

    @Step("Сколько у меня есть")
    public void fillMoneySteps(){
        calculatePage.click(calculatePage.getFillMoney());
        calculatePage.clearFieldAndSendCase(calculatePage.getFillMoney(), "3000000");
    }

    @Step("Сколько лет")
    public void fieldYearSteps(){
        calculatePage.click(calculatePage.getFieldYear());
        calculatePage.clearFieldYearAndSend(calculatePage.getFieldYear(),"10");
    }

    @Step("Я получаю зп на карту сбера")
    public void paidToCardSteps(){
        if(!calculatePage.getPaidToCard().isSelected()){
            calculatePage.click(calculatePage.getPaidToCard().findElement(By.xpath("./../div[2]")));
        }

    }
    @Step("^Я молод")
    public void youngFamilyDiscountSteps(){
        if(!calculatePage.getYoungFamilyDiscount().isSelected()){
            calculatePage.click(calculatePage.getYoungFamilyDiscount().findElement(By.xpath("./../div[2]")));
        }
    }

   /* @Step("Я молодая семья")
    public void youngFamilyDiscountSteps(){
        if(!calculatePage.getYoungFamilyDiscount().isSelected()){
            calculatePage.click(calculatePage.getYoungFamilyDiscount().findElement(By.xpath("./../div[2]")));
        }
    }
*/
    @Step("условия кредитования")
    public boolean creditConditionsSteps(){
        if (calculatePage.getAmountOfCredit().getText().equals("3000000 \u20BD")){
            return true;
        }
            return false;
    }
}
