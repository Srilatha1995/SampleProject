package ExcelConcept;

import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.eval.StringValueEval;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read {
	
	public static String s;
    
	public static void main(String[] args) throws IOException {
    
		FileInputStream fis = new FileInputStream("C:\\Users\\srinath\\Desktop\\Apr-30.xlsx");
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh = wb.getSheet("Apr1");
		
		 int rowcount = sh.getLastRowNum();
		 
		 System.out.println("row count is:"+rowcount);
		 
		 for(int i=0;i<rowcount+1;i++)
		 {
			  Row r = sh.getRow(i);
			  
			 int cellcount = r.getLastCellNum();
			 
			 for(int j=0;j<cellcount;j++)
			 {
				 Cell c = r.getCell(j);
				 
				 if(c.getCellType()==Cell.CELL_TYPE_STRING)
				 {
					 s = c.getStringCellValue();
					 System.out.println(s);
				 }	 
			
					 else if(c.getCellType()==Cell.CELL_TYPE_NUMERIC)
					 {
						 s = String.valueOf(c.getNumericCellValue());
						 System.out.println(s);
					 }
					 
					 
			  }
				 
		  }
			  
 }		 
}

