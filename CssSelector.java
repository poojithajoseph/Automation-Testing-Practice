package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelector {

	public static void main(String[] args) 
	{
		
      //using different css selectors
		//Tag & id
		//tag & class
		//tag & attribute
		//tag ,class & attribute.
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		
		//locating using tag and id
		WebElement username1 = driver.findElement(By.cssSelector("input#Email"));
		username1.clear();
		username1.sendKeys("admin@yourstore.com");
		
		//using tag,class,attribute
		WebElement username = driver.findElement(By.cssSelector("input.email[type='email']"));
		username.clear();
		username.sendKeys("admin@yourstore.com");
		
		//using tag and attribute
		WebElement psw = driver.findElement(By.cssSelector("input[type='password']"));
		psw.clear();
		psw.sendKeys("admin");
		
		//locating using tag and class
		
		WebElement loginbtn = driver.findElement(By.cssSelector("button.button-1"));
		loginbtn.click();
		
		driver.quit();
		
	}

}
