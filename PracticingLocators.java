package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticingLocators {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php?id_category=3&controller=category");
		
		//maximize the browser window
		driver.manage().window().maximize();
		// Using id Locator
		
		WebElement searchBox = driver.findElement(By.id("search_query_top"));
		searchBox.clear();
		searchBox.sendKeys("T-shirts");
		//Using name locator
		WebElement searchBtn = driver.findElement(By.name("submit_search"));
		searchBtn.click();
		Thread.sleep(5000);
		//Thread.sleep(5000);
		driver.navigate().back();
	
		//usingLink text locator
		WebElement tshirtlink = driver.findElement(By.partialLinkText("T-shirts"));
		
		tshirtlink.click();
		
		
		WebElement blousevalidate = driver.findElement(By.partialLinkText("Blouse"));
		blousevalidate.click();
		
		
		
		
		
	}

}
