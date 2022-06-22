package com.sdetpro.utils.driver;

import org.apache.commons.io.FileUtils;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.util.*;

public class DriverBase {

    private static List<DriverFactory> webdriverThreadPool = Collections.synchronizedList(new ArrayList<DriverFactory>());
    private static ThreadLocal<DriverFactory> driverThread;

    @BeforeSuite(alwaysRun = true)
    public static void initWebdriverObject() {
        driverThread = ThreadLocal.withInitial(() -> {
            DriverFactory webdriverThread = new DriverFactory();
            webdriverThreadPool.add(webdriverThread);
            return webdriverThread;
        });
    }

    public static WebDriver getDriver(){
        return driverThread.get().getDriver();
    }


    @AfterSuite(alwaysRun = true)
    public void afterSuite(){
        for(DriverFactory driver : webdriverThreadPool){
            driver.quiDriver();
        }
    }
    @AfterMethod(alwaysRun = true)
    public void afterMethod(ITestResult result){
        getDriver().manage().deleteAllCookies();

        if(result.getStatus() == ITestResult.FAILURE) {


            Calendar calendar = new GregorianCalendar();
            int y = calendar.get(Calendar.YEAR);
            int moth = calendar.get(Calendar.MONTH);
            int day = calendar.get(Calendar.DATE);
            int hours = calendar.get(Calendar.HOUR_OF_DAY);
            int min = calendar.get(Calendar.MINUTE);
            int sec = calendar.get(Calendar.SECOND);

            String takenTime = y + "-" + moth + "-" + day + "-" + hours + ":" + min + ":" + sec ;
            // 1 Get the method name
            String testMethod = result.getName();

            // 2 Declare File location
            String fileLocation = System.getProperty("user.dir") + "/screenshot/" + testMethod + "-" + takenTime + ".png";

            // 3 Save screenshot to the system
            File screenshot = ((TakesScreenshot) driverThread.get().getDriver()).getScreenshotAs(OutputType.FILE);
            try{
                FileUtils.copyFile(screenshot, new File(fileLocation));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}