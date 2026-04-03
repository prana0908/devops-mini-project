package com.example.devopsdemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    @Test
    public void testOpenApp() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/tasks");
        
        Thread.sleep(3000); // add this
        
        driver.quit();
    }
}