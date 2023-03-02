package org.Tests;


import java.util.List;

import org.Locators.Altromutual;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import org.Utility.CUtility;
import org.Utility.ExtendsReport;

public class Altro extends CUtility {
	static Altromutual a;
	 static SoftAssert s;
	 static String f="\\src\\test\\resources\\Excel\\altro mutual data (2).xlsx";
	@BeforeClass
	private void beforeclass() {
		browserlaunch("chrome");
		ExtendsReport.StartReport();

	}
	@BeforeMethod
	private void BeforeMethod() {
		
		urllanuch(GetExcelData(f, 8, 0));
		

	}
	//login with invalid cretintails
	@Test(enabled=true)
	private void test() {
		ImplicitlyWait(10);
		s= new SoftAssert();
		a= new Altromutual();
		boolean d1 = GetTitle().contains("Altro Mutual");
		s.assertTrue(d1);
		clickk(a.getSignup());
		Sendkeys(a.getUser(), GetExcelData(f, 2, 0));
		boolean d2 = a.getUser().getAttribute("value").contains("demo_user");
		s.assertTrue(d2);
		Sendkeys(a.getPass(), GetExcelData(f, 2, 1));
		boolean d3 = a.getPass().getAttribute("value").contains("demo_password");
		s.assertTrue(d3);
		click(a.getBtnSubmit());
		boolean d4 = a.getGetErrormsg().getText().contains("Login Failed");
		s.assertTrue(d4);
		System.out.println(Gettext(a.getGetErrormsg()));
		}
	//login with valid cretintailsn
	@Test
	private void test3() {
		ImplicitlyWait(10);
		s= new SoftAssert();
		a= new Altromutual();
		boolean d1 = GetTitle().contains("Altoro Mutual");
		System.out.println(GetTitle());
		s.assertTrue(d1);
		click(a.getSignup());
		Sendkeys(a.getUser(), GetExcelData(f, 1, 0));
		boolean d2 = a.getUser().getAttribute("value").contains("admin");
		s.assertTrue(d2);
		Sendkeys(a.getPass(), GetExcelData(f, 1, 1));
		boolean d3 = a.getPass().getAttribute("value").contains("admin");
		s.assertTrue(d3);
		click(a.getBtnSubmit());
		boolean d4 = a.getSuccessmsg().getText().contains("Congratulations!");
		s.assertTrue(d4);
		click(a.getSummary());
		selectbyvalue(a.getAccount(), "800001");
		click(a.getGo());
		System.out.println(Gettext(a.getAvalabile()));
		click(a.getTransferfunds());
		selectbyvalue(a.getFromAccount(), GetExcelData(f, 5, 0));
		selectbyvalue(a.getToAccount(), GetExcelData(f, 5, 1));
		Sendkeys(a.getTransferAmount(),  GetExcelData(f, 5, 2));
		click(a.getTransfer());
		boolean d6 = Gettext(a.getMessage()).contains("9876.0 was successfully transferred from Account 800000 into Account 800001");
		s.assertTrue(d6);
		click(a.getRecentTransction());
		System.out.println(Gettext(a.getFrow()));
		System.out.println(Gettext(a.getSrow()));
		click(a.getContactus());
		click(a.getOnlinefrom());
		Sendkeys(a.getComment(), GetExcelData(f, 11, 0));
		click(a.getSubmit());
		boolean d7 = Gettext(a.getCompletemsg()).equals("Thank You");
	   s.assertTrue(d7);
	   s.assertAll();
	   System.out.println(d7);
	   click(a.getSignoff());
	   System.out.println(Gettext(a.getAccountlink()));
	   boolean d9 = Gettext(a.getAccountlink()).equals("ONLINE BANKING LOGIN");
	   s.assertTrue(d9);
		}
	
	
	@AfterMethod
	private void afterMethod(ITestResult sc) {
		ExtendsReport.createReport(sc);

	}
	@AfterClass
	private void AfterClass() {
		ExtendsReport.EndReport();
		quit();
		

	}

}
