package org.IrvinCampos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GoogleTest {
    @Test
    public void HomePageCheck() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setBrowserName("chrome");
        desiredCapabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        desiredCapabilities.setCapability(CapabilityType.BROWSER_NAME,"chrome");

        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.245:4444"),desiredCapabilities);
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("android");
        driver.close();
    }
}
