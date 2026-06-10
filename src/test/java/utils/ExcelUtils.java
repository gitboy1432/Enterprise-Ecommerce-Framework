 package utils;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;

public class ExcelUtils {

    public static Object[][] getTestData(String excelPath, String sheetName) {
        Object [][] data=null;
        try {
            FileInputStream fis = new FileInputStream(excelPath);

            Workbook workbook= new XSSFWorkbook(fis);
            Sheet sheet= workbook.getSheet(sheetName);

            int rowCount=sheet.getPhysicalNumberOfRows();
            int colCount=sheet.getRow(0).getPhysicalNumberOfCells();

           data= new Object[rowCount-1][colCount];
            for(int i=1;i<rowCount;i++){
                for(int j=0;j<colCount;j++){
                    data[i-1][j]= sheet.getRow(i).getCell(j).toString();
                }
            }
            return data;
        } catch (Exception e) {
            System.out.println("not able to open excel Sheet");
            e.printStackTrace();
        }
return data;
    }
}
