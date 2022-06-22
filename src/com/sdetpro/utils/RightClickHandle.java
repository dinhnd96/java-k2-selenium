package com.sdetpro.utils;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RightClickHandle {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get("https://the-internet.herokuapp.com/context_menu");
        driver.manage().window().maximize();

//        By rightClickPlace = By.id("hot-spot");
//        Actions actions = new Actions(driver);
//        WebElement rightClickPlaceElement = driver.findElement(rightClickPlace);
//        actions.contextClick(rightClickPlaceElement).perform();
//
//        WebDriverWait wait = new WebDriverWait(driver , 30);
//        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//        System.out.println(alert.getText());
//        alert.accept();
//        System.out.println("done");
//
//        driver.navigate().refresh();
//        driver.quit();

        By rightClickPlace = By.id("hot-spot");
        Actions actions = new Actions(driver);
        WebElement rightClickElement = driver.findElement(rightClickPlace);
        actions.contextClick(rightClickElement).perform();

        WebDriverWait wait = new WebDriverWait(driver , 30);
        Alert alert =         wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
        System.out.println("Done");
    }
}
