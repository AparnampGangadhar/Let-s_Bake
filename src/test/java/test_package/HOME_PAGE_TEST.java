package test_package;

import org.testng.annotations.Test;

import base_package.Base_class;

public class HOME_PAGE_TEST extends Base_class {
	

	@Test(priority=1)
	
	public void option() {
		
		homeobj.popup();
		
		homeobj.searchoption();
		
	}
	

@Test(priority=2)

public void btn() {
	
	homeobj.searchbtn();
}

@Test(priority=3)

public void drpdwn() {
	
	homeobj.dropdown();
	
}

@Test(priority=4)
public void scroll() {
	
	homeobj.scroll_down();
}

@Test(priority=5)
public void cake_selected() {
	
	homeobj.cake_selectoption();
}
}
