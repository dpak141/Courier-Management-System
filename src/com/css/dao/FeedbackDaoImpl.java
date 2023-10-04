/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.css.dao;
import com.css.bll.Feedback;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


public class FeedbackDaoImpl implements FeedbackDao {

    @Override
    public void saveFeedback(Feedback f) throws IOException {
      try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/com/css/textFiles/Feedback.txt",true))){
          bw.write(f.getFeedbackID()+","+f.getUsername()+","+ f.getEmail()+","+ f.getMessage());
          bw.flush();
          bw.newLine();
          bw.close();
      }
    }

    @Override
    public ArrayList<String> getAllFeedbacks() throws IOException {
        ArrayList<String> fileData = new ArrayList<>();
        FileReader fr = new FileReader("src/com/css/textFiles/Feedback.txt");
        BufferedReader br = new BufferedReader(fr);
        String line;
        while ((line = br.readLine())!= null){
            fileData.add(line);
        }
        return fileData;
    }

    
}
