package excel17thjune;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Write_Data {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s=book.getSheet("Sheet1");
		Row r=s.createRow(2);
		Cell c=r.createCell(4);
		c.setCellValue("Mysore");
		
		FileOutputStream fos=new FileOutputStream("./Excel/Book1.xlsx");
		book.write(fos);
	}

}
