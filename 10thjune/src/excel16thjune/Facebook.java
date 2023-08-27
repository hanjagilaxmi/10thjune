package excel16thjune;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Facebook {
	@Test
	public void login() throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s=book.getSheet("Sheet1");
		Row r=s.getRow(0);
		Cell c=r.getCell(0);
		String data=c.getStringCellValue();
		System.out.println(data);
		Sheet s1=book.getSheet("Sheet1");
		Row r1=s1.getRow(0);
		Cell c1=r1.getCell(1);
		String data1=c1.toString();
		System.out.println(data1);
		System.setProperty("webdriver.chrome.driver", "./Softwares/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(data);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(data1);
		driver.findElement(By.xpath("//button[@name='login']")).click();
	}

}
