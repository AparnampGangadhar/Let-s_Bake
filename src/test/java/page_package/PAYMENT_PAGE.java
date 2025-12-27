package page_package;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PAYMENT_PAGE {

	WebDriver driver;
	
	@FindBy(xpath="//button[@id=\"billing_address_not_found\"]") WebElement Enter_Address;
	@FindBy(xpath="//input[@id=\"billing_address_1\"]") WebElement Street_Address;
	@FindBy(xpath="//input[@name=\"billing_address_2\"]") WebElement Appartment;
	@FindBy(xpath="//input[@name=\"billing_city\"]") WebElement City;
	@FindBy(xpath="//span[@id=\"select2-billing_state-container\"]") WebElement Province;
	@FindBy(xpath="//input[@name=\"billing_postcode\"]") WebElement Postal_code;
	@FindBy(xpath="//*[@id=\"show-additional-fields-checkbox\"]") WebElement Ordernote;
	@FindBy(xpath="//*[@id=\"order_comments\"]") WebElement Order_comments;
	@FindBy(xpath="//*[@id=\"woo_order_tip_10\"]") WebElement Tips;
	@FindBy(xpath="//section[2]//footer//button[contains(@class,'flux-button')]") WebElement Continue_payment;
	
	
	public PAYMENT_PAGE(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
	
	
}
	
	public void Payment_Detailes() throws Exception {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(Enter_Address)).click();
		System.out.println("Billing Address Clicked");	
		
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(Street_Address));
		Street_Address.sendKeys("King Street West");
		System.out.println("Street Address entered ");
		
		Appartment.sendKeys("AB Skyline");
		System.out.println("Appartment Address Entered successfully");
		
		City.sendKeys("Toronto");
		System.out.println("city name entered successfully");
		
		
		 Province.click();
	     WebElement stateSearch = wait.until(ExpectedConditions.visibilityOfElementLocated(
	     By.xpath("//input[@class='select2-search__field']")));
	     stateSearch.sendKeys("Ontario");
	     stateSearch.sendKeys(Keys.ENTER);
	     System.out.println("Province selected");
		    
		 
		 Postal_code.sendKeys("M5V 2T6");
		 Postal_code.sendKeys(Keys.TAB); 
		 System.out.println("Postal code entered sucessfully");
	
		 Thread.sleep(2000); 
		 
		 wait.until(ExpectedConditions.elementToBeClickable(Ordernote)).click();
		 System.out.println("Order note checkbox ticked");
		 
		 wait.until(ExpectedConditions.visibilityOf(Order_comments)).sendKeys("Please call before delivery");
		 System.out.println("Order note given");
		 
		 wait.until(ExpectedConditions.elementToBeClickable(Tips)).click();
	     System.out.println("Tip selected");
	    
	     Thread.sleep(5000);
	     Continue_payment.click();
	     System.out.println("Continue payment clicked");
	     
		
	}
public void Screenshot() throws IOException {
		
		File s=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(s, new File("C:\\Users\\aparn\\OneDrive\\Desktop\\Salenium works\\ScreenShot\\Payment.png"));
		System.out.println("Successfully saved");
}
}



