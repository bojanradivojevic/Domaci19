package Zadatak1;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Imena i prezimena polaznika");

        try {
            FileInputStream inputStream = new FileInputStream("ImenaIPrezimena");
            XSSFWorkbook workbook = new XSSFWorkbook(inputStream);
            XSSFSheet sheet = workbook.getSheet("Sheet1");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
