package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstProgram {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://thinking-tester-contact-list.herokuapp.com");
		// to ,maximize the browser window
		driver.manage().window().maximize();
		
		
		
		Thread.sleep(5000);
		WebElement username = driver.findElement(By.id("email"));
		username.clear();
		username.sendKeys("testpractice@123.com");
		
		WebElement psword = driver.findElement(By.id("password"));
		psword.clear();
		psword.sendKeys("A123456*+");
		
		WebElement submitbtn = driver.findElement(By.id("submit"));
		submitbtn.click();
		//capturing the PageTitle web element and validating it
		String pageTitle = driver.getTitle();
		String exptitle = "My Contacts";
		if(pageTitle.equals(exptitle))
		{
			System.out.println("Title is validated and looks same  "+ pageTitle);
		}
		else
		{
			System.out.println("Failed");
		}
		//driver.quit();
	}

}
