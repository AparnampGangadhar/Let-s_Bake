package page_package;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PRODUCT_PAGE {

	WebDriver driver;
	
	//@FindBy(xpath="//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img")WebElement productpage_popup;
	@FindBy(xpath="//div[@class=\"inside\"]") WebElement size;
	@FindBy(xpath="//*[@id=\"yith-wapo-option-1445-1\"]/label") WebElement menu;
	@FindBy(xpath="//select[@id=\"yith-wapo-1449\"]") WebElement Flavordropdown;
	@FindBy(xpath="//select[@id=\"yith-wapo-1446\"]") WebElement cakecolour;
	@FindBy(xpath="//*[@id=\"yith-wapo-1625\"]") WebElement Cakewriting;
	@FindBy(xpath="//*[@id=\"yith-wapo-1438-0\"]") WebElement comment;
	@FindBy(xpath="//input[@id=\"yith-wapo-1450-0\"]") WebElement Disclosure_checkbox;
	@FindBy(xpath="//*[@id=\"product-5467\"]/div[1]/div[2]/form/button") WebElement Addtocart;
	
	
	public PRODUCT_PAGE(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
		
	}
	
	public void cake_detailes() {
		
		
		//productpage_popup.click();
	System.out.println("pop up closed");

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    wait.until(ExpectedConditions.elementToBeClickable(size)).click();
	    System.out.println("cake size selected");

	    wait.until(ExpectedConditions.elementToBeClickable(menu)).click();
	    System.out.println("Cake menu choosed");


	    Select flavour = new Select(Flavordropdown);
	    flavour.selectByIndex(4); 
	    System.out.println("cake flavor choosed");

	    
	    Select color = new Select(cakecolour);
	    color.selectByIndex(1);
	    System.out.println("cake color choosed");

	    
	    Select writing = new Select(Cakewriting);
	    writing.selectByIndex(2);
	    System.out.println("Cake writing done");


	    comment.sendKeys("Kindly provide the cake early, if possible");
	    System.out.println("Comment Entered Sucessfully");

	    Disclosure_checkbox.click();
	    System.out.println("Disclosure option ticked");

	    Addtocart.click();
	    System.out.println("Add to cart option clicked");

	}

	}
	
