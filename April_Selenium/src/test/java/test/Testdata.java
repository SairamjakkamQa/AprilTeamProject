package test;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Testdata {

	public static void main(String[] args) throws Throwable {

		File file = new File("./target/exceldata.xlsx");

		FileInputStream stream = new FileInputStream(file);

		XSSFWorkbook workbook = new XSSFWorkbook(stream);

		XSSFSheet sheet = workbook.getSheet("Sheet1");
		
		System.out.println(sheet.getPhysicalNumberOfRows());

	}

}
