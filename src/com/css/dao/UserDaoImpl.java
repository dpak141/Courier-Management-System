package com.css.dao;

import com.css.bll.User;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class UserDaoImpl implements UserDao {

    @Override
    public boolean checkUser(User u) throws IOException {
        boolean found = false;
        try {
            FileReader fr = new FileReader("src/com/css/textFiles/Employee.txt");
            BufferedReader br = new BufferedReader(fr);
            String line = null;
            String[] splt = null;
            while ((line = br.readLine()) != null) {
                splt = line.split(",");
                if (splt[8].equals(u.getUsername()) && splt[9].equals(u.getPassword())) {
                    found = true;
                    break;
                }
            }
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }
        return found;
    }

}
