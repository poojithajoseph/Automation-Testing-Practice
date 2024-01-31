package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLocatorPractice {

	public static void main(String[] args) throws InterruptedException {
		//Generating the customized xpaths
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		
		driver.manage().window().maximize();
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
				Thread.sleep(5000);
				//customized xpath-locators
				//using normalize-space() xpath function
				WebElement logoutbtn = driver.findElement(By.xpath("//*[normalize-space()='Logout']"));
				System.out.println(logoutbtn.getText());
				
				
				driver.quit();
				
				

	}

}
