package com.company;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.SerializedLambda;
import java.nio.channels.SelectableChannel;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.TimeUnit;




public class Main {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Syntax\\selenium\\intaall\\chromedriver.exe");
        WebDriver driver = new ChromeDriver(); // launch the browser
        driver.manage().window().maximize();
        WebDriverWait wait=new WebDriverWait(driver,20);
        String url = "http://demo.guru99.com/test/simple_context_menu.html";
        driver.get(url);

        TakesScreenshot ts=(TakesScreenshot)driver;
        File sourceFile=ts.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(sourceFile,new File("abcdefgh/HRMS/dashboard.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



}



















