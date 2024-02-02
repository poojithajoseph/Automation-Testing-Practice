package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathAxes {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		
		//To maximize the browser window
		driver.manage().window().maximize();
		
		//Self  - Selects the current node , output- KPI Green Energy
		WebElement selfnode = driver.findElement(By.xpath("//a[contains(text(),'KPI Green Energy')]/self::a"));
		System.out.println("Text of the self node "+selfnode.getText());
				
		//Identifying the parent node of the self node , output-KPI Green Energy--as the parent represents child innertext
		
		WebElement parentnode = driver.findElement(By.xpath("//a[contains(text(),'KPI Green Energy')]/parent::td"));
		System.out.println("Text of the parent node "+parentnode.getText());
		
		//Identifying the ancestor element
		WebElement ancestornode = driver.findElement(By.xpath("//a[contains(text(),'KPI Green Energy')]/ancestor::tr"));
		System.out.println("Text of the Ancestor node "+ancestornode.getText());
		
		//Identifying the child node of the self node
		//Identifying the child node of ancestor node as there are no child node for the self node
		List<WebElement> childnode = driver.findElements(By.xpath("//a[contains(text(),'KPI Green Energy')]/ancestor::tr/child::*"));
		System.out.println("No of Child Node " +childnode.size());//5
		
		//Identifying the descendents node of the ancestor node
		List<WebElement> descendantnode = driver.findElements(By.xpath("//a[contains(text(),'KPI Green Energy')]/ancestor::tr/descendant::*"));
		System.out.println("No of descendants " +descendantnode.size());//7
		
		//Identifying the preceding  of the ancestor node
		List<WebElement> precedingnode = driver.findElements(By.xpath("//a[contains(text(),'KPI Green Energy')]/ancestor::tr/preceding::td"));
		System.out.println("No of preceding of the ancestor " +precedingnode.size());
		
		//Identifying the following node of the ancestor
		
		List<WebElement> followingnode = driver.findElements(By.xpath("//a[contains(text(),'KPI Green Energy')]/ancestor::tr/following::tr"));
		System.out.println("No of following of the ancestor " +followingnode.size());
		
		//Identifying the preceding sibling of the ancestor node 
		List<WebElement> precedingsiblingnode = driver.findElements(By.xpath("//a[contains(text(),'KPI Green Energy')]/ancestor::tr/preceding-sibling::*"));
		System.out.println("No of Preceding-Sibling of the ancestor " +precedingsiblingnode.size());
		
		//Identifying the following sibling of the ancestor node
		List<WebElement> followingsiblingnode = driver.findElements(By.xpath("//a[contains(text(),'KPI Green Energy')]/ancestor::tr/following-sibling::*"));
		System.out.println("No of Following-Sibling of the ancestor " +followingsiblingnode.size());
		
		Thread.sleep(3000);
		driver.quit();
	
	}

}
