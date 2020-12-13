package testCases;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;
import library.JavaScript;

public class KeyboardShortcuts {
	public static void main(String[] args) {
		
		int submenuIndex=0;
	WebDriverManager.chromedriver().setup();
	
	
	ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver,20).ignoring(StaleElementReferenceException.class);

/*	Scanner submenuScan=new Scanner(System.in);
	System.out.println("Select Submenu");
	System.out.println("1. Process Management");
	int submenuInput=submenuScan.nextInt();*/
	driver.get("http://172.29.57.252:8082/oasys");
	driver.manage().window().maximize();

	driver.findElement(By.id("j_username_txt")).sendKeys("sachinkaushik");
	driver.findElement(By.id("j_password_txt")).sendKeys("12345678");
	driver.findElement(By.xpath("(//*[contains(@type,'submit')])[2]")).click();
	 new Select(driver.findElement(By.id("introApplicationProcess"))).selectByIndex(1);


	 new Actions(driver).moveToElement(driver.findElement(By.xpath("//li[@ng-repeat='report in header']"))).perform();
    
	//int index=JavaScript.submenuInput(driver);
	 getSubmenu(driver,4);
	 
//	 JavaScript.toolInput(driver);
	 getTool(driver, 4, 3);
	 
	
   
	
	
}	 

	
	private static void Switch(String submenuInput) {
		
		
	}


	public static void getSubmenu(WebDriver driver, int i)
	{
		List<WebElement> menu= driver.findElements(By.xpath("//*[@id='style-1']/li"));
		menu.get(i).click();
		
	}
	public static void getTool(WebDriver driver, int j, int i)
	{  System.out.println(j);
	System.out.println(i);
		List<WebElement> tool= driver.findElements(By.xpath("//*[@id=\"style-1\"]/li["+(j+1)+"]/ul/li"));
		////*[@id=\"style-1\"]/li[1]/ul/li
		
		//*[@id="style-1"]/li[5]/ul/li[3]/a
		
		//*[@id="style-1"]/li[5]/ul/li
		
		//*[@id="style-1"]/li[5]/ul/li[3]/a//i
		tool.get(i).click();
		System.out.println(tool.get(i).getText());
		
	}
	
	
	

		
public static void TimeWait(WebDriver driver, WebElement element, int timeout)
{
	new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
	
			
} 


}
