package hastingdirecttests;

import hastingdirect.HastingCarInsurancePage;

import org.testng.annotations.Test;

public class HastingCarInsuranceTest extends BaseMainTest{

	HastingCarInsurancePage hastingtext = new HastingCarInsurancePage();
	
	@Test
	public void itShouldCheckCarInsurancePageText(){
		
		hastingtext.itShouldgetCarInsuranceQuotes();
		
	}
}
