package com.rp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rp.qa.base.TestBase;

public class CustomerDetails extends TestBase {

	@FindBy(xpath="//input[@id='firstName-field']")
	WebElement FnameObj;
	@FindBy(xpath="//input[@id='lastName-field']")
	WebElement LnameObj;
	@FindBy(xpath="//input[@id='birthDay-field']")
	WebElement BDayObj;
	@FindBy(xpath="//input[@id='birthMonth-field']")
	WebElement BMonthObj;
	@FindBy(xpath="//input[@id='birthYear-field']")
	WebElement ByearObj;
	@FindBy(xpath="//input[@id='privatePhone-field']")
	WebElement PhoneNumberObj;
	@FindBy(xpath="//input[@id='email-field']")
	WebElement EmailObj;
	@FindBy(xpath="//select[@id='country-field']")
	WebElement CountryObj;
	@FindBy(xpath="//input[@id='zipCode-field']")
	WebElement ZipcodObj;
	@FindBy(xpath="//input[@id='houseNumber-field']")
	WebElement HouseNumberObj;
	@FindBy(xpath="//input[@id='city-field']")
	WebElement CityObj;
	@FindBy(xpath="//input[@id='address1-field']")
	WebElement AddressObj;
	@FindBy(xpath="//label[@id='accept-field-w-lbl']")
	WebElement TermObj;
	@FindBy(xpath="//span[contains(text(),'Confirm your booking')]")
	WebElement ConfrimButtonObj;
	

   public CustomerDetails()
   {
	   PageFactory.initElements(driver, this);
	   
   }
   
   public void getCountry(String s)
   {
	   Select selectCountry= new Select(CountryObj);
	 selectCountry.selectByValue(s);
   }
   public void info(String Fname,String Lname,String Date,String Month,String Year,String Email,String Country,String Zipcode,String Address,String City,String HouseNumber,String PhoneNumber)
   {
	   FnameObj.sendKeys(Fname);
	   LnameObj.sendKeys(Lname);
	   BDayObj.sendKeys(Date);
	   BMonthObj.sendKeys(Month);
	   ByearObj.sendKeys(Year);
	   PhoneNumberObj.sendKeys( PhoneNumber);
	   EmailObj.sendKeys(Email);
	   getCountry(Country);
	   ZipcodObj.sendKeys(Zipcode);
	   HouseNumberObj.sendKeys(HouseNumber);
	   CityObj.sendKeys(City);
	   AddressObj.sendKeys(Address);
	   TermObj.click();
	   ConfrimButtonObj.click();
   }
}
