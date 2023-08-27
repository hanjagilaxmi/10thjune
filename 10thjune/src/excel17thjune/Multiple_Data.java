package excel17thjune;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiple_Data {
	
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			FileInputStream fis=new FileInputStream("./Excel/Book2.xlsx");
			Workbook book = WorkbookFactory.create(fis);
			Sheet s=book.getSheet("Sheet1");
			
			System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.in");
			List<WebElement> links = driver.findElements(By.xpath("//a"));
			
			for(int i=0;i<links.size();i++)
			{
				Row r=s.createRow(i);
				Cell c=r.createCell(0);
				
				WebElement ele = links.get(i);
				String att=ele.getAttribute("href");
				
				c.setCellValue(att);
			}
			FileOutputStream fos=new FileOutputStream("./Excel/Book2.xlsx");
			book.write(fos);
	}

}
