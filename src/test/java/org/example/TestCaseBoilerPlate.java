package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCaseBoilerPlate {
    ChromeDriver driver;
    @BeforeTest
    public void set_sample(){
        ChromeOptions edge_option=new ChromeOptions();
        edge_option.addArguments("---guest");
        driver =new ChromeDriver(edge_option);
    }

    @Test
    public void test_sample(){
        driver.get("https://app.vwo.com/#/login");;
    }
}
