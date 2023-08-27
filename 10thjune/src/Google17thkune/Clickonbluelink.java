package Google17thkune;


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
import org.openqa.selenium.firefox.FirefoxDriver;

public class Clickonbluelink {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excel/Book3.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s=book.getSheet("Sheet1");
		
		System.setProperty("webdriver.chrome.driver","./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int count=links.size();
		System.out.println(count);
		for(int i=0;i<links.size();i++)
		{
			Row r=s.createRow(i);
			Cell c=r.createCell(0);
			
			WebElement ele = links.get(i);
			String att=ele.getAttribute("href");
					
			c.setCellValue(att);
		}
		FileOutputStream fos=new FileOutputStream("./Excel/Book3.xlsx");
		book.write(fos);
		
		for(Row r:s)
		{
		Cell c=r.getCell(0);
		String url=c.toString();
		System.out.println(url);
		}

		for(WebElement l1:links)
		{
			String color = l1.getCssValue("color");
			if(color.equals("BLUE"))
			{
				l1.click();
			}
		}
	}
}
