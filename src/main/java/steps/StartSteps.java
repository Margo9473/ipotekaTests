package steps;

import pages.StartPage;
import ru.yandex.qatools.allure.annotations.Step;

public class StartSteps {

    StartPage startPage = new StartPage();

    @Step("Нажатие на кнопку")
    public void takeCreditButton() {
        startPage.getTakeCreditButton().click();
    }

    @Step("Нажатие на кнопку")
    public void clickReadyHouseSteps(){
        startPage.click(startPage.getReadyHouse());
    }
    @Step("Нажатие на кнопку калькулятор")
    public void clickCalculateSteps(){
        startPage.click(startPage.getCalculate());
    }


}
