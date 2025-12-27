package page_package;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HOME_PAGE {

	WebDriver driver;
	
	
	@FindBy(xpath="//*[@id=\"sgpb-popup-dialog-main-div-wrapper\"]/div/img") WebElement Popup;

	@FindBy(xpath="//*[@id=\"dgwt-wcas-search-input-1\"]") WebElement Search;

	@FindBy(xpath="//*[@id=\"menu-item-4733\"]/div/form/div/button") WebElement Search_button;
	
	@FindBy(xpath="//select[@name=\"orderby\"]") WebElement sortdropdown;
	
	@FindBy(xpath="//*[@id=\"ajax-content-wrap\"]/div[1]/div/div[2]/div[2]/ul/li[5]/div[2]/div/div/a/span[2]") WebElement selectoption;

	public HOME_PAGE(WebDriver driver) {

		this.driver = driver;

		PageFactory.initElements(driver, this);
		

	}
	
	public void popup() {
		
		Popup.click();
		System.out.println("popup closed");
	}
	
	public void searchoption() {
		
		Search.click();
		Search.sendKeys("Cake");
		System.out.println("cake option entered");
	}
	
	
	public void searchbtn() {
		Search_button.click();
		System.out.println("Search button clicked");
	}

public void dropdown() {
	
	Select ob=new Select(sortdropdown);
	ob.selectByIndex(4);
	System.out.println("option choosed");
}


public void scroll_down() {
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

	
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.scrollBy(0,900)");
    System.out.println("page scrolled down sucessfully");
}

public void cake_selectoption() {
	
	selectoption.click();
	System.out.println("cake selected");
}


}
