package com.sdetpro.apilearning;

import com.sdetpro.utils.Webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginForm {

    public static void main(String[] args) {
        final String testUrl = "https://the-internet.herokuapp.com/login";
        WebDriver driver = Webdriver.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(testUrl);
        driver.manage().window().maximize();

        WebElement usernameElem = driver.findElement(By.id("username"));
        WebElement passwordElem = driver.findElement(By.id("password"));
        WebElement loginBtnElem = driver.findElement(By.cssSelector("[type='submit']"));

        usernameElem.sendKeys("tomsmith_");
        passwordElem.sendKeys("SuperSecretPassword!");
        loginBtnElem.click();

//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("khongnha")));

        driver.findElement(By.id("flash")).click();
    }
}