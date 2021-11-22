package activities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity15 {

	public static void main(String[] args){
		String FILE_NAME = "C:\\Users\\0027MT744\\Desktop\\FullStackTester\\resources\\TestSheet.xlsx";
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Datatypes in Java");
		
		
		Object[][] datatypes = {
			    {"Datatype", "Type", "Size(in bytes)"},
			    {"int", "Primitive", 2},
			    {"float", "Primitive", 4},
			    {"double", "Primitive", 8},
			    {"char", "Primitive", 1},
			    {"String", "Non-Primitive", "No fixed size"}
			};
		int rownum = 0;
		for(Object[] datatype: datatypes)
		{
			Row row = sheet.createRow(rownum++);
			int colnum = 0;
			for(Object field : datatype)
			{
				Cell cell = row.createCell(colnum++);
				if(field instanceof String)
				{
					cell.setCellValue((String) field);
				}
				else if(field instanceof Integer)
				{
					cell.setCellValue((Integer) field);
				}
			}
		}
		try
		{
			FileOutputStream outputStream = new FileOutputStream(FILE_NAME);
			workbook.write(outputStream);
			workbook.close();
		}catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
	}

}
