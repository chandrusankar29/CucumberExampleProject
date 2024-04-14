package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PIMUserCreationPage {
	WebDriver driver;

	private By txt_PIM = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span");
	private By txt_AddButtonClick = By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button");
	private By txt_FirstName = By.cssSelector("input[name='firstName']");
	private By txt_MiddleName = By.cssSelector("input[name='middleName']");
	private By txt_LastName = By.cssSelector("input[name='lastName']");
	private By PIM_SaveButton = By.cssSelector("button[type='submit']");
	private By PIM_RoasterMessage = By.xpath("//*[@id=\"oxd-toaster_1\"]/div/div[1]/div[2]/p[2]");
	
	
	public PIMUserCreationPage(WebDriver driver){
		this.driver = driver;
	}
	
public void PIMClick() {
		driver.findElement(txt_PIM).click();
	}
public void AddClick() {
	driver.findElement(txt_AddButtonClick).click();
}

public void createUser(String firstName) {
	driver.findElement(txt_FirstName).sendKeys(firstName);
}

public void createUser(String firstName, String middleName, String lastName) {
	driver.findElement(txt_FirstName).sendKeys(firstName);
	driver.findElement(txt_MiddleName).sendKeys(middleName);
	driver.findElement(txt_LastName).sendKeys(lastName);
}

public void Click() {
	driver.findElement(PIM_SaveButton).click();
}
public void verifyText(String textMessage) throws InterruptedException {
	Thread.sleep(2000);
	WebElement element = driver.findElement(PIM_RoasterMessage);
	 String actualTitle = element.getText();
	 System.out.println("Verifed Text"+actualTitle);
     String expectedTitle = textMessage;
     Assert.assertEquals(expectedTitle, actualTitle);
}



}
