package com.rp.qa.testcases;

import org.testng.annotations.Test;

import com.rp.qa.base.TestBase;
import com.rp.qa.pages.SearchPage;
import com.rp.qa.util.TestUtil;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class TestSearchPage extends TestBase {
	TestSearchPage Test1;
	SearchPage s;
	TestUtil scr;
  @BeforeMethod
  public void beforeMethod() {
	  Test1= new TestSearchPage();
	  intiliazation();
	  s= new SearchPage();
	  scr= new TestUtil();
  }
  @Test
  public void searchTest() throws InterruptedException, IOException {
	
	  s.selectCriteria();
	 scr.Screenshot();
	  System.out.println("Test");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
