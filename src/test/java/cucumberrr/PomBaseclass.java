package cucumberrr;
import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;



import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

	import java.io.File;
import java.io.FileInputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class PomBaseclass {
		static WebDriver driver;

		public static WebDriver launch(String url) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dhamodharan\\eclipse-workspace\\SeleniumLocators\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			return driver;
		}

		public static void type(WebElement e, String n) {
			e.sendKeys(n);
		}

		public static void clickBtn(WebElement e) {
			e.click();

		}

			public static void closeBrowser(WebDriver driver) {
			driver.quit();
		}
			/*public static String getData(int row, int cell) throws Exception {

			File f = new File("C:\\Users\\Dhamodharan\\eclipse-workspace\\MavenFileHandling\\lib\\DataExcel.xlsx");
			FileInputStream s = new FileInputStream(f);
			Workbook w = new XSSFWorkbook(s);
			Sheet sheet = w.getSheet("datasarala");
			Row r = sheet.getRow(row);
			Cell c = r.getCell(cell);
			String value = null;
			int type = c.getCellType();
			if (type == 1) {
				value = c.getStringCellValue();
			} else if (type == 0) {
				if (DateUtil.isCellDateFormatted(c)) {
					Date d = c.getDateCellValue();
					SimpleDateFormat s1 = new SimpleDateFormat();
					value = s1.format(d);
				} else {
					double n = c.getNumericCellValue();
					long l = (long) n;
					value = String.valueOf(l);
				}
			}
			return value;
		}*/
	}

