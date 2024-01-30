package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeLocators2 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.automationpractice.pl/index.php");
		
		//maximize the browser window
		driver.manage().window().maximize();
		// Using classname Locator
		
		List <WebElement> slider = driver.findElements(By.className("homeslider-description"));
		int num = slider.size();
		int num2 = 5;
		System.out.println(slider.size());
		//Validate the numbers
		
		if(num==num2)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		Thread.sleep(5000);
		//Using Tag Name
		//To get all the links on the webpage
		List <WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		//Validating the link numbers
		int linknum = links.size();
		int linknum2 = 94;
		System.out.println(links.size());
		//Validate the numbers
		
		if(linknum==linknum2)
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		driver.quit();
	}

}
