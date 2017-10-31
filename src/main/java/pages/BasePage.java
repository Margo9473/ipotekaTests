package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import steps.BaseSteps;


import java.util.concurrent.TimeUnit;

public class BasePage {
    WebDriver driver = BaseSteps.getDriver();

    public BasePage(){
        PageFactory.initElements(driver, this);
    }

    public boolean isElementPresent(WebElement webElement) {
        try {
            driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
            return webElement.isDisplayed();
        } catch (NoSuchElementException e) {
            return false;
        }
        finally {
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
    }

    public void fillField(WebElement element, String value)  {
        try{
            waitVisibility(element);
            element.clear();
            element.sendKeys(value);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public void clearFieldAndSendCase(WebElement element, String value)  {
        try{
            waitVisibility(element);
            do{
                element.sendKeys(Keys.BACK_SPACE);
            } while (!element.getAttribute("value").equals(" \u20BD"));
            element.sendKeys(value, Keys.UP);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public void clearFieldYearAndSend(WebElement element, String value)  {
        try{
            waitVisibility(element);
            do{
                element.sendKeys(Keys.BACK_SPACE);
            } while (!element.getAttribute("value").equals(" лет"));
            element.sendKeys(value, Keys.UP);
        } catch (Exception ex) {
            System.out.println(ex);
        }

    }


    public void waitVisibility(WebElement element){
        new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOf(element));
    }

    public void click(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(false);", element);
        new WebDriverWait(driver,20).until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
