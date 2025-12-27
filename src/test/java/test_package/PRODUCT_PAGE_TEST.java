package test_package;


import org.testng.annotations.Test;

import base_package.Base_class;

public class PRODUCT_PAGE_TEST extends Base_class {
	
@Test(priority=1)
	
	public void log() {
		
		
		loginobj.closepopup();
		
		loginobj.sigin_click();
		
		loginobj.check();		
}

@Test(priority=2)

public void option() {
	
	//homeobj.popup();
	
	homeobj.searchoption();
	
}


@Test(priority=3)

public void btn() {

homeobj.searchbtn();

}


@Test(priority=4)

public void drpdwn() {

homeobj.dropdown();

}


@Test(priority=5)
public void scroll() {

homeobj.scroll_down();

}


@Test(priority=6)
public void cake_selected() {

homeobj.cake_selectoption();

}



@Test(priority=7)
public void detailesofcake() {
	
	productobj.cake_detailes();
	
}
}