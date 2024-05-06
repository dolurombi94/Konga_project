package testDatas;

import org.testng.annotations.DataProvider;

public class signindatas {
	
	@DataProvider(name="invalidsignuudata")
	public Object[][] invalidsignuudata()
	{
		return new Object[][] {
			{"dolurom@gmail.com","rombic123"},//invalid email valid password
		};
	};
	@DataProvider(name="signupdata")
	public Object[][] invalidsignupdata1()
	{
		return new Object[][] {
			{"dammytest2@gmail.com","Rombic111"}, //valid email invalid password
		};
	}
	@DataProvider(name="invalidsignuudata2")
	public Object[][] invalidsignuudata2()
	{
		return new Object[][] {
			{"Tyuidooss@gmail.com","comehere123"}, //invalid password invalid email
		};
	}
	@DataProvider(name="validsignuudata")
	public Object[][] validsignuudata()
	{
		return new Object[][] {
			{"dammytest2@gmail.com","rombic123"}//valid email and valid password
		};
	};



}
