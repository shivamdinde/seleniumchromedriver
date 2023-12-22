package com.launch.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Windows 10\\Desktop\\SDM\\Day5\\GeckoDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(1000);
		
		driver.get("https://www.swiggy.com/");
		Thread.sleep(1000);
		driver.findElement(By.className("x4bK8")).click();
		
		Thread.sleep(1000);
		driver.findElement(By.name("mobile")).sendKeys("1234567890");
		
		Thread.sleep(1000);
		driver.findElement(By.className("a-ayg")).click();
		
	}

}
