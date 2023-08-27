package excel16thjune;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Fetch_Data {
		public static void main(String[] args) throws EncryptedDocumentException, IOException {
			//Step1
			FileInputStream fis=new FileInputStream("./Excel/Defectreport.xlsx");
			//Step2
			Workbook book = WorkbookFactory.create(fis);
			//Step3
			Sheet s=book.getSheet("Sheet1");
			//Step4
			Row r=s.getRow(0);
			//Step5
			Cell c=r.getCell(0);
			//Step6
			String data=c.getStringCellValue();
			System.out.println(data);
		}
}
