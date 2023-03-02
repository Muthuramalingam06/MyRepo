package org.Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CUtility {
	public static WebDriver driver;
	
	public static void browserlaunch(String s) {
		if (s.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
		} 
		else if (s.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
		}
		else {
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();

		}
		
	}
	public static  void clickk(WebElement w) {
		w.click();
	}
	
	public static  String gettexts(List<WebElement> w) {
		String s="";
		for (WebElement x : w) {
			String text = x.getText();
			s=text+"\n"+s;
		}
		return s;
	}
	public static void selectbytext(WebElement w,String d ) {
		Select s = new Select(w);
		s.selectByVisibleText(d);
	}
	public static void selectbyIndex(WebElement w,int d  ) {
		Select s = new Select(w);
		s.selectByIndex(d);
		
	}
	public static void selectbyvalue(WebElement w,String d  ) {
		Select s = new Select(w);
		s.selectByValue(d);
	}
	 public static void  ImplicitlyWait(int a) {
			driver.manage().timeouts().implicitlyWait(a, TimeUnit.SECONDS);
		}
	 public static void click(WebElement e) {
			try {
				e.click();
				
			} catch (Exception d) {
				JavascriptExecutor je =(JavascriptExecutor)driver;
				je.executeScript("arguments[0].click()", e);
				
			}
			
		}
	 public static void quit() {
			driver.quit();
		}
	
	public static void urllanuch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	 public static void Sendkeys(WebElement e,String value) {
			try {
				e.sendKeys(value);
				
			} catch (Exception x) {
				JavascriptExecutor je =(JavascriptExecutor)driver;
				je.executeScript("arguments[0].setAttribute('value','"+value+"')", e);
			}
			
		}
	 public static String Gettext(WebElement w) {
		String text = w.getText();
		return text;
	}
	 
	 public static String GetAttribute(WebElement w, String arg) {
			String attri = w.getAttribute(arg);
			return attri;
		}
	 public static void KSendkeys(WebElement e,String value,Keys key) {
			try {
				e.sendKeys(value);
				
			} catch (Exception x) {
				JavascriptExecutor je =(JavascriptExecutor)driver;
				je.executeScript("arguments[0].setAttribute('value','"+value+"')", e);
			}
			
		}
	public static String GetTitle() {
		String title = driver.getTitle();
		return title;
		
	}
	
	static FileInputStream fi;
	static Workbook s;
	public static String GetExcelData(String fileloc  , int row , int cellnum ) {
		
		File f = new File(System.getProperty("user.dir")+ fileloc);
		try {
			 fi = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 s = new XSSFWorkbook(fi);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 Sheet sh = s.getSheet("Sheet1");
		 Row ro = sh.getRow(row);
		 Cell cell = ro.getCell(cellnum);
		 int type = cell.getCellType();
		 String value=null;
		 if (type==1) {
			 value = cell.getStringCellValue();
		}
		 else {
			 if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat sd = new SimpleDateFormat();
				 value = sd.format("dd-MMM-yyyy");
			}
			 
			 else {
				double nums = cell.getNumericCellValue();
				long num =(long)nums;
				 value = String.valueOf(num);
			}
		}
		return value;
		 
		
		
		
		
		
		
		
	}
	
	

}
