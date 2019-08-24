package Excelreadwrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Readexcelfile {

	public static void main(String[] args) throws IOException {
     FileInputStream fis = new FileInputStream("D:\\Apr_Sri_19\\Apr_Proj\\sheet\\write.xlsx");
     XSSFWorkbook wb = new XSSFWorkbook(fis);
     XSSFSheet sheet = wb.getSheet("Sample");
     Row row;
     Cell cell = null;
     
     Iterator<Row> rowitr = sheet.iterator();
     {    
    	 while(rowitr.hasNext())
    	 {
    		 row=rowitr.next();
    		 Iterator<Cell> cellitr = row.iterator();
    		 while(cellitr.hasNext())
    		 {
    			 cell=cellitr.next();
    	 
    	         DataFormatter df = new DataFormatter();
    	         String text = df.formatCellValue(cell);
    	         System.out.println(text);
    		 }
    	 } 
	}

}
}
