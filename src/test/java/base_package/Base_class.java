package base_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import page_package.CART_PAGE;
import page_package.HOME_PAGE;
import page_package.LOGIN_PAGE;
import page_package.PAYMENT_PAGE;
import page_package.PRODUCT_PAGE;

public class Base_class {

	
	public WebDriver driver;
	
	public LOGIN_PAGE loginobj;
	
	public HOME_PAGE homeobj;
	
	public PRODUCT_PAGE productobj;
	
	public CART_PAGE cartobj;
	
	public PAYMENT_PAGE paymentobj;

	
	
	@BeforeClass
	
	public void Setup() {
		
		driver= new ChromeDriver();
		driver.get("https://letsbake.ca/");
		driver.manage().window().maximize();
		
	}

@BeforeMethod

public void objectmethod() {
	
	loginobj= new LOGIN_PAGE(driver);
	
	homeobj= new HOME_PAGE(driver);
	
	productobj = new PRODUCT_PAGE(driver);
	
	cartobj= new CART_PAGE(driver);
	
	paymentobj = new PAYMENT_PAGE(driver);
}
}


