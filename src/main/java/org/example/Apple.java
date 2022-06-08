package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Apple extends Utils {

    public void Apple(){
        String actual = driver.getCurrentUrl();
        String Expected = "https://demo.nopcommerce.com/search?q=Apple";
        Assert.assertEquals(actual,Expected,"url is Matching");
    }

    public void searchbar(){
       // Searchbar
        driver.findElement(By.xpath("\"//*[@id=\\\"small-searchterms\\\"]\"")).sendKeys("Apple");
    }

   public void AppleMacbook(){
        //applemacbook
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/h2/a")).click();
   }
}

