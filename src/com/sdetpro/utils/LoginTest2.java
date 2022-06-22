package com.sdetpro.utils;

import com.sdetpro.utils.model.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class LoginTest2 {



    @Test
    public void registerMethod(){
        System.out.println("Register user ....");
//        Assert.fail("Register user fail ....");
    }

    @Test(dependsOnMethods = "registerMethod")
    public void loginWithCorrectdentials(){

        WebDriver driver = Webdriver.getChromeDriver();
        SoftAssert softAssert = new SoftAssert();
//        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(Url.currentTestUrl("LOGIN_PAGE"));

        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .inputUsername("tomsmith")
                .inputPassword("SuperSecretPassword!")
                .clickBtnLogin();

        UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
        String actualHeader = userDashboardPage.getPageHeaderSelector().getText();
        String expectedHeader = "Secure Area_";
        softAssert.assertEquals(expectedHeader, actualHeader, "[ERR] Page header is incorrect!");
        softAssert.assertTrue(userDashboardPage.getLogoutBtnSelector().isDisplayed(), "[ERR] Logout button is not displayed!");
        try {
            softAssert.assertFalse(loginPage.loginBtn().isDisplayed(), "is still displayed!!");
        } catch (Exception e) {
            System.out.println("button is not displayed");
        }
        driver.close();
        softAssert.assertAll();

    }

    @Test(priority = 1)

    public void loginWithIncorrectdentials(){

        WebDriver driver = Webdriver.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(Url.currentTestUrl("LOGIN_PAGE"));

        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .inputUsername("tomsmith1")
                .inputPassword("SuperSecretPassword1!")
                .clickBtnLogin();


        UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
        String actualHeader = userDashboardPage.getPageHeaderSelector().getText();
        String expectedHeader = "Secure Area_1";
        Assert.assertEquals(actualHeader,  expectedHeader, "[ERR] Page header is incorrect!");
        Assert.assertTrue(userDashboardPage.getLogoutBtnSelector().isDisplayed(), "[ERR] Logout button is not dispkayed!");
        driver.close();
    }
}
