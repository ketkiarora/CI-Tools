package testCases;

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

public class TestContextMenu {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		
    	
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver,20).ignoring(StaleElementReferenceException.class);
		
		driver.get("http://172.29.57.252:8082/oasys");
		driver.manage().window().maximize();
	//	driver.findElement(By.linkText("Login to SPMS")).click();
		driver.findElement(By.id("j_username_txt")).sendKeys("sachinkaushik");
		driver.findElement(By.id("j_password_txt")).sendKeys("12345678");
		driver.findElement(By.xpath("(//*[contains(@type,'submit')])[2]")).click();
		/*Select select= new Select(driver.findElementByXPath("(//select[@ng-model='applicationProccess.selected'])[1]"));
		select.selectByIndex(1);
		driver.findElement(By.xpath("//button[contains(@ng-click,'getStarted')]")).click();
*/
		 new Select(driver.findElement(By.id("introApplicationProcess"))).selectByIndex(1);
		 
			
		 WebElement  submenu=driver.findElement(By.xpath("//li[@ng-repeat='report in header']"));
	     clickOn(driver,submenu, 10);
			
		 new Actions(driver).moveToElement(submenu).perform();
		 driver.findElement(By.xpath("//*[@id='style-1']/li[3]/a")).click();
		 driver.findElement(By.xpath("//*[@id='style-1']/li[3]/ul/li[1]/a")).click();
		
	}	 


		
	public static void clickOn(WebDriver driver, WebElement element, int timeout)
	{
		new WebDriverWait(driver,timeout).ignoring(StaleElementReferenceException.class).until(ExpectedConditions.elementToBeClickable(element));
		
				
	} 
		 
}
		 
		 
	
	


