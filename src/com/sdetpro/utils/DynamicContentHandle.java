package com.sdetpro.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicContentHandle {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_controls");
        driver.manage().window().maximize();

//        By checkBoxSelector = By.id("checkbox");
//        By checkBoxBtnSelector = By.cssSelector("#checkbox-example button");
//        By inputSelector = By.cssSelector("#input-example input");
//        By inputBtnSelector = By.cssSelector("#input-example button");
//
//        // This is remove
//
//        System.out.println("Is checkbox displayed" + driver.findElement(checkBoxSelector).isDisplayed());
//        driver.findElement(checkBoxBtnSelector).click();
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        wait.until(ExpectedConditions.invisibilityOfElementLocated(checkBoxSelector));
//        try {
//            driver.findElement(checkBoxSelector);
//        } catch (Exception e) {
//            System.out.println("Is checkbox is removed");
//        };
//
//        // This is input
//        System.out.println("Is the Input form enabled: " + driver.findElement(inputSelector).isEnabled());
//        driver.findElement(inputBtnSelector).click();
//        wait.until(ExpectedConditions.textToBe(inputBtnSelector, "Disable"));
//        System.out.println("Is the Inout form enabled: " + driver.findElement(inputSelector).isEnabled());
        By checkboxSelector = By.id("checkbox");
        By checkboxBtnSeloctor = By.cssSelector("#checkbox-example button");
        By inputSelector = By.cssSelector("#input-example input");
        By inputBtnSeloctor = By.cssSelector("#input-example button");


        System.out.println("is checkbox displayed : " + driver.findElement(checkboxSelector).isDisplayed());
        driver.findElement(checkboxBtnSeloctor).click();
        WebDriverWait wait = new WebDriverWait(driver , 10);

        wait.until(ExpectedConditions.invisibilityOfElementLocated(checkboxSelector));

        try{
            driver.findElement(checkboxSelector).isDisplayed();
        } catch (Exception e) {
            System.out.println("is checkbox is gone");

        }

        // input handle
        System.out.println("Is input available to use : " + driver.findElement(inputSelector).isEnabled());
        driver.findElement(inputBtnSeloctor).click();
        wait.until(ExpectedConditions.textToBe(inputBtnSeloctor, "Disable"));
        System.out.println("Is input available to use : " + driver.findElement(inputSelector).isEnabled());



    }
}
