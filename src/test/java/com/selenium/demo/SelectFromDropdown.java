package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectFromDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V1/index.php");
        driver.findElement(By.name("uid")).sendKeys("mngr608332");
        driver.findElement(By.name("password")).sendKeys("zebYgaz");
        driver.findElement(By.name("btnLogin")).click();
        driver.get("https://demo.guru99.com/V1/html/addAccount.php");
        driver.findElement(By.name("cusid")).sendKeys("12345");
        WebElement element = driver.findElement(By.name("selaccount"));
        Select accType = new Select(element); // HAS A RELATIONSHIP!
        accType.selectByVisibleText("current");
        Thread.sleep(3000);
        driver.quit();
    }
}
