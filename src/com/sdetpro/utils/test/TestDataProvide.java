package com.sdetpro.utils.test;

import com.sdetpro.utils.Url;
import com.sdetpro.utils.driver.DriverBase;
import com.sdetpro.utils.model.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvide extends DriverBase {
    @Test(dataProvider = "loginData")
    public void login(String username , String password){
        WebDriver driver = getDriver();
        System.out.println(username + "\t" + password);
        driver.get(Url.currentTestUrl("LOGIN_PAGE"));
        LoginPage loginPage = new LoginPage(driver);
        loginPage.inputUsername(username).inputPassword(password).clickBtnLogin();

    }

    @DataProvider
    public Object[][] loginData(){

        // Create a 2-dimensions array to store test data
        Object[][] loginData = new Object[2][2];

        // 1st row , and 1 st colum data
        loginData[0][0] = "tomsmith";
        // 1st row , and 1 st colum data
        loginData[0][1] = "SuperSecretPassword!";
        // 1st row , and 1 st colum data
        loginData[1][0] = "tomsmith1";
        // 1st row , and 1 st colum data
        loginData[1][1] = "1231";
        return loginData;
    }
}
