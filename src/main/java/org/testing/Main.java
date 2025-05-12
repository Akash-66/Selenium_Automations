package org.testing;

import org.openqa.selenium.WebDriver;
import org.testing.InvokeDrivers.Drivers;

public class Main {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {

        driver = Drivers.openChromeBrowser();
        driver.get("https://demoqa.com/");
        Thread.sleep(3000);
        driver.quit();
        //System.out.println("Hello, World!");
    }
}