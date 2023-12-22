package launchyoutube;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchYoutube {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Windows 10\\Desktop\\SDM\\Day5\\GeckoDriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		Thread.sleep(1000);
		
		driver.get("https://www.youtube.com/");
		Thread.sleep(1000);
		
		driver.findElement(By.name("search_query")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("search_query")).sendKeys("Pehle bhi main");
		Thread.sleep(1000);
		
		driver.findElement(By.id("search-icon-legacy")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//body/ytd-app/div[@id='content']/ytd-page-manager[@id='page-manager']/ytd-search[@role='main']/div[@id='container']/ytd-two-column-search-results-renderer[@class='style-scope ytd-search']/div[@id='primary']/ytd-section-list-renderer[@class='style-scope ytd-two-column-search-results-renderer']/div[@id='contents']/ytd-item-section-renderer[@class='style-scope ytd-section-list-renderer']/div[@id='contents']/ytd-video-renderer[1]/div[1]/div[1]/div[1]/div[1]/h3[1]/a[1]")).click();
		Thread.sleep(1000);
	}

}
