package org.example;

import static org.openqa.selenium.By.className;

public class Homepage extends Utils {

    public void clickOnRegisterBtn() {
        // click on register button
        driver.findElement(className("ico-register")).click();
    }

}
