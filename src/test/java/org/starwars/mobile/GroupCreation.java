package org.starwars.mobile;

import java.net.MalformedURLException;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;

public class GroupCreation {
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//android.widget.TextView[@text='ID']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Create a new account']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='XXX@gmail.com']")).sendKeys("Test@gmail.com");
		driver.findElement(By.xpath("//android.widget.EditText[@text='First Name']")).sendKeys("Test");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Last Name']")).sendKeys("one");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Confirm Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Job']")).sendKeys("Test");
		driver.findElement(By.xpath("//android.widget.TextView[@text='SAVE']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='󰡼']")).click();
		driver.findElement(By.xpath("//android.widget.ImageView[@content-desc='Shutter']")).click();
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Done']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='SAVE']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Yes, I do']")).click();
		driver.findElement(By.xpath("//android.widget.EditText[@text='Group name']")).sendKeys("Test");
		driver.findElement(By.xpath("//android.widget.EditText[@text='Group Description']")).sendKeys("Test");
		driver.findElement(By.xpath("//android.widget.TextView[@text='SAVE']")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Rebels Alliance']")).isDisplayed();

		System.out.println("GroupCreation_Finished");

	}

}
