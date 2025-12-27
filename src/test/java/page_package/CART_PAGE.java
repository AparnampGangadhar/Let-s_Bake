package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CART_PAGE {

	WebDriver driver;
	
    @FindBy(xpath="//*[@id=\"billing_email\"]") WebElement Email_address;
	@FindBy(xpath="//*[@id=\"billing_first_name\"]") WebElement Firstname;
	@FindBy(xpath="//*[@id=\"billing_last_name\"]") WebElement Lastname;
	@FindBy(xpath="//*[@id=\"billing_phone\"]") WebElement Phone;
	@FindBy(xpath="/html/body/div[2]/main/div/form/div/div[1]/div[3]/section[1]/footer/button") WebElement Continueaddress;

	
	
	public CART_PAGE(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
		
}
	public void cartdetailes() {
		
		Email_address.sendKeys("aparnagangadhar10@gmail.com");
		System.out.println("Email Address Entered");
		
		Firstname.sendKeys("Aparna");
		System.out.println("First Name is Entered");
		
		Lastname.sendKeys("MP");
		System.out.println("Last name is entered");
		
		Phone.sendKeys("8844552255");
		System.out.println("Phone number is entered");
		
		Continueaddress.click();
		System.out.println("Continue Address option clicked");
				
	}
	
}
