package org.testing.InvokeDrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivers {

    public static WebDriver driver;

    public static WebDriver openChromeBrowser()
    {
        System.setProperty("webdriver.chrome.driver","src/main/resources/Drivers/ChromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        return driver;
    }
}
