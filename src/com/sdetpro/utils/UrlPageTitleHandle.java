package com.sdetpro.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;

public class UrlPageTitleHandle {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get("https://the-internet.herokuapp.com/login");
        driver.manage().window().maximize();

        By userNameSelector = By.id("username");
        By passWordSelector = By.id("password");
        By loginBtnSelector = By.cssSelector("[type='submit']");

        WebElement userNameElement = driver.findElement(userNameSelector);
        WebElement passWordElement = driver.findElement(passWordSelector);
        WebElement loginBtnElement = driver.findElement(loginBtnSelector);

        userNameElement.sendKeys("tomsmith");
        passWordElement.sendKeys("SuperSecretPassword!");
        loginBtnElement.click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.invisibilityOfElementLocated(loginBtnSelector));

        String pageTitleAfterLogin = driver.getTitle();
        String getUrlAfterLogin = driver.getCurrentUrl();

        System.out.println("Title page : " + pageTitleAfterLogin);
        System.out.println("URL page : " + getUrlAfterLogin);

        try {
            URL urlParser = new URL(getUrlAfterLogin);
            System.out.println("Page's base URL: " + urlParser.getHost());
            System.out.println("Page URL path: " + urlParser.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
