package stepDefention;


import org.openqa.selenium.WebDriver;

import stepDefention.hooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.PIMUserCreationPage;
import pages.loginPage;

public class PIMUserAndDelete_POM {
	WebDriver driver;
	loginPage log;
	PIMUserCreationPage PIM;

	@When("I enter valid username {string} and password {string} POM method")
	public void i_enter_valid_username_and_password_POM(String username, String password) throws InterruptedException {
    	//hooks hooksInstance = new hooks(); // Create hooks instance
        //driver = hooksInstance.getDriver();
        hooks hooksIns = new hooks(); // Create hooks instance
        driver = hooksIns.getDriver();
        log = new loginPage(driver);
		Thread.sleep(2000);
		log.enterUsername(username);
		log.enterPassword(password);
	}

	@When("I click the login button POM method")
	public void i_click_the_login_button_POM() throws InterruptedException {
		log.enterLogin();


	}
	@When("I clicked the PIM section method")
	public void i_clicked_the_pim_section_method() throws InterruptedException {
		PIM = new PIMUserCreationPage(driver);
		Thread.sleep(2000);
		PIM.PIMClick();

	}

	@When("Clicked Add button and started creating User firstname {string} and middlename {string} and lastname {string}")
	public void clicked_add_button_and_started_creating_user(String firstName, String middleName, String lastName) throws InterruptedException {
		Thread.sleep(2000);
		PIM.AddClick();
		Thread.sleep(2000);
		PIM.createUser(firstName, middleName, lastName);
		PIM.Click();
	}

	    @Then("Saved the user {string}")
	    public void saved_the_user(String textMessage) throws InterruptedException {
	    	PIM.verifyText(textMessage);
	    	log.logout();
	    	
	    }
}
