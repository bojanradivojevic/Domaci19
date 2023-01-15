package Zadatak1;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Imena i prezimena polaznika");

        try {
            FileInputStream inputStream = new FileInputStream("ImenaIPrezimena.xlsx");
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Sheet1");

            for (int i = 0; i < 5; i++) {
                XSSFRow row = sheet.getRow(i);
                XSSFCell cellIme = row.getCell(0);
                XSSFCell cellPrezime = row.getCell(1);
                String ime = cellIme.getStringCellValue();
                String prezime = cellPrezime.getStringCellValue();
                System.out.println(ime + " " + prezime);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
