package com.sdetpro.utils.regression;

import com.sdetpro.utils.Url;
import com.sdetpro.utils.Webdriver;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SSOLogin {




    @Test(groups = {"smoke"})
    public void checkUI(){
        System.out.println("CheckUI SSOLogin + SmokeTest");

    }
    @Test(groups = {"regression"})
    public void checkFunction(){
        System.out.println("Check Function SSOLogin + Regression");
        Assert.fail("This method was wrong");
    }
}
