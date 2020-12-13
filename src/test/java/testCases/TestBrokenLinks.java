package testCases;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBrokenLinks {
	public static void main(String[] args) throws Exception {
		
	
WebDriverManager.chromedriver().setup();
	
	
	ChromeDriver driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	WebDriverWait wait = (WebDriverWait) new WebDriverWait(driver,20).ignoring(StaleElementReferenceException.class);

	
	driver.get("http://172.29.57.252:8082/oasys");
	driver.manage().window().maximize();
	
	driver.findElement(By.id("j_username_txt")).sendKeys("sachinkaushik");
	driver.findElement(By.id("j_password_txt")).sendKeys("12345678");
	driver.findElement(By.xpath("(//*[contains(@type,'submit')])[2]")).click();
	List<WebElement> links= driver.findElements(By.tagName("a"));
	System.out.println(links.size());
	System.out.println(links);
	
	for(WebElement link: links)
	{
		String ele = link.getAttribute("href");
		
		URL url= new URL(ele);
		
		HttpURLConnection httpconn = (HttpURLConnection) url.openConnection();
		
		Thread.sleep(5000);
		
		httpconn.connect();
		
		int code= httpconn.getResponseCode();
		if (code>=400)
		{ System.out.println(url+ "url is broken----"+ code);
		
		}
		else{ System.out.println(url+ "url is valid----"+ code);
		
		}
			
		
		
		
		
		
		
		
	}
	
	
	
}
}
