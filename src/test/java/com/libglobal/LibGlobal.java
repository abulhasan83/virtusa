package com.libglobal;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LibGlobal {

public static WebDriver dr;

public static void launch() {
	System.setProperty("webdriver.chrome.driver", "D:\\eclipse\\Cucumber\\Driver\\chromedriver.exe");
	dr = new ChromeDriver();
}

public static void loadUrl(String url) {
	dr.get(url);
	dr.manage().window().maximize();
}
	public static void typeText(WebElement e, String txt) {
		e.sendKeys(txt);
	}
	
	public static void clkBtn(WebElement e) {
		e.click();
	}
	
	public static String gText(WebElement e) {
		return(e.getText());
		
	}
	
	public static String gAttr(WebElement e,String attr) {
		return(e.getAttribute(attr));
	}
	
	public static String getData(int rowNo,int colNo) throws IOException {
		String value=null;
		File loc = new File("D:\\eclipse\\com.virtusa.test\\src\\test\\resources\\TestData\\products.xlsx");
		FileInputStream fin = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(fin);
		    Sheet s= w.getSheet("Sheet1");
		    Row r=s.getRow(rowNo);
		    Cell c = r.getCell(colNo);
		    int cellType = c.getCellType();
		    if(cellType==1) {
		    	value = c.getStringCellValue();
		    	
		    }
		    
		    return value;
	}
}
