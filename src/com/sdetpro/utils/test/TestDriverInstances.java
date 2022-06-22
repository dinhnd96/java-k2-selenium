package com.sdetpro.utils.test;

import com.sdetpro.utils.Url;
import com.sdetpro.utils.UserDashboardPage;
import com.sdetpro.utils.driver.DriverBase;
import com.sdetpro.utils.model.pages.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDriverInstances extends DriverBase {

    @Test
    public void testLoginWithCorrectCreds() {
        WebDriver driver = getDriver();
        driver.get(Url.currentTestUrl("LOGIN_PAGE"));
        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .inputUsername("tomsmith12")
                .inputPassword("SuperSecretPassword!")
                .clickBtnLogin();
        By headerSelector = By.cssSelector(".example h2");
        String expectedHeader = "Login Page1";
        String actualHeader = driver.findElement(headerSelector).getText();
        Assert.assertEquals(expectedHeader , actualHeader);

    }

    @Test
    public void testLoginWithIncorrectCreds() {
        WebDriver driver = getDriver();
        driver.get(Url.currentTestUrl("LOGIN_PAGE"));
        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .inputUsername("tomsmith1")
                .inputPassword("SuperSecretPassword!")
                .clickBtnLogin();

        By headerSelector = By.cssSelector(".example h2");
        String expectedHeader = "Login Page1";
        String actualHeader = driver.findElement(headerSelector).getText();
        Assert.assertEquals(expectedHeader , actualHeader);

    }

}