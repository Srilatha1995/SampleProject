package Excelreadwrite;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writeexcelfile {

		public static void main(String[] args) throws IOException {
		
		

	 //Create workbook
     XSSFWorkbook workbook = new XSSFWorkbook();
     
     //Create sheet
     XSSFSheet sheet = workbook.createSheet("Sample");
     
     Map<String, Object[]> dataset = new TreeMap<String,Object[]>();
     dataset.put("1", new Object[] {"ID","NAME","COMPANY"});
     dataset.put("2", new Object[] {"1","Sri","Acc"});
     dataset.put("3", new Object[] {"2","San","Google"});
     dataset.put("4", new Object[] {"3","Vani","Wipro"});
     dataset.put("5", new Object[] {"4","pinky","Facebook"});
     
     Set<String> set = dataset.keySet();
     int rownum = 0;
     for(String key:set)
     {
    	 Row row = sheet.createRow(rownum++);
    	 Object[] data = dataset.get(key);
    	 int cellnum = 0;
    	 for(Object value:data)
    	 {
    		 Cell cell = row.createCell(cellnum++);
    		 if(value instanceof String)
    			 cell.setCellValue((String)value);
    		 if(value instanceof Integer)
    			 cell.setCellValue((Integer)value);
    	 }
    	 
     }
     FileOutputStream fos = new FileOutputStream("C:\\Users\\srinath\\Desktop\\write.xlsx");
     workbook.write(fos);
     fos.close();
     System.out.println("Sample workbook is created");
	}

}
