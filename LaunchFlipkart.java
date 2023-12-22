package launchflipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Windows 10\\Desktop\\SDM\\Day5\\GeckoDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(1000);
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.className("_30XB9F")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("Pke_EE")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.className("Pke_EE")).sendKeys("iphone 15");
		Thread.sleep(2000);
		
		driver.findElement(By.className("_2iLD__")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("_4rR01T")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.className("_2KpZ6l _1FH0tX")).click();
		Thread.sleep(1000);
		
	}

}
