package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TestHoverAction extends DriverSetUp{

    @Test
    public void testHover() throws InterruptedException {
        browser.get("https://rahulshettyacademy.com/AutomationPractice/");

//        WebElement mousehover = browser.findElement(By.xpath("//div[@class='mouse-hover']"));

        Actions actions = new Actions(browser);
        actions.scrollByAmount(0, 1000);
        Thread.sleep(1000);
//        actions.scrollToElement(browser.findElement(By.xpath("//legend[text()='Mouse Hover Example']"))).build().perform();
//        WebElement hoverButton = browser.findElement(By.xpath("//*[text()='Mouse Hover']"));
        actions.clickAndHold(browser.findElement(By.xpath("//*[@id='mousehover']"))).build().perform();
        Thread.sleep(1000);
        actions.click(browser.findElement(By.linkText("Top"))).build().perform();
        Thread.sleep(1000);

        actions.sendKeys(browser.findElement(By.id("autocomplete")), "Hello").build().perform();
        actions.keyDown(Keys.CONTROL);
        actions.sendKeys("a");
        actions.keyUp(Keys.CONTROL);
        actions.build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        browser.findElement(By.id("name")).sendKeys(Keys.CONTROL, "v");
        Thread.sleep(5000);

    }
}
