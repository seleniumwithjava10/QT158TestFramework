import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReaders {

	public static void main(String[] args) {

		try {
			FileInputStream fi = new FileInputStream(new File(System.getProperty("user.dir") + "/TestExcelData.xlsx"));
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet sh = wb.getSheet("Data1");

			Object key = sh.getRow(0).getCell(0).getStringCellValue();
			Object value = sh.getRow(0).getCell(1).getStringCellValue();

			Object key1 = sh.getRow(1).getCell(0).getStringCellValue();
			Object value1 = sh.getRow(1).getCell(1).getStringCellValue();
			Object valuee = sh.getRow(1).getCell(2).getStringCellValue();

			Object key2 = sh.getRow(2).getCell(0).getStringCellValue();
			Object value2 = sh.getRow(2).getCell(1).getStringCellValue();

			System.out.println("Fist set of data is " + key + " " + value);

			System.out.println("Second set of data is " + key1 + " " + value1 + " " + valuee);

			System.out.println("Third set of data is " + key2 + " " + value2);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

}
