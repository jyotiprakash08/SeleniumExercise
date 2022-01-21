package Framework.SeleniumExercise_1;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObject.HomePage;


public class MainBase extends Base {

	//public WebDriver driver;
	
	public static Logger log=LogManager.getLogger(Test.class.getName());


	@Test
	public void system() throws IOException, InterruptedException
	{
		 driver=BrowserInformation();
		//String url=pro.getProperty("URL");

		driver.get("https://www.irctc.co.in/nget/train-search");
        log.info("page got opened");
        
		driver.manage().window().maximize();
		log.info("maximising page");
		
		Thread.sleep(9000);
        HomePage Hp=new HomePage(driver);
        
        Hp.OK().click();
        Hp.From().click();
        //Hp.To().click();
        Hp.From().sendKeys("Adra");
        String obj="Adra";
        for(int i=0;i<Hp.Opt().size();i++)
        {
           if(Hp.Opt().get(i).equals(obj))
           {
        	   Hp.Opt().get(i).click();
        	   break;
           }
        }
        log.info("Successfully login");
	    //driver.switchTo().alert().dismiss();
	}
}