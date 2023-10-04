package com.css.dao;

import com.css.bll.User;
import java.io.IOException;

public interface UserDao {

    boolean checkUser(User u) throws IOException;

}
