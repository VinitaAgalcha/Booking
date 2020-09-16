package com.rp.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.rp.qa.base.TestBase;


public class TestUtil extends TestBase{
	
	
	public static long Page_load_Timout= 50;
	public static long Implicit_wait=20;
  

	
	         public static void Screenshot() throws IOException
	         {
	        	File SS= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        	FileUtils.copyFile(SS,new File("C:\\Users\\lenovo\\Desktop\\Softwares\\BookingFramework\\Screenshots\\"+"test.jpg"));
	         }
	         
	         public static void Explicitwait(WebElement e) 
	         {
	        	 WebDriverWait wait = new WebDriverWait(driver, 40);
	        	 wait.until(ExpectedConditions.visibilityOf(e));
	        	 
	         }
	
			  public static void getDatafromExcel()
			   {
			  
			    try
			    {
			        FileInputStream file = new FileInputStream(new File("TestData.xlsx"));
			
			        //Create Workbook instance holding reference to .xlsx file
			        XSSFWorkbook workbook = new XSSFWorkbook(file);
			
			        //Get first/desired sheet from the workbook
			        XSSFSheet sheet = workbook.getSheetAt(0);
			
			        //Iterate through each rows one by one
			        Iterator<Row> rowIterator = sheet.iterator();
			        while (rowIterator.hasNext()) 
			        {
			            Row row = rowIterator.next();
			            //For each row, iterate through all the columns
			            Iterator<Cell> cellIterator = row.cellIterator();
			             
			            while (cellIterator.hasNext()) 
			            {
			                Cell cell = cellIterator.next();
			                //Check the cell type and format accordingly
			                switch (cell.getCellType()) 
			                {
			                    case Cell.CELL_TYPE_NUMERIC:
			                        System.out.print(cell.getNumericCellValue() + "t");
			                        break;
			                    case Cell.CELL_TYPE_STRING:
			                        System.out.print(cell.getStringCellValue() + "t");
			                        break;
			                }
			            }
			            System.out.println("");
			        }
			        file.close();
			    } 
			    catch (Exception e) 
			    {
			        e.printStackTrace();
			    }
				
 }

	
}

