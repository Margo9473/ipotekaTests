package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CalculatePage extends BasePage {

    @FindBy(id = "productButton")
    WebElement checkBoxButton;

    @FindBy(id = "estateCost")
    WebElement priceHouse;

    @FindBy(xpath = "//*[@id='productPopover']/div[text()='Купить готовую квартиру']")
    WebElement toBuyReadyHoume;

    @FindBy(id = "initialFee")
    WebElement fillMoney;

    @FindBy(id = "creditTerm")
    WebElement fieldYear;

    @FindBy(id = "paidToCard")
    WebElement paidToCard;

    @FindBy(id ="youngFamilyDiscount")
    WebElement youngFamilyDiscount;

    @FindBy(id ="amountOfCredit")
    WebElement amountOfCredit;

    @FindBy(id = "monthlyPayment")
    WebElement monthlyPayment;

    @FindBy(id = "rate")
    WebElement rate;

    public WebElement getCheckBoxButton() {
        return checkBoxButton;
    }

    public WebElement getToBuyReadyHoume() {
        return toBuyReadyHoume;
    }

    public WebElement getPriceHouse() {
        return priceHouse;
    }

    public WebElement getFillMoney() {
        return fillMoney;
    }

    public WebElement getFieldYear() {
        return fieldYear;
    }

    public WebElement getPaidToCard() {
        return paidToCard;
    }

    public WebElement getYoungFamilyDiscount() {
        return youngFamilyDiscount;
    }

    public WebElement getAmountOfCredit() {
        return amountOfCredit;
    }

    public WebElement getMonthlyPayment() {
        return monthlyPayment;
    }

    public WebElement getRate() {
        return rate;
    }
}
