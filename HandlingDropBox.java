package seleniumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingDropBox {

	public static void main(String[] args) throws MalformedURLException {
		// Handling Drop Boxes
		//using select class
		//without select class
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		URL url = new URL ("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		
		driver.navigate().to(url);
		//implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		 //using the select class
		WebElement drpcountry = driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drpitems = new Select(drpcountry);
		
		//using different methods
		//selectByVisibletext, selectByValue, selectByIndex
		drpitems.selectByVisibleText("Brazil");
		
		//listing all the items in the dropbox
		//using getOptions() method to list all the items in the dropbox
		List<WebElement> options = drpitems.getOptions();
		System.out.println(options.size());
		
		for(WebElement value:options)
		{
			System.out.println(value.getText());
		}
		
		//Capturing the state
		
		WebElement drpstate = driver.findElement(By.xpath("//select[@id='state-list']"));
		Select drpstateitems = new Select(drpstate);
		
		//using different methods
		//selectByVisibletext, selectByValue, selectByIndex
		drpstateitems.selectByVisibleText("Ceara");
		
		//listing all the items in the dropbox
		//using getOptions() method to list all the items in the dropbox
		List<WebElement> stateoptions = drpstateitems.getOptions();
		System.out.println(stateoptions.size());
		
		for(WebElement statevalue:stateoptions)
		{
			System.out.println(statevalue.getText());
		}
		
		//handling woithout select class
		List<WebElement> countrydrp = driver.findElements(By.xpath("//select[@id='country-list']//option"));
		countrydrp.size();
		
		for(WebElement items:countrydrp)
		{
			if(items.getText().equals("Brazil"))
			{
				items.click();
				break;
			}
		}
		
		List<WebElement> statedrp = driver.findElements(By.xpath("//select[@id='state-list']//option"));
		statedrp.size();
		
		for(WebElement items:statedrp)
		{
			if(items.getText().equals("Sao Paulo"))
			{
				items.click();
				break;
			}
		}
		
		driver.quit();
	}

}
