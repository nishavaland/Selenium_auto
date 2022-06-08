package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.Iterator;
import java.util.Set;

public class TestSuit extends BaseTest {

    Homepage homepage = new Homepage();


    @Test
    public void userShouldBeAbleToNavigateToRegisterPage(){
    RegistrationPage regisrationPage = new RegistrationPage();

        homepage.clickOnRegisterBtn();
        regisrationPage.verifyRegisteratonPage();
        regisrationPage.selectGendar();
        regisrationPage.enterfirstname();
        regisrationPage.enterlastname();
        regisrationPage.SelectbirthDay();
        regisrationPage.Selectbrithday();
        regisrationPage.SelectbirthYear();
        regisrationPage.SelectEmail();
        regisrationPage.Password();
        regisrationPage.Confirmpassword();
        regisrationPage.clickregister();

    }

    @Test
    public void ShoppingCartpage(){
        ShoppingCart shoppingCart = new ShoppingCart();

        ShoppingCart.driver.getCurrentUrl();
        //ShoppingCart.driver.shoppingcartpage();


    }

    @Test
    public void Nikeproduct(){
        //   open the url
        driver.get("https://demo.nopcommerce.com/");

        //   go to search
        driver.findElement(By.id("small-searchterms")).sendKeys("Nike");

        //   click on search button
        clickOnElement(By.xpath("//*[@id=\"small-search-box-form\"]/button"));
    }
    @Test
    public void newrelease() {

        //   open the url
        driver.get("https://demo.nopcommerce.com/");
        //   go to new release
        clickOnElement(By.className("news-title"));
        // go to the texbar
        driver.findElement(By.className("enter-comment-title")).sendKeys("Miss Nisha");
        driver.findElement(By.id("AddNewComment_CommentText")).sendKeys("Product is not useful");
        clickOnElement(By.xpath("//*[@id=\"comments\"]/form/div[2]/button"));
    }

    @Test
    public void windowHandling(){
        //   open the url
        driver.get("https://demo.nopcommerce.com/");

        //  driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[contains(text(),'Facebook')]")).click();

        //
        driver.get("https://www.facebook.com/nopCommerce");
        //   set class to store multiple window ID
        Set<String> id=  driver.getWindowHandles();

        //
        Iterator<String> itr = id.iterator();

        String parentwindow=itr.next();
        String childwindow=itr.next();
//
        System.out.println("parent window id:"+parentwindow );
        System.out.println("child window id:"+childwindow );
        //
        driver.switchTo().window(childwindow);

        System.out.println(driver.getCurrentUrl());

    }

    @Test
    public void alert(){

        //   open the url
        driver.get("https://demo.nopcommerce.com/");
        //  click on vote
        clickOnElement(By.id("vote-poll-1"));

        Alert alt=driver.switchTo().alert();
        alt.accept();
    }

    @Test
    public void Apple(){
        // open the url
        driver.get("https://demo.nopcommerce.com/search?q=Apple");
        //Searchbar
        driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]")).sendKeys("Apple");
        //AppleMacbook
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div[3]/div/div[2]/div/div/div[1]/div/div[2]/h2/a")).click();

    }
}


