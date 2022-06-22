package com.sdetpro.utils;

import com.sdetpro.utils.model.pages.LoginPage;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class TestLoginPOM {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/login");

        LoginPage loginPage = new LoginPage(driver);
//        loginPage.username().sendKeys("dinh1234");
//        loginPage.password().sendKeys("khongbietnhe");
//        loginPage.loginBtn().click();
//            loginPage.inputUsername("khongbietnhe");
//            loginPage.inputPassword("khongbietluon");
//            loginPage.clickLoginBtn();
        loginPage.inputUsername("khongbietrnhe").inputPassword("cungkhongbietluon");
    }
}
