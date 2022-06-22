package com.sdetpro.utils;

import com.sdetpro.utils.PageControler;
import com.sdetpro.utils.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class JSExecutor {

    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get("https://the-internet.herokuapp.com/floating_menu");

        By menuSelector = By.id("menu");

        // Scroll to the bottom of the page
        PageControler.scrollToBottom(driver);
        System.out.println(PageControler.isElementInViewPort(driver, driver.findElement(menuSelector)));

        driver.quit();
    }
}