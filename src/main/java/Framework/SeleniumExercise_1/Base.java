package Framework.SeleniumExercise_1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	public WebDriver driver;
	public Properties pro;
	public String url;
	
	public WebDriver BrowserInformation() throws IOException {

		Properties pro=new Properties();
	    FileInputStream fs=new FileInputStream("D:\\java\\SeleniumExercise-1\\src\\test\\java\\resource\\data.properties");
	    pro.load(fs);
	    
	    String BrowserName= pro.getProperty("Browser");
	    System.out.println(BrowserName);
	      
	    if(BrowserName.equals("Chrome"))
	    {
			System.setProperty("webdriver.chrome.driver", "D:/Lib/chromedriver.exe");
		    System.out.println(BrowserName);

			 driver=new ChromeDriver();
	    }
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	    return driver;
	}
}
