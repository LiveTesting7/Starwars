package org.starwars.mobile;

import java.net.MalformedURLException;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class Login {
	static AndroidDriver driver;

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "12");
		cap.setCapability("deviceName", "Pixel_1");
		cap.setCapability("udid", "emulator-5554");
		cap.setCapability("appPackage", "com.starwarsapp");
		cap.setCapability("appActivity", "com.starwarsapp.MainActivity");
		cap.setCapability("automationName", "UIAutomator2");

		URL url = new URL("http://127.0.0.1:4723");

		driver = new AndroidDriver(url, cap);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.xpath("//android.widget.TextView[@text='ID']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Your e-mail address']")).sendKeys("rajkiran141297@gmail.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("77777");
		driver.findElement(By.xpath("//android.widget.TextView[@text='LOGIN']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[]@text='Rebels Alliance']")).isDisplayed();
		System.out.println("Login_Finished");

	}

}
