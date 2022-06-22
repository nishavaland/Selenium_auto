package org.example;

import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManager extends Utils {
    LoadProp loadProp = new LoadProp();
    public final String AUTOMATE_UASERNAME = loadProp.getProperty("nishavaland_L9EamZ");
    public final String AUTOMATE_ACCESS_KEY = loadProp.getProperty("KrTnro2CXBqFU3RVxpmU");
    public final String BrowerStackURL = "httpps://" + AUTOMATE_UASERNAME + AUTOMATE_ACCESS_KEY + "@hub-cloud.browerstack.com/wd/hub";
    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));
    //string browserName = "chrome";
    String browersName = System.getProperty("brwse");
    public void openBrowser(){
        //making decision cloud true or false
        //this will be run if cloud ture (In cloud)
        if (cloud){
            System.out.println("running cloud");
            //
        }
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
