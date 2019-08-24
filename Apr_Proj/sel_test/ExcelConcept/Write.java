package ExcelConcept;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write {

	public static void main(String[] args) throws IOException {
     FileInputStream fis = new FileInputStream("C:\\Users\\srinath\\Desktop\\Apr-30.xlsx");
     
     XSSFWorkbook wb = new XSSFWorkbook(fis);
     
     XSSFSheet sh = wb.getSheet("Apr");
     
     Row r1 = sh.createRow(6);
     Row r2 = sh.createRow(10);
     Row r3 = sh.getRow(0);
     
     r1.createCell(0).setCellValue("Sri");
     r1.createCell(1).setCellValue("Latha");
     
     r2.createCell(3).setCellValue("sri");
     r2.createCell(4).setCellValue("vani");
     
     r3.createCell(9).setCellValue("pass");
     
     FileOutputStream fout = new FileOutputStream("C:\\Users\\srinath\\Desktop\\Apr-30.xlsx");
     wb.write(fout);
     fout.flush();
     fout.close();
	}

}
