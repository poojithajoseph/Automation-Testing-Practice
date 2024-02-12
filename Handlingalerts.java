package seleniumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingalerts {

	public static void main(String[] args) throws MalformedURLException {
		// Handling the alert with ok button
		/*
		 * Three types of alert
		 * alert with ok button
		 * alert with ok and cancel button
		 * alert with promt (textbox)
		 */
		//alert with ok button
		ChromeDriver driver = new ChromeDriver();
		
		URL url = new URL("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.navigate().to(url);
		
		//maximize the browser window
		driver.manage().window().maximize();
		
		//adding implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//locating the web elements
		
		WebElement btn = driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']"));
		btn.click();
		
		//create a alert element using the alert class
		Alert okalert = driver.switchTo().alert();
		okalert.accept();

		
		
		WebElement txt = driver.findElement(By.xpath("//p[@id='result']"));
		String txtok = txt.getText();
		
		String valtxt = "You successfully clicked an alert";
		
		if(txtok.equals(valtxt))
		{
			System.out.println("The test is passed");
		}
		else
		{
			System.out.println("Test failed");
		}

	}

}
