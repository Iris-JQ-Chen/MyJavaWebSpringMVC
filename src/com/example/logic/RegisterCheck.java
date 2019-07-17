package com.example.logic;

import com.example.dao.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class RegisterCheck {

    public static boolean registerCheck(String username,String password,String age){
        String user_name = LoginCheck.check(username, password);
        if(user_name == null || user_name == ""){
            try {
                Connection conn = Dao.getConnection();
                PreparedStatement p = conn.prepareStatement("insert user_t(user_name,user_password) VALUES (?,?);");
                p.setString(1, username);
                p.setString(2, password);
                p.executeUpdate();
                System.out.println("注册成功");
                Dao.close(p, conn);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return false;
    }

}
