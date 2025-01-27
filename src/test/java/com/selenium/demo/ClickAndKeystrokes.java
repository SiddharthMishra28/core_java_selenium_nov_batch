package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickAndKeystrokes {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V1/index.php");
        driver.findElement(By.name("uid")).sendKeys("mngr608332"); // id, name, linktext, partial-linktext, xpath, cssPath
        driver.findElement(By.name("password")).sendKeys("zebYgaz");
        driver.findElement(By.name("btnLogin")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
