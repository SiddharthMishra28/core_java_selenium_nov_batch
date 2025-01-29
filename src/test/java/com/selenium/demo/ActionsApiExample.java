package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsApiExample {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://vistacommerce-qa.rf.gd/");
        Actions actions = new Actions(driver);
        WebElement menuOption = driver.findElement(By.xpath("//ul[@id='top-menu']/li[1]/a"));
        actions.moveToElement(menuOption).build().perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
