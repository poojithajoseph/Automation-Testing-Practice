package seleniumProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlertsExamples {

	public static void main(String[] args) {
		// Handling alerts
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//adding implicit waits
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Handling the alert by not entering the username and password
		//clicking the submit button
		
		//locating the sign in button
		
		WebElement btn = driver.findElement(By.xpath("//input[@title='Sign in']"));
		
		btn.click();
		
		//Handling alerts using alert interface
		
		Alert alerts = driver.switchTo().alert();
		
		//get the text 
		
		String txt= alerts.getText();
		
		String valtxt ="Please enter a valid user name";
		
		if(txt.equals(valtxt))
		{
			System.out.println("Test passed");
		}
		else
		{
			System.out.println("Test failed");
		}
		
		alerts.accept();
		
		driver.quit();
		

	}

}
