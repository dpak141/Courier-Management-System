package com.css.dao;

import com.css.bll.Employee;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void saveEmployee(Employee e) throws IOException {

        try ( BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/css/textFiles/Employee.txt", true))) {
            bw.write(e.getEmployeeID() + "," + e.getFullName() + "," + e.getAddress() + "," + e.getEmail() + "," + e.getContact() + "," + e.getRole() + "," + e.getQualicication() + "," + e.getGender() + "," + e.getUsername() + "," + e.getPassword());
            bw.flush();
            bw.newLine();
            bw.close();
        }
    }

    @Override
    public void removeRecord(String filepath, String removeTerm, int positionofTerm, String delimiter) throws IOException {
        int position = positionofTerm - 1;
        String tempFile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);

        String currentLine;
        String data[];

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);

            while ((currentLine = br.readLine()) != null) {
                data = currentLine.split(",");
                if (!(data[position].equalsIgnoreCase(removeTerm))) {
                    pw.println(currentLine);
                }
            }
            pw.flush();
            pw.close();
            fr.close();
            bw.close();
            fw.close();

            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);
        } catch (Exception f) {

        }
    }

    @Override
    public ArrayList<String> getAllEmployees() throws IOException {
        ArrayList<String> fileData = new ArrayList<>();
        FileReader fr = new FileReader("src/com/css/textFiles/Employee.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            fileData.add(line);
        }
        return fileData;
    }

    @Override
    public void updateEmployee(Employee e) throws IOException {
        ArrayList<String> tempArray = new ArrayList<>();
        try ( FileReader fr = new FileReader("src/com/css/textFiles/Employee.txt")) {

            Scanner reader = new Scanner(fr);
            String line;
            String[] lineArr;

            while ((line = reader.nextLine()) != null) {
                lineArr = line.split(",");
                if (lineArr[0].equals(e.getEmployeeID())) {
                    tempArray.add(
                            lineArr[0] + "," + lineArr[1] + "," + e.getAddress() + "," + e.getEmail() + ","
                            + e.getContact() + "," + e.getRole()
                            + "," + lineArr[6] + "," + lineArr[7] + "," + lineArr[8] + "," + e.getPassword());
                } else {
                    tempArray.add(line);
                }
            }
            fr.close();
        } catch (Exception f) {
        }

        try {
            try ( PrintWriter pr = new PrintWriter("src/com/css/textFiles/Employee.txt")) {
                for (String str : tempArray) {
                    pr.println(str);
                }
            }
        } catch (FileNotFoundException f) {
        }
    }
    }
//
////    @Override
////    public boolean checkUser(Employee e) throws IOException {
////               boolean found = false;
////        try {
////            FileReader fr = new FileReader("src/com/css/textFiles/Employee.txt");
////            BufferedReader br = new BufferedReader(fr);
////            String line = null;
////            String[] splt = null;
////            while ((line = br.readLine()) != null) {
////                splt = line.split(",");
////                if (splt[0].equals(e.getEmployeeID()))) {
////                    found = true;
////                    break;
////                }
////            }
////            br.close();
////
////        } catch (Exception e) {
////            System.out.println(e);
////        }
////        return found;
////    }
//
////}
////    }
////
////}
