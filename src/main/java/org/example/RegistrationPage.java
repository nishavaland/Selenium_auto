package org.example;


import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class RegistrationPage extends Utils {


    public void verifyRegisteratonPage(){

        String actual = driver.getCurrentUrl();
        String Expected = "https://demo.nopcommerce.com/register?returnUrl=%2F";
        Assert.assertEquals(actual,Expected,"URL is Not Matching");
    }

    public void selectGendar(){
        //Select on male or female
        driver.findElement(By.xpath("//*[@id=\"gender-female\"]")).click();
    }

   public void enterfirstname(){
        //enter first name
       driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Autoamtion");
   }

   public void enterlastname(){
        //enter last name
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[3]/input")).sendKeys("LastName2");
   }

   public void  SelectbirthDay(){
       //select on the day
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("20");

   }

   public void Selectbrithday(){
       //select on month
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).sendKeys("August");

   }

   public void SelectbirthYear(){
        //select on Year
       driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]")).sendKeys("1999");
    }

   // public void Email(){
        //Email
       // driver.findElement(By.id("//*[@id=\"Email\"]")).sendKeys("valand92@gmail.com");
    //}

    public void SelectEmail(){
        //Select Email
        driver.findElement(By.id("Email")).sendKeys("valand92@gmail.com");
    }

    public void Password(){
        //Password
        driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("Milan23");

    }

    public void Confirmpassword(){
        //Confirmpassword
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[4]/div[2]/div[2]/label")).sendKeys("Milan23");
    }

    public void clickregister(){
        //clickregist
        driver.findElement(By.xpath("//*[@id=ConfirmPassword']")).click();
    }

    public void Regiser(){
        clickregister();
        driver.findElement(By.xpath("//*[@id=register-button']"));
    }

}








