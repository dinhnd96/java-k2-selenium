package com.sdetpro.utils.smoke;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TaskManagement {
    @Test(groups = {"smoke"})
    public void checkUI(){
        System.out.println("CheckUI TaskManagement + SmokeTest");
    }
    @Test(groups = {"regression"})

    public void checkFunction(){
//        Assert.fail();

        System.out.println("Check Function TaskManagement + Regression");
    }
}
