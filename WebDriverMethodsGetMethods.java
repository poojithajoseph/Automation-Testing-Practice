package seleniumProject;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverMethodsGetMethods {

	public static void main(String[] args) {
		//Learning the different get methods
		/*get(url)
		 getTitle()
		 getPageSource
		 getCurrentUrl
		 getwindowHandles
		 getWindowHandle*/
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		//Launching the webpage
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//maximize the browser window
		driver.manage().window().maximize();
		
		//getTitle method
		//validating the title
		String title ="OrangeHRM";
		String validatetitle = driver.getTitle();
		if(title.equals(validatetitle))
		{
			System.out.println("Title validation passed");
		}
		else
		{
			System.out.println("Title validation failed");
		}
		//getPageSource method
		//returns the page source of that webpage ctreated by the server
		//validating element presence in the page source
		String pagesource = driver.getPageSource();
		System.out.println(pagesource);
		System.out.println(pagesource.contains("html"));
		
		//getCurrenturl method returns the url of the webpage
		//validating the url
		String currenturl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		
		String validateurl = driver.getCurrentUrl();
		if(currenturl.equals(validateurl))
		{
			System.out.println("URL validation passed");
		}
		else
		{
			System.out.println("URL validation failed");
		}
		
		//getWindowHandle & getWindowHandles methods
		//this is used to handle the different windows from the current window
		//generated the browser id dynamically at the run time
		//use that id to navigate and interact with the elements in the another browser window
		
		//getWindowHandle -- returns the id of the current webpage
		
		System.out.println(driver.getWindowHandle());
		
		//getWindowHandles -- the return type is set
		//returns two window id's and since they are unique everytime its return type is set collection
		
		WebElement link = driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
		link.click(); // opens another browser window
		
		//capturing the window id's of both the browser
		
		Set<String> windowid =driver.getWindowHandles();
		for(String ids:windowid)
		{
			System.out.println(ids);
		}
		
		driver.quit();
		
	}

}
