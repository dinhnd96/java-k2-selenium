package com.sdetpro.utils.listener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerEx implements ITestListener {
    @Override
    public void onTestFailure(ITestResult result){
        System.out.println("Catching the ERR||");
    }
}
