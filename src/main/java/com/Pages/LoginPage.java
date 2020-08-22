package com.Pages;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HRM.Testbase.TestBase;

public class LoginPage extends TestBase {
	String Username,Password;
	// locators
	// methods
	// page factory class to locate element
	@FindBy(id = "txtUsername")
	WebElement uname;

	@FindBy(id = "txtPassword")
	WebElement password;

	@FindBy(id = "btnLogin")
	WebElement login;

	@FindBy(linkText = "Forgot your password?")
	WebElement forgetpass;

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	public String verifyTitle() {
		return driver.getTitle();
	}

	public void Login () throws IOException
	{
		//DataDriven Excel File
		//Path of excel file
FileInputStream fis=new FileInputStream("E:\\java_program\\com.OrangeLivePOM\\src\\main\\resources\\LoginData.xls");
		
		// Move to Workbook
		HSSFWorkbook wb=new HSSFWorkbook(fis);
		// Open the specific sheet
		HSSFSheet sheet=wb.getSheet("LoginSheet");
	
		for(int i=1;i<=sheet.getLastRowNum();i++)
		{
			Username=sheet.getRow(i).getCell(0).getStringCellValue();
			Password=sheet.getRow(i).getCell(1).getStringCellValue();
		
			uname.sendKeys(Username);
			password.sendKeys(Password);
			login.click();
//	uname.sendKeys(prop.getProperty("username"));
//	password.sendKeys(prop.getProperty("password"));
//	login.click();
	}
	}
}