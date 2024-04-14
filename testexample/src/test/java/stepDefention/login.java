package stepDefention;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import stepDefention.hooks;
import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.loginPage;

public class login {

WebDriver driver;
private loginPage log;

//    @Given("I am on the Orange HRM website")
//    public void i_am_on_the_orange_hrm_website() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandru\\OneDrive\\Desktop\\AutomationSupports\\Driver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
//        Thread.sleep(2000);
//    }

    @When("I enter valid username {string} and password {string}")
    public void i_enter_valid_username_and_password(String username, String password) {
//    	hooks hooksIns = new hooks(); // Create hooks instance
//        driver = hooksIns.getDriver();
    	hooks hooksIn = new hooks();
    	driver = hooksIn.getDriver();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
    }

    @Then("I should successfully log in to the application")
    public void i_should_successfully_log_in_to_the_application() throws IOException, InterruptedException {
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
        
    }
    @Then("I should not successfully log in to the application")
    public void i_should_not_successfully_log_in_to_the_application() throws InterruptedException, IOException {
    	 Thread.sleep(2000);
    	String errorMessage = driver.findElement(By.cssSelector("p[class='oxd-text oxd-text--p oxd-alert-content-text']")).getText();
    	System.out.println("PrintMessage        "+errorMessage);
    	String expectedErrorMessage = "Invalid credentials";
    	Assert.assertEquals(expectedErrorMessage, errorMessage);
    	 TakesScreenshot screenshot = (TakesScreenshot)driver;
         //Saving the screenshot in desired location
         File source = screenshot.getScreenshotAs(OutputType.FILE);
         //Path to the location to save screenshot
         FileUtils.copyFile(source, new File("C:\\Users\\chandru\\OneDrive\\Desktop\\AutomationSupports\\FailedUseCase.png"));
         System.out.println("Screenshot is captured");
         

         
    }

}
