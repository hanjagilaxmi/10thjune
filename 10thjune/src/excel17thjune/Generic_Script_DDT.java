package excel17thjune;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Generic_Script_DDT {
	public static String getData(String sh,int r,int c) 
	{
		String value=null;
	
		try {
		FileInputStream fis=new FileInputStream("./Excel/Book1.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet s=book.getSheet(sh);
		Row r1=s.createRow(r);
		Cell c1=r1.createCell(c);
		value=c1.toString();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return value;
	}
}
