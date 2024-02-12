package seleniumProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalerttwobuttons {

	public static void main(String[] args) {
		// Handling the alert with 2 buttons ok and cancel
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//maximize the window 
		driver.manage().window().maximize();
		//adding the implicit waits
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locating the button
		
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']"));
		btn.click();
		
		//use the alert class to handle the alerts
		Alert alertbtn =driver.switchTo().alert();
		System.out.println(alertbtn.getText());
		//alertbtn.accept();
		alertbtn.dismiss();
		
		//validating the textbox 
		
		WebElement txtbox = driver.findElement(By.xpath("//p[@id='result']"));
		String orgtext = txtbox.getText();
		String valtext = "You clicked: Ok";
		
		if(orgtext.equals(valtext))
		{
			System.out.println("OK button was clicked");
		}
		else
		{
			System.out.println("Cancel Button was clicked");
		}
		
		driver.quit();
		
	}

}
