package com.TestCase;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.Pages.HomePage;

public class HomeTest   {
	HomePage obj;
	public HomeTest()
	{
		super();
	}
	@BeforeClass
public void HomeTest() {
		
	obj=new HomePage();
}
	@Test
	public void Logout()
	{
		obj.logout();
	}
}
