package testngtest;

import org.testng.annotations.Test;

public class IjmeetBaseTestClass extends IjmeetBaseClassMethods {

	@Test
	void checkButtonClickOrNot(){
		IjmeetBaseTestClass ob = new IjmeetBaseTestClass();
		ob.login();
		String titleOfPage = driver.getTitle();
		System.out.println("Title of login Page:-"+titleOfPage);

	}

}
