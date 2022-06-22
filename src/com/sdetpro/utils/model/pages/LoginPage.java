package com.sdetpro.utils.model.pages;

import com.sdetpro.utils.Webdriver;
import com.sdetpro.utils.model.components.FooterComponent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;
    private By usernameSelector = By.id("username");
    private By passwordSelector = By.id("password");
    private By loginBtnSelector = By.cssSelector("[type ='submit']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    private FooterComponent footerComponent;

    public FooterComponent footerComponent(){
        return new FooterComponent(driver);
    }

    public WebElement username(){
        return driver.findElement(usernameSelector);
    }
    public WebElement password(){
        return driver.findElement(passwordSelector);
    }
    public WebElement loginBtn(){
        return driver.findElement(loginBtnSelector);
    }

//    public void inputUsername(String username) {
//        username().sendKeys(username);
//    }
//
//    public void inputPassword(String password){
//        password().sendKeys(password);
//    }
//    public void clickLoginBtn(){
//        loginBtn().click();
//    }
    public LoginPage inputUsername(String username){
        WebElement userEle = driver.findElement(usernameSelector);
        userEle.sendKeys(username);
        return this;
    }
    public LoginPage inputPassword(String password){
        WebElement passEle = driver.findElement(passwordSelector);
        passEle.sendKeys(password);
        return this;
    }
    public LoginPage clickBtnLogin(){
        WebElement loginBtnEle = driver.findElement(loginBtnSelector);
        loginBtnEle.click();
        return this;
    }
}
