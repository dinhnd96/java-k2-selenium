package com.sdetpro.utils.regression;

import org.testng.SkipException;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class NormalLogin {
    @Ignore
    @Test(groups = {"regression"})
    public void exitsMethod(){
        throw new SkipException("This method is temporary close for awhile");
    }
    @Test(groups = {"smoke"})
    public void checkUI(){
        System.out.println("CheckUI NormalLogin + SmokeTest");
    }
    @Test(groups = {"regression"})
    public void checkFunction(){
        System.out.println("Check Function NormalLogin + Regression");
    }
}
