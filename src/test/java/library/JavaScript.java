package library;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScript {
  
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		int index =submenuInput(driver);
	}
	
	public static int  submenuInput(WebDriver driver)
	{
		 JavascriptExecutor js = ((JavascriptExecutor) driver);
      int submenuIndex=    (Integer) js.executeScript("var a= window.prompt('Enter Submenu  1. Strategy Management 2. Project Management 3. Process Management  4. Time Management 5.Problem Solving 6. Management Tool 7. Assessment Tool 8. Quality Management 9.Beta'); return a");
       
      System.out.println(submenuIndex);
      return (submenuIndex);
	  
			
	}
	public static int  toolInput(WebDriver driver)
	{
		 JavascriptExecutor js = ((JavascriptExecutor) driver);
      int submenuIndex=    (Integer) js.executeScript("window.prompt('Enter Submenu  1. Strategy Management 2. Project Management 3. Process Management  4. Time Management 5.Problem Solving 6. Management Tool 7. Assessment Tool 8. Quality Management 9.Beta')");
       
      System.out.println(submenuIndex);
      return (submenuIndex);
	  
			
	}
}
	
	

