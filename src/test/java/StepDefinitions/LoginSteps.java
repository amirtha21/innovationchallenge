package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import io.cucumber.java.en.*;
import junit.framework.Assert;
import pageObjects.Loginpage;

public class LoginSteps {
	
	public WebDriver driver;
	public Loginpage lp;
	
	@Given("User Launch Chrome browser")
	public void user_launch_chrome_browser() {
		
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver=new ChromeDriver();
		lp=new Loginpage(driver);
	  
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
	    
	}

	@When("User enters Email as {string}")
	public void user_enters_email_as(String email) {
		lp.setUserName(email);
		
	}

	@And("Click on Next")
	public void click_on_next() throws InterruptedException {
		lp.clickNext();
		Thread.sleep(3000);
	}

	@And("User enters Password as {string}")
	public void user_enters_password_as(String password) {
		lp.setPassword(password);

	}

	@And("Click on Login")
	public void click_on_login() throws InterruptedException {
		lp.clickLogin();
		driver.manage().window().maximize();
		Thread.sleep(3000);
			
	}

	
	@And("User click on Innovation Challenge screen")
	public void user_click_on_Innovation_Challenge_screen() throws InterruptedException {
		lp.clickInnovation();
		Thread.sleep(3000);

	}
	
	@When("click on SubmitIdea")
	public void click_on_SubmitIdea() throws InterruptedException  {
		lp.clickSubmitIdea();
		Thread.sleep(3000);
	   
	}
	
	@When("user enter Idea Title {string}")
	public void user_enter_idea_title(String olk) throws InterruptedException {
		lp.typeideatitle(olk);
		Thread.sleep(3000);

	}

	@When("user enter Describe an Idea {string}")
	public void user_enter_describe_an_idea(String nmk) throws InterruptedException {
		lp.typeideadescribe(nmk);
		Thread.sleep(3000);
		
	}

	@When("Click on Submit Idea")
	public void click_on_submit_idea() throws InterruptedException {
		lp.clickSubmitidea();
		Thread.sleep(3000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,4000)");
		Thread.sleep(3000);
	
	}
	
	@When("User enter comment other user {string}")
	public void user_enter_comment_other_user(String cmt)  {
        lp.TypeComment(cmt);
	    
	}

	@Then("User Click  on comments")
	public void user_submit_on_comments() {
		lp.Submitcomt();
		


	}

}
