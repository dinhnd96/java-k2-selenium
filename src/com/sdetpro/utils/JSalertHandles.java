package com.sdetpro.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JSalertHandles {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

//        final By jsAlertSelector = By.cssSelector("[onclick=\"jsAlert()\"]");
//        final By jsCFAlertSelector = By.cssSelector("[onclick=\"jsConfirm()\"]");
//        final By jsPrAlertSelector = By.cssSelector("[onclick=\"jsPrompt()\"]");
//        final By result = By.id("result");
//
//        driver.findElement(jsAlertSelector).click();
//        WebDriverWait wait = new WebDriverWait(driver, 30);
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        System.out.println("Alert content" + alert.getText());
//        alert.accept();
//        System.out.println(driver.findElement(result).getText());
//
//        // play with alert confirm
//
//        driver.findElement(jsCFAlertSelector).click();
//        alert = wait.until(ExpectedConditions.alertIsPresent());
//        System.out.println("Alert content" + alert.getText());
//        alert.dismiss();
//        System.out.println(driver.findElement(result).getText());
//
//
//        // Play with JS Promt
//
//        driver.findElement(jsPrAlertSelector).click();
//        alert = wait.until(ExpectedConditions.alertIsPresent());
//        alert.sendKeys("Toi lam dung roi");
//        alert.accept();
//        System.out.println("Dung la toi " + driver.findElement(result).getText());
        final By jsAlert = By.cssSelector("[onclick=\"jsAlert()\"]");
        final By jsCF = By.cssSelector("[onclick=\"jsConfirm()\"]");
        final By jsPromt = By.cssSelector("[onclick=\"jsPrompt()\"]");
        final By reult = By.id("result");

        // JS Alert

        driver.findElement(jsAlert).click();
        WebDriverWait wait = new WebDriverWait(driver,30);
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        System.out.println(driver.findElement(reult).getText());

        // JS confirm
        driver.findElement(jsCF).click();
        alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.dismiss();
        System.out.println(driver.findElement(reult).getText());

        // JS Promt
        driver.findElement(jsPromt).click();
        alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.sendKeys("Toi vua click button");
        alert.accept();
        System.out.println(driver.findElement(reult).getText());


    }
}
