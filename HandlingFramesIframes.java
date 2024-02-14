package seleniumFrames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingFramesIframes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//Frames
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//maximize the window
		driver.manage().window().maximize();
		
		//implicit waits
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//switch to the first frame
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		
		WebElement txtbox = driver.findElement(By.xpath("//input[@name='mytext1']"));
		txtbox.sendKeys("firstname");
		
		//switching back to the main frame
		
		driver.switchTo().defaultContent();
		
		//switching to Frame 2
		
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		WebElement txtbox2 = driver.findElement(By.xpath("//input[@name='mytext2']"));
		txtbox2.sendKeys("secondname");
		
		driver.switchTo().defaultContent();
		
		
		driver.switchTo().defaultContent();
		//frame 4
		WebElement frame4 = driver.findElement(By.xpath("//frame[@src='frame_4.html']"));
		driver.switchTo().frame(frame4);
		
		
		WebElement txtbox4 = driver.findElement(By.xpath("//input[@name='mytext4']"));
		txtbox4.sendKeys("Address");
		
		driver.switchTo().defaultContent();
		
		WebElement frm3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frm3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("QA Engineer");
		
		//locating the iframe
		driver.switchTo().frame(0); //as there is only one iframe

		//driver.findElement(By.cssSelector("div.AB7Lab")).click(); // select first radio button in frame   wFGF8
		driver.findElement(By.cssSelector("div.bzfPab")).click();
		Thread.sleep(10);
		driver.findElement(By.cssSelector("div.uVccjd")).click();
		driver.switchTo().defaultContent();
		
		driver.quit();
		

	}

}
