package com.sdetpro.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleIframe {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get("https://the-internet.herokuapp.com/iframe");
        driver.manage().window().maximize();

        By iframeSelector = By.id("mce_0_ifr");
        By iframeBodySelector = By.id("tinymce");
        By bodyTextSelector = By.cssSelector(".mce-content-body p");

        WebElement iframeElement = driver.findElement(iframeSelector);
        driver.switchTo().frame(iframeElement);

        WebElement iframeBodyElement = driver.findElement(iframeBodySelector);
        iframeBodyElement.clear();
        iframeBodyElement.sendKeys("I choose you already ");

        WebDriverWait wait = new WebDriverWait(driver , 30);
        wait.until(ExpectedConditions.textToBe(bodyTextSelector,"I choose you already "));

        driver.switchTo().defaultContent();

    }
}
