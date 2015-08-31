package hastingdirect;

import junit.framework.Assert;

import org.openqa.selenium.WebElement;

public class HastingCarInsurancePage extends BaseMain{
	
	
	
	public void itShouldgetCarInsuranceQuotes(){
		
		
		WebElement carinstab = doAction("xpath", OR.getProperty("carinsurancetab"));
		carinstab.click();

	//	WebElement carquote = doAction("xpath", OR.getProperty("quotetab"));
		//carquote.click();
		
		WebElement findcar = doAction("xpath", OR.getProperty("findvehicleone"));
		findcar.sendKeys("SF02UMO");
		
		WebElement clickfind = doAction("xpath", OR.getProperty("findvehicle"));
		clickfind.click();

		WebElement caraboutus = doAction("xpath", OR.getProperty("selectcar"));
		String aboutcartext = caraboutus.getText(); 
		Assert.assertEquals("Select your vehicle", aboutcartext);
		
		System.out.println("Show me the text : "  +aboutcartext );
		
		
	}

}
