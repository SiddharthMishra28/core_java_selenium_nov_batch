package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GroupOfWebElements {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/V1/index.php");
        driver.findElement(By.name("uid")).sendKeys("mngr608332");
        driver.findElement(By.name("password")).sendKeys("zebYgaz");
        driver.findElement(By.name("btnLogin")).click();
        driver.get("https://demo.guru99.com/V1/html/addAccount.php");
        List<WebElement> menuOptionsList = driver.findElements(By.xpath("/html/body/div[3]/div/ul/li"));
        for(int i=0; i<menuOptionsList.size(); i++) {
            System.out.println(menuOptionsList.get(i).getText());
        }
        Thread.sleep(3000);
        driver.quit();
    }
}
