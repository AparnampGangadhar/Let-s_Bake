package uttility;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_uttility {

	public static int getRowCount(String xl, String Sheet) {

        try {
            FileInputStream fs = new FileInputStream(xl);   // path + file path
            XSSFWorkbook wb = new XSSFWorkbook(fs);
            XSSFSheet sh = wb.getSheet(Sheet);

            return sh.getLastRowNum();   // returns no. of rows and returns back the value (test cls receives)

        } catch (Exception e) {
            // return a default value (zero) when an error occurs
        }

        return 0;
    }

    public static String getCellValueString(String xl, String Sheet, int r, int c) {

        try {
            FileInputStream fs = new FileInputStream(xl);
            XSSFWorkbook wb = new XSSFWorkbook(fs);
            XSSFSheet sh = wb.getSheet(Sheet);
            XSSFCell cell = sh.getRow(r).getCell(c);   // locate cell

            if (cell.getCellType() == CellType.STRING) {  //It returns the type of the cell
                return cell.getStringCellValue();
            }

            return cell.getStringCellValue();

            

        } catch (Exception e) {

        }

        return "";
    }
}



