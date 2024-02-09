package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenAWebPage extends DriverSetUp{

    @Test
    public void openMavenRepositoryPageAndTestTitle (){
        //WebDriver browser = new EdgeDriver();
        browser.get("https://mvnrepository.com/artifact/org.testng/testng/7.9.0");

        //System.out.println(browser.getTitle());
        Assert.assertEquals(browser.getTitle(), "Maven Repository: org.testng » testng » 7.9.0");
        //browser.close();
    }

    @Test
    public void openGooglePageAndTestTitle (){
        //WebDriver browser = new EdgeDriver();
        browser.get("https://google.com/");

        //System.out.println(browser.getTitle());
        Assert.assertEquals(browser.getTitle(), "Google");
        //browser.close();
    }
}
