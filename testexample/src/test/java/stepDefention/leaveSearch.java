package stepDefention;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import stepDefention.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.loginPage;
import io.cucumber.java.en.Then;


public class leaveSearch {
	

	WebDriver driver;
	private loginPage log;


    @When("Im enters valid username {string} and password {string}")
    public void i_enters_valid_username_and_password(String username, String password) {
//    	hooks hooksInstance = new hooks(); // Create hooks instance
//        driver = hooksInstance.getDriver();
    	hooks hooksIns = new hooks();
    	driver = hooksIns.getDriver();
        driver.findElement(By.cssSelector("input[name='username']")).sendKeys(username);
        driver.findElement(By.cssSelector("input[name='password']")).sendKeys(password);
    }

    @When("Im clicked the login button")
    public void i_clicked_the_login_button() {
        driver.findElement(By.cssSelector("button[class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
    }
    
	@When("check")
	public void check() throws InterruptedException {
		
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(3) > a > span")).click();
    	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		WebElement Fromdate = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
		Actions actions = new Actions(driver);
		actions.click(Fromdate).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Fromdate.sendKeys("2024-01-01");
		
		WebElement Todate = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
		actions.click(Todate).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();
		Todate.sendKeys("2024-11-11");
		
		WebElement StatusDropDown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[1]/div[1]"));
		StatusDropDown.click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div[2]/div[1]/span")).click();
        
	    WebElement LeaveTypeDropDown = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div/div[1]"));
	    LeaveTypeDropDown.click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div[2]/div[2]/span")).click();
        
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input")).sendKeys("manda akhil user");
	    
	    WebElement subunit = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div[1]/div[1]"));
	    subunit.click();
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/span")).click();
        
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[3]/button[2]")).click();
	    
	}

	@Then("check checks")
	public void check_checks() {
		log = new loginPage(driver);
   	    log.logout();
		
	}

	
   

}
