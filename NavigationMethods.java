package seleniumProject;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationMethods {

	public static void main(String[] args) throws MalformedURLException {
		/*Learning about Navigation Methods
		 * navigate().to()
		 * navigate().back()
		 * navigate().forward()
		 * navigate().refresh()
		 */
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//using implicit wait // waits till the mentioned duration to find the element
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		URL url= new URL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		URL url2 = new URL("https://demo.nopcommerce.com/register");
		
		driver.navigate().to(url);
		System.out.println("Get the Page Title " + driver.getTitle());
		
		driver.navigate().to(url2);
		System.out.println("Get the Page Title " + driver.getTitle());
		
		//navigating back to first webpage
		driver.navigate().back();
		System.out.println("Get the Page Title " + driver.getTitle());
		
		//navigating forward
		
		driver.navigate().forward();
		System.out.println("Get the Page Title " + driver.getTitle());
		
		//Refreshing the page
		driver.navigate().refresh();
		
		driver.quit();

	}

}
