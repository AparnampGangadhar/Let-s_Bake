package test_package;

import org.testng.Assert;
import org.testng.annotations.Test;

import base_package.Base_class;
import page_package.LOGIN_PAGE;
import uttility.Excel_uttility;

public class LOGIN_PAGE_TEST extends Base_class{
	
	
	
	
	@Test(priority=1)
	
	public void log() {
		
		
		
		loginobj.closepopup();
		
		loginobj.sigin_click();
		
		loginobj.check();
		
		
		

	}
	
	@Test(priority=2)
    public void datadriventest() throws Exception {
		
		loginobj= new LOGIN_PAGE(driver);

		
        String xl = "C:\\Users\\aparn\\OneDrive\\Desktop\\Salenium works\\letsbake(project)\\Letsbake.xlsx";
        
        String Sheet = "letsbake_login";   
        int rowCount = Excel_uttility.getRowCount(xl, Sheet);
        System.out.println("Row count = "+ rowCount);
        
                
        for (int i = 1; i <= rowCount; i++) {
        	
            driver.get("https://letsbake.ca/");

    		loginobj.closepopup();
    		loginobj.sigin_click();
        	
    		
            String UserName = Excel_uttility.getCellValueString(xl, Sheet, i, 0); // excel,sheet,row,column
            System.out.println("username : " + UserName);

            String Pwd = Excel_uttility.getCellValueString(xl, Sheet, i, 1);
            System.out.println("password : " + Pwd);

            loginobj.setvalues(UserName, Pwd);

            Thread.sleep(2000);
           
            String expectedurl = "https://letsbake.ca/my-account/";
            String actualurl = driver.getCurrentUrl();


            Assert.assertEquals(actualurl,expectedurl, "Login failed for username : " + UserName
            		);
                        
            if (actualurl.equals(expectedurl)) {
            	
                System.out.println("Login Sucess");
        }
            else {
        	System.out.println("Login Failed");
            }
        }
	}
}
	