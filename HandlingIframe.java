package seleniumFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		
		driver .get("http://the-internet.herokuapp.com/iframe");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		driver.switchTo().frame(frame);
		
		WebElement txt = driver.findElement(By.xpath("//p[normalize-space()='Your content goes here.']"));
		System.out.println(txt.getText());
		txt.clear();
		
		txt.sendKeys("Hello ,Its Me");
		//switches back to the main frame
		driver.switchTo().defaultContent();
		driver.quit();

	}

}
