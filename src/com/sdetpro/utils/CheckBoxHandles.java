package com.sdetpro.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckBoxHandles {
    public static void main(String[] args) {
//        WebDriver driver = Webdriver.getChromeDriver();
//        driver.get("https://the-internet.herokuapp.com/checkboxes");
//        driver.manage().window().maximize();
//
//        // Check box are selected or not
//
//        // Try to selec first one
//
//        // Try to unselec ther second one
//
//        //Try to reselect the second one
//
//        final int Frist_Checkbox_Index = 0;
//        final int Second_Checkbox_Index = 1;
//        final By checkboxsCssSelector = By.cssSelector("[type='checkbox']");
//
//
//        List<WebElement> checkboxesGroup = driver.findElements(checkboxsCssSelector);
//        WebElement checkbox1 = checkboxesGroup.get(Frist_Checkbox_Index);
//        WebElement checkbox2 = checkboxesGroup.get(Second_Checkbox_Index);
//
//        System.out.println("checkbox 1 is selected " + checkbox1.isSelected());
//        System.out.println("checkbox 2 is selected " + checkbox2.isSelected());
//
//        checkbox1.click();
//        checkbox2.click();
//
//        System.out.println("checkbox 1 is selected " + checkbox1.isSelected());
//        System.out.println("checkbox 2 is selected " + checkbox2.isSelected());
        WebDriver driver = Webdriver.getChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        driver.manage().window().maximize();

        By listCheckboxes = By.cssSelector("[type='checkbox']");
        int Index_1_checkbox = 0;
        int Index_2_checkbox = 1;

        List<WebElement> checkboxGroup = driver.findElements(listCheckboxes);
        WebElement checkbox1 = checkboxGroup.get(Index_1_checkbox);
        WebElement checkbox2 = checkboxGroup.get(Index_2_checkbox);

        System.out.println(checkbox1.isSelected());
        System.out.println(checkbox2.isSelected());
        checkbox1.click();
        checkbox2.click();
        System.out.println(checkbox1.isSelected());
        System.out.println(checkbox2.isSelected());
    }
}
