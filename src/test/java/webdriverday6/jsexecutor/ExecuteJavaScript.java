package webdriverday6.jsexecutor;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ExecuteJavaScript {
	@Test
	public void testJavaScriptCalls() throws Exception
	{
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
			
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		String title = (String) js.executeScript("return document.title");
		//driver.getTitle();
	//	assertEquals("Google", title);
		
		long links = (Long) js.executeScript("var links = document.getElementsByTagName('A'); return links.length");
	//	assertEquals(42, links);
		WebElement searchLink = driver.findElement(By.id("lst-ib"));
		WebElementExtender.highlightElement(searchLink);	
		//driver.close();
			
	}
}