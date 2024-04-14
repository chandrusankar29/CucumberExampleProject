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
import pages.Claimpom;

public class login_POM {
	private WebDriver driver;
	private loginPage log;

    @Given("I am on the Orange HRM website POM")
    public void i_am_on_the_orange_hrm_website_POM() throws InterruptedException {
    	System.out.println(".................");
    	hooks hooksIns = new hooks();
    	driver = hooksIns.getDriver();
    	log = new loginPage(driver);
    	
     
    }

    @When("I enter valid username {string} and password {string} POM")
    public void i_enter_valid_username_and_password_POM(String username, String password) throws InterruptedException {
    	Thread.sleep(2000);
    	log.enterUsername(username);
    	log.enterPassword(password);
    }

    @When("I click the login button POM")
    public void i_click_the_login_button_POM() {
        log.enterLogin();
    }

    @Then("I should successfully log in to the application POM")
    public void i_should_successfully_log_in_to_the_application_POM() throws IOException, InterruptedException {
        String actualTitle = driver.getTitle();
        String expectedTitle = "OrangeHRM";
        Assert.assertEquals(expectedTitle, actualTitle);
        Thread.sleep(3000);
        TakesScreenshot screenshot = (TakesScreenshot)driver;
      //Saving the screenshot in desired location
      File source = screenshot.getScreenshotAs(OutputType.FILE);
      //Path to the location to save screenshot
      FileUtils.copyFile(source, new File("C:\\Users\\chandru\\OneDrive\\Desktop\\AutomationSupports\\PositiveCase.png"));
      System.out.println("Screenshot is captured");
      
      log.logout();
        
    }
}
