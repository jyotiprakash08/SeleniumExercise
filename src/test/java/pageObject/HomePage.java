package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	
	By from=By.cssSelector("[id='origin'] [type='text']");
	By to=By.id("destination");
	By ok=By.cssSelector("button[class='btn btn-primary']");
	By opt=By.cssSelector("li[role='option']");
	
	public HomePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement OK()
	{
		return driver.findElement(ok);
	}
	
	public WebElement From()
	{
		return driver.findElement(from);
	}
	
	public List<WebElement> Opt()
	{
		return driver.findElements(opt);
	}
	
	public WebElement To()
	{
		return driver.findElement(to);
	}

}
