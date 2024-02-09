package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverSetUp {
    public    WebDriver browser;

    @BeforeSuite
    public void OpenABrowser(){

        browser = new EdgeDriver();
        browser.manage().window().maximize();
    }

    @AfterSuite
    public void quiteBrowser(){

        //browser.close();
        browser.quit();
    }
}
