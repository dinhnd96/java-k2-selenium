package com.sdetpro.utils;

import com.sdetpro.utils.model.pages.LoginPage;
import org.openqa.selenium.WebDriver;

public class TestComponent {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get(Url.currentTestUrl("LOGIN_PAGE"));

        LoginPage loginPage = new LoginPage(driver);
        System.out.println(loginPage.footerComponent().pageFooterElement().getText());
        System.out.println(loginPage.footerComponent().pageFooterLinkText().getAttribute("href"));

    }
}
