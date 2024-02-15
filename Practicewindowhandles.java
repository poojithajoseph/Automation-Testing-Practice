package seleniumFrames;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicewindowhandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.get("https://testautomationpractice.blogspot.com/");
				
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		List<WebElement> searchlinks=driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//div/a"));
		
		System.out.println("Number of Links:"+ searchlinks.size());
		
		System.out.println("printing & clicking links................");
		for(WebElement link:searchlinks)
		{
			System.out.println(link.getText());
			link.click();
		}
		
		//After opening all the pages, capture windowid's
		Set<String> windowIds=driver.getWindowHandles();
		
		System.out.println("Switching to each browser window and getting the titles........"); 
		for(String winid:windowIds)
		{
			String title=driver.switchTo().window(winid).getTitle();
			System.out.println(title);
		}
		
		driver.quit();

	}

}
