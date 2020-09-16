package com.rp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.rp.qa.base.TestBase;
import com.rp.qa.util.TestUtil;

public class SearchPage extends TestBase {
	
	
	@FindBy(partialLinkText="your travel party")
	WebElement SubButton;
	
	@FindBy(xpath="//select[contains(@name,'subjectgroup:2:subject:1:quantity:dropdown')]")
	WebElement adult;
		 
	@FindBy(xpath="//a[text()='Save']")
	WebElement SaveButton;
	
	@FindBy(id="ida3")
	WebElement CalendarButton;
	
	@FindBy( linkText="19")
	WebElement arrivaldate;
	
	@FindBy( linkText="23")
	WebElement Departuredate;
	
	@FindBy(id="id100")
	WebElement ApplyButton;
	
	@FindBy(id="id91")
	WebElement ConfirmButton;
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public void dropdown()
	{
	Select subj = new Select(adult);
	 subj.selectByIndex(2);
	}
	 public void selectCriteria() throws InterruptedException
	 {   
		 TestUtil.Explicitwait(SubButton);
		 SubButton.click();
	    // TestUtil.Explicitwait(SubButton);
		 dropdown();
		 TestUtil.Explicitwait(SaveButton);
		 SaveButton.click();
		 CalendarButton.click();
		// Thread.sleep(10000);
	     arrivaldate.click();
		 Departuredate.click();
		 ApplyButton.click();
	//	 Thread.sleep(10000);
		 ConfirmButton.click();
	 }
	
	public AdditionPage Search()
		{
		ConfirmButton.click();
		return new AdditionPage();
		
	}

}
