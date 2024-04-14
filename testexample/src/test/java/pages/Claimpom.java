package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class Claimpom {
	WebDriver driver;
	private By claimSection   = By.cssSelector("#app > div.oxd-layout > div.oxd-layout-navigation > aside > nav > div.oxd-sidepanel-body > ul > li:nth-child(11) > a > span");
	private By assignClaim_button = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div[2]/div[1]/button");
	private By EmployeeName = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input");
	private By selectFirstValue = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div[2]/div[1]/span");
	private By eventDropdown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div/div[2]/i");
	private By Event = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/div/div[2]/div[2]/span");
	private By currencyDropdown = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div/div[2]/i");
	private By currency = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/div/div[2]/div[2]/span");
	private By remarks = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div/div/div[2]/textarea");
	private By createButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/button[2]");
	private By SubmitButton = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[9]/button[2]");
	
	
	public Claimpom(WebDriver driver){
		this.driver = driver;
	}

	
	public void ClaimClick() {
		driver.findElement(claimSection).click();
	}
	
	public void CreateClaim() {
		driver.findElement(assignClaim_button).click();
	}
    
	public void EnterEmployeedetails() throws InterruptedException {
		Thread.sleep(2000);
		//driver.findElement(EmployeeName).sendKeys("Test");
//		Thread.sleep(2000);
		driver.findElement(eventDropdown).click();
		driver.findElement(Event).click();
		driver.findElement(currencyDropdown).click();
		driver.findElement(currency).click();
		driver.findElement(remarks).sendKeys("Test Remarks");
		driver.findElement(EmployeeName).sendKeys("Test");
    	driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(selectFirstValue).click();
		driver.findElement(createButton).click();	
	}
	public void submit() throws InterruptedException {

    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  JavascriptExecutor js = (JavascriptExecutor) driver;
		  js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println("7777777777");
		//js.executeScript("window.scrollBy(0,500)");
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(SubmitButton).click();
	}
}
