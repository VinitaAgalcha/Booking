package com.rp.qa.testcases;

import org.testng.annotations.Test;

import com.rp.qa.base.TestBase;
import com.rp.qa.pages.AdditionPage;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class AdditionTestCase extends TestBase{
	AdditionTestCase Add;
	AdditionPage AddLocator;
	
    
  @Test(dependsOnMethods={"searchTest"})
  public void additionTest() throws InterruptedException {
	  Add= new AdditionTestCase();
	  intiliazation();
	  AddLocator= new AdditionPage();
	  AddLocator.ExtraCriteria();
  }

  

}
