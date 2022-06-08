package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class ShoppingCart extends Utils{



    public void ShoppingCartpage(){

        String actual = driver.getCurrentUrl();
        String Expected = "https://demo.nopcommerce.com/cart";
        Assert.assertEquals(actual,Expected," ShoppingCart Is Empty ");
    }

    public void ClickonshoppingCartpage(){
        //shoppingcartpage
        driver.findElement(By.id("//*[@id=topcartlink']/a/span[1]")).click();
    }

    public void clickonsearchbutton(){
        //clickonsearchbutton
        driver.findElement(By.id("//*[@id=small-searchterms']")).click();
    }
}
