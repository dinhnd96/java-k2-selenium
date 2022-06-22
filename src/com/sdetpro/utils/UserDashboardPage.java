package com.sdetpro.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UserDashboardPage {

    private WebDriver driver;
    private By flasMsgSelector = By.id("flash");
    private By pageHeaderSelector = By.cssSelector(".example h2");
    private By pageSubheaderSelector = By.className("subheader");
    private By logoutBtnSelector = By.cssSelector(".example a");

    public UserDashboardPage(WebDriver driver) {
        this.driver = driver;
    }


    public WebElement getFlasMsgSelector() {
        return driver.findElement(flasMsgSelector);
    }

    public WebElement getPageHeaderSelector() {
        return driver.findElement(pageHeaderSelector);
    }

    public WebElement getPageSubheaderSelector() {
        return driver.findElement(pageSubheaderSelector);
    }

    public WebElement getLogoutBtnSelector() {
        return driver.findElement(logoutBtnSelector);
    }
}
