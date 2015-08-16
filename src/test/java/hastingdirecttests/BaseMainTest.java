package hastingdirecttests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import hastingdirect.BaseMain;

public class BaseMainTest {
	
	BaseMain base = new BaseMain(); 
	
	
	@BeforeMethod
	public void setUp(){
		
		base.openBrowser();
	}
	
	
	@AfterMethod
	public void shutDown(){
		
		base.closeBrowser();
	}

}
