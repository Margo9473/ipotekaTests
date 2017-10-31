package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StartPage extends BasePage {


    @FindBy(xpath = "(//SPAN[@class='multiline'])[1]")
    WebElement takeCreditButton;

    @FindBy(xpath = "(//A[@class='kit-link kit-link_color_black alt-menu-list__link alt-menu-list__link_level_2'])[6]")
    WebElement readyHouse;

    @FindBy(xpath = "(.//div[@class='sbrf-rich-outer']//a/span)[1]/..")
    WebElement calculate;


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


