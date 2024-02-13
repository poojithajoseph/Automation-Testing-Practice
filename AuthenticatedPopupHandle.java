package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticatedPopupHandle {

	public static void main(String[] args)
	{
		// Handling the authenticated popup
		/*
		 * These kind of alerts cannot be handled by using alerts interface as its not a JS Alerts
		 * They can handled by changing the url of the Website
		 * By injecting the Username and password within the url
		 */

		ChromeDriver driver = new ChromeDriver();
		//syntax== https://username:password@rest of the url
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		WebElement txt = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]"));
				
		String orgtxt = txt.getText();
		
		if(orgtxt.contains("Congratulations"))
		{
			System.out.println("The test passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		driver.quit();
		
	}

}
