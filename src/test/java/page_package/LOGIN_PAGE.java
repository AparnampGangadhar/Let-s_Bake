package page_package;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import uttility.Excel_uttility;

public class LOGIN_PAGE {

	WebDriver driver;

@FindBy(xpath="//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img") WebElement popup;
@FindBy(xpath="//*[@id=\"menu-item-24\"]/a/span") WebElement Sigin_in;
@FindBy(xpath="//*[@id=\"username\"]") WebElement username;
@FindBy(xpath="//*[@id=\"password\"]") WebElement password;
@FindBy(xpath="//*[@id=\"rememberme\"]") WebElement Checkbox;
@FindBy(xpath="//*[@id=\"customer_login\"]/div[2]/form/p[3]/button") WebElement loginbtn;


public LOGIN_PAGE(WebDriver driver) {
	
	 this.driver = driver;
	 
     PageFactory.initElements(driver, this);	
     	
}


public void closepopup() {
	
	popup.click();
	System.out.println("popup closed");
	
	
}

public void tittle() {
	
	String exp_tittle="Lets Bake";
	
	String actual_tittle=driver.getTitle();
	
	if(exp_tittle.equals(actual_tittle))
	{
		
		System.out.println("Tittle Matching");
	}
	
	else {
		
		System.out.println(" Tittle not Mached");
	}
}

public void sigin_click() {
	
	Sigin_in.click();
	System.out.println("Sigin_in Button clicked");
	
	
}

public void check() {
	
	Checkbox.click();
	System.out.println("check box ticked");
	
}

public void setvalues(String Username, String Password) {

	
	username.sendKeys(Username);
	System.out.println("username clicked");
	
	password.sendKeys(Password);
	System.out.println("Password clicked");
	
	loginbtn.click();
	System.out.println("Login button cicked");
		
	

	
}
	
}

