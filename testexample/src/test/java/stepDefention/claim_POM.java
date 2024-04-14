package stepDefention;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import stepDefention.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import pages.*;
import java.util.concurrent.TimeUnit;


public class claim_POM {
	
	private WebDriver driver;
	private loginPage log;
	
	private Claimpom cre;
	
	@When("I clicked claim section and clicked assign claim")
	public void i_clicked_claim_section_and_clicked_assign_claim() throws InterruptedException {

        
        hooks hooksInsa = new hooks();
    	driver = hooksInsa.getDriver();
    	cre = new Claimpom(driver);
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	cre.ClaimClick();
    	driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	cre.CreateClaim();
    	
	}

	@When("enter details and create claim")
	public void enter_details_and_create_claim() throws InterruptedException {
	  
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    	cre.EnterEmployeedetails();
		
	}
	@Then("Submit the claim form")
	public void submit_the_claim_form() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		cre.submit();
	   
	}


}
