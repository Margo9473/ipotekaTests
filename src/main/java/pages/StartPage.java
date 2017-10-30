package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends BasePage {


    @FindBy(xpath = "(//SPAN[@class='multiline'])[1]")
    WebElement takeCreditButton;

    @FindBy(xpath = "(//ul[@class='alt-menu-list']/li/a[text()='Приобретение готового жилья'])[1]")
    WebElement readyHouse;

    @FindBy(xpath = "//div[@class='sbrf-rich-outer']//span[text()='Рассчитать']")
    WebElement calculate;

    public StartPage(){
        PageFactory.initElements(driver, this);
    }

    public WebElement getReadyHouse() {
        return readyHouse;
    }

    public WebElement getTakeCreditButton() {
        return takeCreditButton;
    }

    public WebElement getCalculate() {
        return calculate;
    }
}


