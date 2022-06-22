package com.sdetpro.utils.driver;

import com.sdetpro.utils.Webdriver;
import org.openqa.selenium.WebDriver;

public class DriverFactory {
    private WebDriver webDriver;
    WebDriver getDriver(){
        if(webDriver == null) {
            webDriver = Webdriver.getChromeDriver();
        }
        return webDriver;

    }

    void quiDriver(){
        if(webDriver != null) {
            webDriver.quit();
            webDriver = null;
        }
    }
}
