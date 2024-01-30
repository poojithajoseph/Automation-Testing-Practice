package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.NoSuchWindowException;

public class SeleniumFirstAssignment 
{
	
	public static void main(String args[]) throws InterruptedException
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		//Selecting the username text box
		
		WebElement username = driver.findElement(By.xpath("//input[@id='Email']"));
		username.clear();
		username.sendKeys("admin@yourstore.com");
		
		//locating the password text box
		WebElement psw = driver.findElement(By.xpath("//input[@id='Password']"));
		psw.clear();
		psw.sendKeys("admin");
	
		//Locating the button
		
		WebElement submitbtn = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		submitbtn.click();
		
		//verifying the page title
		Thread.sleep(5000);
		
		
		
		String expTitle = "Dashboard / nopCommerce administration";
		//positive case
		
		//Using try catch bolck
		//to perform negative test case
		//1. Incorrect Password and Username
		//2.Incorrect dashboard xpath locater
		//3.Handling using try-catch block( NoSuchElementFound Exception)
		String dashtext="";
		String expTitle1 ="Dashboard";
		try
		{
			dashtext = driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).getText();
		}
		catch(NoSuchElementException e)
		{
			
		}
		
		
		
		if(dashtext.equals(expTitle1))
		{
			System.out.println("Passed");
		}
		else
		{
			System.out.println("Failed");
		}
		// Verifyting the menu items in the Dashboard
		//1.Using findelements as it has multiple webelements
		//2. Using List method for storing the multiple web elements
		//3. Using for loop to fetch all the items in the menu bar and print the text 
		
		List<WebElement> dash=driver.findElements(By.xpath("//ul[@class='nav nav-pills nav-sidebar flex-column nav-legacy']"));
		
		
	    for(WebElement ele:dash)
	    {
	    	System.out.println(ele.getText());
	    	
	    }
	    
	    
		driver.quit();
		
	}
}
