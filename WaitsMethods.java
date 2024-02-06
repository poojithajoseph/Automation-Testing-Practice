package seleniumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitsMethods {

	public static void main(String[] args) throws MalformedURLException {
		/* Learning about waits
		 * implicitwait
		 * explicitwait
		 * fluentwait
		 */
		
		/*WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//using implicit method
		//its applicable to all the webelements mentioned in the code
		//it waits for 10 sec to locate that element
		//if the element is located before that it proceeds with that , it wont wait until the time out like Thread.sleep()
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		URL url = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(url);
		
		WebElement usrname = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		usrname.clear();
		usrname.sendKeys("abc@gmail.com");
		
		WebElement psw = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		psw.clear();
		psw.sendKeys("abctest");*/
		
		//explicit wait
		//it is executed based on the condition
		//it waits for the condition to be met and then waits for the specified time and then continues
		//it finds the element
		
		/*WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//declare the explicit waits
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		
		URL url = new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.navigate().to(url);


	    //usage of the explicit wait
		WebElement useranme=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		useranme.sendKeys("Admin");
		
		
		WebElement password=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
		password.sendKeys("admin123");*/
		
		//fluentwait
		//extended version of the explicit wait
		//it has different methods, polling and handling exception
        WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//Fluent wait declaration
				
		FluentWait mywait=new FluentWait(driver);
		mywait.withTimeout(Duration.ofSeconds(30));
	    mywait.pollingEvery(Duration.ofSeconds(5));
	    mywait.ignoring(NoSuchElementException.class);
		
			
		//usage
	    WebElement username=(WebElement) mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']")));
		username.sendKeys("Admin");
		
	}

}
