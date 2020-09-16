package com.rp.qa.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.rp.qa.base.TestBase;
import com.rp.qa.pages.CustomerDetails;

public class TestCustomerPage extends TestBase {
	TestCustomerPage cust;
	CustomerDetails CustDetail;
	
	@DataProvider 
	public void getData()
	{
		System.out.println("test");
	}
  @Test(dataProvider="getData")
  public void CustomergetDetailTest() {
	  cust=new TestCustomerPage();
	  intiliazation();
	  
	//  CustDetail.info(Fname, Lname, Date, Month, Year, Email, Country, Zipcode, Address, City, HouseNumber, PhoneNumber);
	   
  }

private void initialization() {
	// TODO Auto-generated method stub
	
}
}
