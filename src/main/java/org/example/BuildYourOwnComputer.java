package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.example.BasePage.driver;

public class BuildYourOwnComputer {
    public class buildYourOwnComputer extends Utils{
        public void BuildYourOwnCompuer(){
            String actual = driver.getCurrentUrl();
            String Expected = "https://demo.nopcommerce.com/computers";
            Assert.assertEquals(actual,Expected,"URL is Matching");

        }
    }
     public void Computer(){
        Select Comuter;
        driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[1]/a"));
     }

    public void BuildOwnComputer(){
        //Select Processor
        driver.findElement(By.xpath("//*[@id=\"product_attribute_1\"]"));

    }

    public void ram(){
        //Select ram2gb
        driver.findElement(By.xpath("//*[@id=\"product_attribute_2\"]"));
    }

    public void HDD(){
        Select HddRadio320gb;
        driver.findElement(By.xpath("//*[@id=\"product_attribute_label_3\"]"));
    }

    public void OS(){
        Select VistaPremium;
        driver.findElement(By.xpath("//*[@id=\"product_attribute_input_4\"]/ul/li[1]"));
    }

    public void MicrosoftOffice(){
        Select microsoftoffice;
        driver.findElement(By.xpath("//*[@id=\"product_attribute_input_5\"]/ul/li[1]/label"));
    }

    public void AcrobatReader(){
        Select AcrobatReader;
        driver.findElement(By.xpath("//*[@id=\"product_attribute_5_11\"]"));
    }

    public void TotalCommander(){
        Select TotalCommander;
        driver.findElement(By.xpath("//*[@id=\"product_attribute_5_12\"]"));
    }

    public void AddToCart(){
        Select AddToCart;
        driver.findElement(By.xpath("//*[@id=\"add-to-cart-button-1\"]"));
    }

}


