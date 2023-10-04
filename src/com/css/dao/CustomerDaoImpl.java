/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.css.dao;

import com.css.bll.Customer;
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


public class CustomerDaoImpl implements CustomerDao {

    @Override
    public void saveCustomer(Customer cu) throws IOException {
        try ( BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/css/textFiles/Customer.txt", true))) {
            bw.write(cu.getCustomerID() + "," + cu.getFullName() + "," + cu.getAddress() + "," + cu.getEmail() + "," + cu.getContact() + "," + cu.getGender() + "," + cu.getUsername() + "," + cu.getPassword());
            bw.flush();
            bw.newLine();
            bw.close();
        }
    }

    @Override
    public ArrayList<String> getAllCustomers() throws IOException {
        ArrayList<String> fileData = new ArrayList<>();
        FileReader fr = new FileReader("src/com/css/textFiles/Customer.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine()) != null) {
            fileData.add(line);
        }
        return fileData;
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
        } catch (Exception e) {

        } //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCustomer(Customer cu) throws IOException {

        ArrayList<String> tempArray = new ArrayList<>();
        try ( FileReader fr = new FileReader("src/com/css/textFiles/Customer.txt")) {

            Scanner reader = new Scanner(fr);
            String line;
            String[] lineArr;

            while ((line = reader.nextLine()) != null) {
                lineArr = line.split(",");
                if (lineArr[0].equals(cu.getCustomerID())) {
                    tempArray.add(
                            lineArr[0] + "," + lineArr[1] + "," + cu.getAddress() + "," + cu.getEmail() + "," + cu.getContact() + "," + lineArr[5] + "," + lineArr[6] + "," + cu.getPassword());
                } else {
                    tempArray.add(line);
                }
            }
            fr.close();
        } catch (Exception e) {
        }

        try {
            try ( PrintWriter pr = new PrintWriter("src/com/css/textFiles/Customer.txt")) {
                for (String str : tempArray) {
                    pr.println(str);
                }
            }
        } catch (FileNotFoundException e) {
        }
    }

}
