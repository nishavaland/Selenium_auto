package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils {

    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");

        //open Chrome browser:
        driver = new ChromeDriver();

        //Implicit wait method :
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Maximizing chrome window:
        driver.manage().window().maximize();

        //Driver to type URL :
        driver.get("https://demo.nopcommerce.com/");

    }

    public void closeBrowser(){
        driver.quit();
    }

}
