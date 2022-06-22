package com.sdetpro.utils.smoke;

import com.sdetpro.utils.Url;
import com.sdetpro.utils.UserDashboardPage;
import com.sdetpro.utils.driver.DriverBase;
import com.sdetpro.utils.model.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskCRUD extends DriverBase {

    public void checkUI(){
        WebDriver driver = getDriver();
        driver.get(Url.currentTestUrl("LOGIN_PAGE"));
        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .inputUsername("tomsmith1")
                .inputPassword("SuperSecretPassword!")
                .clickBtnLogin();
        UserDashboardPage userDashboardPage = new UserDashboardPage(driver);

    }
    @Test(groups = {"regression"})

    public void checkFunction(){
        WebDriver driver = getDriver();
        driver.get(Url.currentTestUrl("LOGIN_PAGE"));
        LoginPage loginPage = new LoginPage(driver);
        loginPage
                .inputUsername("tomsmith1")
                .inputPassword("SuperSecretPassword!")
                .clickBtnLogin();
        UserDashboardPage userDashboardPage = new UserDashboardPage(driver);
        Assert.assertTrue(userDashboardPage.getLogoutBtnSelector().isDisplayed());

    }
}
