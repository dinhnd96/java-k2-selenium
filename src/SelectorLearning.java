import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class SelectorLearning {
    public static void main(String[] args) {
        WebDriver driver;
        String path = System.getProperty("user.dir");
        String chromeDriverPath = path + "//chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/login");

        WebElement emailCssSelector = driver.findElement(By.cssSelector("#username"));
        emailCssSelector.sendKeys("khongphaidau");

        WebElement emailIdSelectoc = driver.findElement(By.id("username"));
        emailIdSelectoc.sendKeys("khongphaidau2");

        WebElement passCssSelector = driver.findElement(By.cssSelector("#password"));
        passCssSelector.sendKeys("khongbietnhe");

        List<WebElement> allInput = driver.findElements(By.xpath("//input"));
        int userNameIndex = 0;
        int passwordIndex = 1;

        WebElement userNameElement = allInput.get(userNameIndex);
        WebElement passwordElement = allInput.get(passwordIndex);

        userNameElement.sendKeys("khongphaitaonhe");
        passwordElement.sendKeys("khongphaitaonhe");

//        WebElement emailXpatchSelector = driver.findElement(By.xpath("//input[@name='userName']"));
//        emailXpatchSelector.sendKeys("dinhnd96@gmail.com");
//
//        WebElement passwordXpatchSelector = driver.findElement(By.xpath("//input[@name='password']"));
//        passwordXpatchSelector.sendKeys("Dinh1234");
//
//        WebElement loginBtnElem = driver.findElement(By.cssSelector("[type='submit']"));
//        loginBtnElem.click();
    }
}
