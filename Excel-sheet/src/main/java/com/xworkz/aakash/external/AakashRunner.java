package com.xworkz.aakash.external;

import com.xworkz.aakash.entity.AakashEntity;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.io.FileInputStream;
import java.io.IOException;

public class AakashRunner {
    public static void main(String[] args) {

        String excelPath = "C:\\Users\\User\\Downloads\\Book1.xlsx";

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("student");
        EntityManager em = emf.createEntityManager();
        EntityTransaction transaction = em.getTransaction();

        try (FileInputStream fis = new FileInputStream(excelPath);
             Workbook workbook = new XSSFWorkbook(fis)) {

            transaction.begin();

            Sheet sheet = workbook.getSheetAt(0);

            for (int i = 1; i <= sheet.getLastRowNum(); i++) {

                Row row = sheet.getRow(i);
                if (row == null) continue;

                AakashEntity aakash = new AakashEntity();

                aakash.setStudent_id((int) row.getCell(0).getNumericCellValue());
                aakash.setStudent_name(row.getCell(1).getStringCellValue());
                aakash.setStudent_name(row.getCell(2).getStringCellValue());


                em.persist(aakash);
            }

            transaction.commit();
            System.out.println("Excel data inserted successfully");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            em.close();
            emf.close();
        }
    }
}