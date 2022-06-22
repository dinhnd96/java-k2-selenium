package com.sdetpro.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class MouseHover {
    public static void main(String[] args) {
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get("https://the-internet.herokuapp.com/hovers");
        driver.manage().window().maximize();

//        By avatarSelector = By.cssSelector(".figure");
//        By nameSelector = By.cssSelector(".figcaption h5");
//        By hyperLinkSelector = By.cssSelector(".figcaption a");
//        final int INDEX_OF_1_USER = 0;
//        final int INDEX_OF_2_USER = 1;
//        final int INDEX_OF_3_USER = 2;
//
//        List<WebElement> avatarElements = driver.findElements(avatarSelector);
//        List<WebElement> namElements = driver.findElements(nameSelector);
//        List<WebElement> hyperLinkElements = driver.findElements(hyperLinkSelector);
//
//        // User 1
//
//        Actions action = new Actions(driver);
//        action.moveToElement(avatarElements.get(INDEX_OF_1_USER)).perform();
//        System.out.println(namElements.get(INDEX_OF_1_USER).getText());
//        System.out.println(hyperLinkElements.get(INDEX_OF_1_USER).getAttribute("href"));
//
//        // User 2
//        action.moveToElement(avatarElements.get(INDEX_OF_2_USER)).perform();
//        System.out.println(namElements.get(INDEX_OF_2_USER).getText());
//        System.out.println(hyperLinkElements.get(INDEX_OF_2_USER).getAttribute("href"));
//        // User 3
//        action.moveToElement(avatarElements.get(INDEX_OF_3_USER)).perform();
//        System.out.println(namElements.get(INDEX_OF_3_USER).getText());
//        System.out.println(hyperLinkElements.get(INDEX_OF_3_USER).getAttribute("href"));
//
//        driver.quit();

        By avatarSelector = By.cssSelector(".figure");
        By nameSelector = By.cssSelector(".figcaption h5");
        By hyperLinkSelector = By.cssSelector(".figcaption a");
        final int Index_1 = 0;
        final int Index_of_user_2 = 0;
        final int Index_of_user_3 = 0;

        List<WebElement> groupAvatar = driver.findElements(avatarSelector);
        List<WebElement> groupName = driver.findElements(nameSelector);
        List<WebElement> groupHyperLink = driver.findElements(hyperLinkSelector);

        // User 1
        Actions actions = new Actions(driver);
        actions.moveToElement(groupAvatar.get(Index_1)).perform();
        System.out.println(groupName.get(Index_1).getText());
        System.out.println(groupHyperLink.get(Index_1).getText());

        //User 2
        actions.moveToElement(groupAvatar.get(Index_of_user_2)).perform();
        System.out.println(groupName.get(Index_of_user_2).getText());
        System.out.println(groupHyperLink.get(Index_of_user_2).getText());

        // User 3
        actions.moveToElement(groupAvatar.get(Index_of_user_3)).perform();
        System.out.println(groupName.get(Index_of_user_3).getText());
        System.out.println(groupHyperLink.get(Index_of_user_3).getText());

    }
}
