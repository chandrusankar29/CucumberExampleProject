package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class loginPage {
	WebDriver driver;
	private By txt_username = By.cssSelector("input[name='username']");
	
	private By txt_password = By.cssSelector("input[name='password']");
	
	//private By txt_login = By.cssSelector("button[type='submit']");)
	private By txt_login = By.cssSelector("button[type='submit']");
	private By txt_logoutMenu  = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i");
	private By txt_logout  = By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a");
	
	
	
	public loginPage(WebDriver driver){

		this.driver = driver;
	
	}
	
public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
	}

public void enterLogin() {
	
	driver.findElement(txt_login).click();
}

public void logout() {
	
	driver.findElement(txt_logoutMenu).click();
	driver.findElement(txt_logout).click();
	
}


}
