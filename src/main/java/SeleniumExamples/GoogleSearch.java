package SeleniumExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
	public static WebDriver driver;
	
	public static void main(String[] args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.in");
		Thread.sleep(5000);
		WebElement search = driver.findElement(By.xpath("//input[@title=\"Search\"]"));
		search.sendKeys("WTF IS THIS");
		Thread.sleep(2000);
		search.click();
		WebElement searchclick = driver.findElement(By.xpath("//div[contains(@class,\"tfB0Bf\")]//input[@aria-label=\"Google Search\" and @class=\"gNO89b\"]"));
		searchclick.click();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();
	}
}
