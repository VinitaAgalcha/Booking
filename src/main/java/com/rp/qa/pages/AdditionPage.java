package com.rp.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rp.qa.base.TestBase;

public class AdditionPage extends TestBase{
 
	
	@FindBy(xpath="/html/body/section/div/div[1]/div[2]/div[2]/div[1]/div[3]/div/div[3]/div/div[3]/div[1]/select")
	WebElement Product;
	
	@FindBy(xpath="/html/body/section/div/div[1]/div[2]/div[2]/div[3]/div/a/span[2]")
	WebElement ConfirmButtonStep2;
	
	public AdditionPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void SelectProduct()
	{
	
	Select proObj =new Select(Product);
	proObj.selectByIndex(2);
	}
	public void ExtraCriteria() throws InterruptedException
	{
		SelectProduct();
	   Thread.sleep(13000);
	}
	public CustomerDetails EXtra()
	{
	ConfirmButtonStep2.click();
	return new CustomerDetails();
	}
}
