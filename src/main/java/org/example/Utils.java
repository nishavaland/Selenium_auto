package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage{
    //utility method

    public static void urlToBe(int time, String url){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.urlToBe(url));
    }

    public static void sendKeys(By by, String text)
    {
        driver.findElement(by).sendKeys(text);
    }

    public static void click(By by)
    {
        driver.findElement(by).click();
    }

    public static void getTextFromElement(By by)
    {
        driver.findElement(by).getText();
    }

    public static String randomDate()
    {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("ddMMYyyyHHMmSs");
        return formatter.format(date);
    }

    public static void driverWaitUnTillElementToBeClickable(By by,int time)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(by)).click();

    }

    public static void driverWaitUnitElementContainsUrlFraction(By by,int time,String FractionUrl)
    {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait1.until(ExpectedConditions.urlContains("FractionUrl"));
    }

    public static void driverWaitUntilElementLocated(By by,int time)
    {
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait2.until(ExpectedConditions.presenceOfElementLocated(by));

    }
    public static void driverWaitUntilElementsTitleContains(int time,String TitleContains)
    {
        WebDriverWait wait4 = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait4.until(ExpectedConditions.titleContains(TitleContains));

    }
    public static void driverWaitUntilContainsUrl(int time,String url)
    {

        WebDriverWait wait5 = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait5.until(ExpectedConditions.urlContains(url));

    }

    public static void driverWaitUntilPresenceOfElement(By by, int time)
    {
        WebDriverWait wait6 = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait6.until(ExpectedConditions.presenceOfElementLocated(by));
    }


    public static void driverWaitUntilInvisibilityOfWebElement( int time, WebElement element)
    {
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.invisibilityOf(element));

    }

    public static void driverWaitUntil(int time,By by)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeSelected(by));
    }
    public static void selectDropdownByValue(By by,String value)
    {
        Select dropdown = new Select(driver.findElement(by));
        dropdown.selectByValue(value);

    }
    public void selectByValueDropDown(By by, String value) {

        //this method select value from drop down

        Select select = new Select(driver.findElement(by));

        //Select by value
        select.selectByValue(value);

    }
    public static void clickOnElement(By by) {    // click on register button
        driver.findElement(by).click();
    }
}
