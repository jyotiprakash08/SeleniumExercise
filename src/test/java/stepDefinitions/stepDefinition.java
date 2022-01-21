package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import pageObject.HomePage;

import org.junit.runner.RunWith;

import Framework.SeleniumExercise_1.Base;

@RunWith(Cucumber.class)
public class stepDefinition extends Base {

    @Given("^Initialize the browser with chrome$")
    public void initialize_the_browser_with_chrome() throws Throwable {
		 driver=BrowserInformation();

    }

    @Given("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
		driver.manage().window().maximize();
    	driver.get(strArg1);
    }

    @Given("^click on ok to remove the popup$")
    public void click_on_ok_to_remove_the_popup() throws Throwable {
    	  HomePage Hp=new HomePage(driver);        
          Hp.OK().click();
            }

    @When("^user enter \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enter_and(String arg1, String arg2) throws Exception { 	 
    	HomePage Hp=new HomePage(driver);        
    	Hp.From().click();
        Hp.From().sendKeys(arg1);
        
        for(int i=0;i<Hp.Opt().size();i++)
        {
        	if(Hp.Opt().equals(arg1))
        	{
        		Hp.Opt().get(i).click();
                break;
        	}
        }
        Hp.To().click();
        Hp.From().sendKeys(arg2);
        }

    @Then("^show the coresponding trains available$")
    public void show_the_coresponding_trains_available() throws Throwable {

    	driver.close();
    }

}