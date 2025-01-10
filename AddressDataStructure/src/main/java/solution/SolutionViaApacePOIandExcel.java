package solution;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class SolutionViaApacePOIandExcel {
    public static void main(String[] args) {
        String excelFile = "src\\test\\resources\\countries_states_cities.xlsx"; // Path to the Excel file

        try (FileInputStream fis = new FileInputStream(new File(excelFile));
             Workbook workbook = new XSSFWorkbook(fis)) {

            // Get the first sheet
            Sheet sheet = workbook.getSheetAt(0);

            // Loop through the rows, skipping the header row
            for (int rowNum = 1; rowNum < sheet.getPhysicalNumberOfRows(); rowNum++) {
                Row row = sheet.getRow(rowNum);

                if (row != null) {
                    // Read country, state, and city from each row
                    String country = row.getCell(0).getStringCellValue();
                    String state = row.getCell(1).getStringCellValue();
                    String city = row.getCell(2).getStringCellValue();

                    // Directly print the data from the row
                    System.out.println("Country: " + country + ", State: " + state + ", City: " + city);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

