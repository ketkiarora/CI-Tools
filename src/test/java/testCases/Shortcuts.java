package testCases;



import org.openqa.selenium.Keys;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;


public class Shortcuts {


public static void keySave(WebDriver driver)	
{
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL);
	 action.sendKeys("s");
     action.keyUp(Keys.CONTROL);
     action.build().perform();
}
public static void keyRename(WebDriver driver)	
{
	Actions action = new Actions(driver);
	action.keyDown(Keys.ALT);
	 action.sendKeys("r");
     action.keyUp(Keys.ALT);
     action.build().perform();
}
public static void keySaveAs(WebDriver driver)	
{
	Actions action = new Actions(driver);
	action.keyDown(Keys.ALT);
	 action.sendKeys("s");
     action.keyUp(Keys.ALT);
     action.build().perform();
}
public static void keyDeleteDoc(WebDriver driver)	
{
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL);
	 action.sendKeys("d");
     action.keyUp(Keys.CONTROL);
     action.build().perform();
}
public static void keyEnable(WebDriver driver)	
{
	Actions action = new Actions(driver);
	action.keyDown(Keys.CONTROL);
	 action.sendKeys("e");
     action.keyUp(Keys.CONTROL);
     action.build().perform();
}
	
	
}

