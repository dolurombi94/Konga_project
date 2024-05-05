package testDatas;

import org.testng.annotations.DataProvider;

public class validSignUpDatas {
	
	@DataProvider(name="validsignupData")
	
	public Object[][] validsignupdata()
	{
		return new Object[][] {
			{"Damilola","Olurombi","dammytest2@gmail.com","08089209574","rombic123"}
		};
			
	}
}
