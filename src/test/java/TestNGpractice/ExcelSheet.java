package TestNGpractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelSheet {
	
	


	public static void main(String[] args) throws IOException {
		
		
		String path="D:\\datasheet.ods";
		FileInputStream inputStream = new FileInputStream(path);
	    Workbook workbook=new HSSFWorkbook(inputStream);
	    
	    
	   
	    
	}

}
