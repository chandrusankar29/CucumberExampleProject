package stepDefention;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import stepDefention.hooks;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.loginPage;
import io.cucumber.java.en.Then;
import pages.loginPage;




public class SaveAddressDetails {
	WebDriver driver;
	 private loginPage log;
//	@Given("I am on the Orange HRM Admin user")
//	public void i_am_on_the_orange_hrm_admin_user() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandru\\OneDrive\\Desktop\\AutomationSupports\\Driver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//	}

	@When("I logged in with valid username {string} and password {string}")
	public void i_logged_in_with_valid_username_and_password(String username, String password) {
		hooks hooksInss = new hooks(); // Create hooks instance
        driver = hooksInss.getDriver();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
        driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}

	@When("I clicked my info section")
	public void i_clicked_my_info_section() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[text()='My Info']")).click();
	}

	@When("I clicked Contact Details")
	public void i_clicked_contact_details() throws InterruptedException {
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[text()='Contact Details']")).click();	   
	}

	@When("i enter address details an cliked Save button")
	public void i_enter_address_details_an_cliked_save_button() throws InterruptedException {
		
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("No 8 kumaran st");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[2]/div/div[2]/input")).sendKeys("No 8 kumaran st");
		WebElement dropdown = driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-container > div.oxd-layout-context > div > div > div > div.orangehrm-edit-employee-content > div.orangehrm-horizontal-padding.orangehrm-vertical-padding > form > div:nth-child(3) > div > div:nth-child(6) > div > div:nth-child(2) > div > div > div.oxd-select-text-input"));
        dropdown.click();
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        WebElement option = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div[2]/div[4]"));
	    option.click();
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[4]/button")).click();
	}

	@Then("I should see success message")
	public void i_should_see_success_message() {
    System.out.println("Test completed");
    log = new loginPage(driver);
	log.logout();
    
	}
	

}
