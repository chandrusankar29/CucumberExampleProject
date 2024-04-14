package stepDefention;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import stepDefention.hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.loginPage;
import io.cucumber.java.en.Then;

public class actionKeys {
 WebDriver driver;
 private loginPage log;
 

    @Given("I am on the Orange HRMs website")
    public void i_am_on_the_orange_hrms_website() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandru\\OneDrive\\Desktop\\AutomationSupports\\Driver\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @When("I enters valid username {string} and password {string}")
    public void i_enters_valid_username_and_password(String username, String password) {
    	System.out.println("TestUser");
//    	hooks hooksInstance = new hooks(); // Create hooks instance
//        driver = hooksInstance.getDriver();
    	hooks hooksIns = new hooks();
    	driver = hooksIns.getDriver();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
    }

    @When("I clicked the login button")
    public void i_clicked_the_login_button() {
        driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
    }

	
   
	    @When("I click check possible action class functionalities")
	    public void i_click_check_possible_action_class_functionalities() throws InterruptedException, AWTException {
	    	Thread.sleep(2000);
//	    	WebElement ele = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span"));
//           Actions actions = new Actions(driver);
//           actions.moveToElement(ele).click().perform();
//           Thread.sleep(2000);
//           WebElement elem = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"));
//           actions.moveToElement(elem).click().sendKeys("Text").build().perform();
           
           WebElement myinfo = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[6]/a/span"));
           myinfo.click();
           Thread.sleep(2000);
           WebElement uploadImage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/div/img"));
           uploadImage.click();
           Thread.sleep(3000);
     
           Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
           StringSelection str = new StringSelection("C:\\Users\\chandru\\Hulk.png");
           clipboard.setContents(str, null);

           WebElement element = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[1]/div/div/div[2]/div/div/img"));
           element.click();
           Thread.sleep(2000);
           Robot robot = new Robot();
           robot.keyPress(KeyEvent.VK_CONTROL);
           robot.keyPress(KeyEvent.VK_V);
           Thread.sleep(2000);
           robot.keyRelease(KeyEvent.VK_CONTROL);
           robot.keyRelease(KeyEvent.VK_V);
           Thread.sleep(2000);
           robot.keyPress(KeyEvent.VK_ENTER);
           robot.keyRelease(KeyEvent.VK_ENTER);
           Thread.sleep(2000);
           WebElement submitButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div/form/div[2]/button"));
           submitButton.click();
	    }

	    @Then("I should successfully verified the functionality")
	    public void i_should_successfully_verified_the_functionality() {
	    	 log = new loginPage(driver);
	    	 log.logout();
	    }
	
	
}
