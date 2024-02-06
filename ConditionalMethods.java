package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConditionalMethods {

	public static void main(String[] args) throws InterruptedException {
		// Conditional Methods -- performed on webelements
		//isDisplayed
		//isEnabled
		//isSelected-- used for checkbox, radio buttons and drop menu
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed- checking the image is displayed
		WebElement imgdisplayed=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		
		System.out.println(imgdisplayed.isDisplayed()); //returns true
		
		//isEnabled -- checking the input box is enabled
		WebElement inputenabled = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		System.out.println(inputenabled.isEnabled()); //returns true
		
		//isSelected
		WebElement male_rd = driver.findElement(By.xpath("//input[@id='gender-male']"));
		male_rd.click();
		System.out.println(male_rd.isSelected());
		
		//filling the entire application
		
		//firstname
		WebElement firstname = driver.findElement(By.xpath("//input[@id='FirstName']"));
		firstname.sendKeys("John");
		//lastname
		WebElement lastname = driver.findElement(By.xpath("//input[@id='LastName']"));
		lastname.sendKeys("Mathew");
		
		//selecting the date of birth
		//Handling the drop menu
		//using select class(selectByVisibleText, selectByIndex, selectByValue)
		//selecting the date
		WebElement datedrp = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		Select drpvalue = new Select(datedrp);
		drpvalue.selectByValue("10");
		
		//selecting the month
		WebElement monthdrp = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		Select monthvalue = new Select(monthdrp);
		monthvalue.selectByVisibleText("March");
		
		//selecting the year
		WebElement yeardrp = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		Select yearvalue = new Select(yeardrp);
		yearvalue.selectByValue("2024");
		
		
		
		
		//email
		WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
		email.sendKeys("Johmathewtest@gmail.com");
		
		//company details
		WebElement company = driver.findElement(By.xpath("//input[@id='Company']"));
		company.sendKeys("TestCompany");
		
		//Newletter checkbox
		
		WebElement newsletter = driver.findElement(By.xpath("//input[@id='Newsletter']"));
		System.out.println(newsletter.isSelected()); // the newsletter option is preselected
		newsletter.click(); // deselects the checkbox
		System.out.println(newsletter.isSelected());
		
		
		
		//password
		WebElement psw = driver.findElement(By.xpath("//input[@id='Password']"));
		psw.sendKeys("Test123");
		System.out.println(psw.getText());
		
		//confirm Password
		WebElement confirmpsw = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		psw.sendKeys("Test123");
		
		
		//capture the links text present in the footer
		
		List<WebElement> footerlinks = driver.findElements(By.xpath("//div[@class='footer-block information']"))	;
		
		for(WebElement value:footerlinks)
		{
			System.out.println(value.getText());
		}
		//RegisterButton
		
		WebElement regbtn = driver.findElement(By.xpath("//button[@id='register-button']"));
		System.out.println(regbtn.isEnabled());
		regbtn.click(); 
		System.out.println("Password needs to be handled");
		
		Thread.sleep(5000);
		//driver.close(); // This closes the current window that is handled by the driver.
		driver.quit(); // this closes all the windows 
		

	}

}
