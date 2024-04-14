	package hooks;
//	
//	import org.openqa.selenium.chrome.ChromeDriver;
//	
//	import io.cucumber.java.Before;
//	import org.openqa.selenium.WebDriver;
//	
//	
//	public class hooks {
//		public WebDriver driver;
//	@Before("@BrowserInitialization")
//	public void setUp() throws InterruptedException {
//	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandru\\OneDrive\\Desktop\\AutomationSupports\\Driver\\chromedriver.exe");
//	  driver = new ChromeDriver();
//	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//	  driver.manage().window().maximize();
//	  Thread.sleep(2000);
//	  System.out.println("DriverCheck123"+driver);
//	}
//	public WebDriver getDriver() {
//	    System.out.println("Driver     Check"+driver);
//		return driver;
//	
//	}
//	
//	}



//
//import org.openqa.selenium.chrome.ChromeDriver;
//import io.cucumber.java.Before;
//import io.cucumber.java.After;
//import org.openqa.selenium.WebDriver;
//
//public class hooks {
//    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
//
//    @Before("@BrowserInitialization")
//    public void setUp() throws InterruptedException {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\chandru\\OneDrive\\Desktop\\AutomationSupports\\Driver\\chromedriver.exe");
//        driver.set(new ChromeDriver());
//        driver.get().get("https://opensource-demo.orangehrmlive.com");
//        
//        driver.get().manage().window().maximize();
//        System.out.println("_+__+__+__+__+__+__+__+__+__+__+_");
//    }
//
//    public WebDriver getDriver() {
//        WebDriver currentDriver = driver.get();
//        if (currentDriver == null) {
//            throw new RuntimeException("WebDriver instance not initialized. Please call setUp before using getDriver");
//        }
//        return currentDriver;
//    }
//    
//    @After("@logout")
//    public void logout() {
//    	System.out.println("CLOSING THE BROWSER");
//    	 driver.get().quit();
//    	
//    }
//    
//    
//    
//}
