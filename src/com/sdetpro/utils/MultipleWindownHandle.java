package com.sdetpro.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindownHandle {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get("https://the-internet.herokuapp.com/windows");
        driver.manage().window().maximize();

        By clickHereLinkText = By.linkText("Click Here");
        WebElement linkTextEle = driver.findElement(clickHereLinkText);
        linkTextEle.click();

        List<String> windownIds = new ArrayList<>(driver.getWindowHandles());
        final int First_Windown = 0;
        final int Second_Windown = 1;
        driver.switchTo().window(windownIds.get(Second_Windown));
        System.out.println("how many site page have ? : " + windownIds.size());
        System.out.println("Second Windown Url" + driver.getCurrentUrl());
        System.out.println("Second Windown Title" + driver.getTitle());

        driver.switchTo().window(windownIds.get(First_Windown));
        System.out.println("First Windown Url" + driver.getCurrentUrl());
        System.out.println("First Windown Title" + driver.getTitle());

        driver.switchTo().window(windownIds.get(Second_Windown));
        driver.close();

        driver.switchTo().window(windownIds.get(First_Windown));
        windownIds = new ArrayList<>(driver.getWindowHandles());
        System.out.println("how many site page have ? : " + windownIds.size());
        driver.quit();
    }
}
