package seleniumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingcheckBoxes {

	public static void main(String[] args) throws MalformedURLException {
		//Handling the Checkboxes
		//handling single checkbox
		//Handling multiple check box , checked and unchecked
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		
		
		URL url = new URL("https://www.ironspider.ca/forms/checkradio.htm");
		
		driver.navigate().to(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//capturing the single checkbox
		/*WebElement chkbox = driver.findElement(By.xpath("//input[@value='red']"));
		chkbox.click();*/
		
		//selecting the multiple checkbox
		//capturing all the checkboxes
		List<WebElement> chkboxlist = driver.findElements(By.xpath("//input[@type='checkbox' and @name='color']"));
		System.out.println(chkboxlist.size());
		
		//clicking all the checkbox
		//using enhanced for loop
		/*for(WebElement ele:chkboxlist)
		{
			ele.click();
		}*/
		
		//using the for loop
		//selecting all the checkbox
		/*for(int i=0;i<chkboxlist.size();i++)
		{
			chkboxlist.get(i).click();
			
		}*/
		
		//deselecting the checkbox
		/*for(WebElement ele:chkboxlist)
		{
			ele.click();
		}*/
		
		//selecting the last 2 checkbox
		/*for(int i=4;i<chkboxlist.size();i++)
		{
			chkboxlist.get(i).click();
		}*/
		
		//selecting the first 2 boxes
		for(int i=0;i<chkboxlist.size();i++)
		{
			if(i<2)
			{
				chkboxlist.get(i).click();
			}
		
		}
		//deselcting the checked box
		for(int i=0;i<chkboxlist.size();i++)
		{
			if(chkboxlist.get(i).isSelected())
			{
			chkboxlist.get(i).click();
			}
		}

	}

}
