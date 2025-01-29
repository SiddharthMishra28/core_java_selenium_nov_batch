package com.selenium.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathConcepts {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://vistacommerce-qa.rf.gd/");
//        driver.findElement(By.xpath("html/body/main/header/nav/div/div/div/div/div/div/a")).click(); // ABSOLUTE XPATH - NOT RECOMMENDED
        // RELATIVE XPATH - RECOMMENDED WAY
        // //tagname[@attributename='value']
//        driver.findElement(By.xpath("//div[@id='_desktop_user_info']")).click();
        // TEXT MATCH - //a[text()='Contact us']
//        driver.findElement(By.xpath("//a[text()='Contact us']")).click();
        // PARTIAL TEXT MATCH
        String saleText = driver.findElement(By.xpath("//h2[contains(text(), 'sale')]")).getText();
        System.out.println(saleText);
        Thread.sleep(3000);
        driver.quit();
    }
}
