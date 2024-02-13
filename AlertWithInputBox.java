package seleniumProject;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWithInputBox {

	public static void main(String[] args) {
		// Handling he input box type alerts
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//adding the implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locating the button
		
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']"));
		btn.click();
		
		//Handling the alert using alert class
		
		Alert jsalert = driver.switchTo().alert();
		System.out.println(jsalert.getText());
		jsalert.sendKeys("hellooooo");
		
		//jsalert.accept();
		jsalert.dismiss();
		
		WebElement txt = driver.findElement(By.xpath("//p[@id='result']"));
		
		String orgtxt = txt.getText();
		
		
		
		String txtvalidate ="You entered: null";
		
		if(orgtxt.equals(txtvalidate))
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
