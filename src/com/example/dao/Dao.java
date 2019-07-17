package com.example.dao;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
    // 获取数据库连接
    public static Connection getConnection(){

        Connection conn = null;
        String url = "jdbc:mysql://127.0.0.1:3306/test";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url,"root","root");//大家分享代码的时候也不要暴露自己的数据库密码，这样是非常不安全的
        } catch(ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("数据库驱动加载出错");
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("数据库出错");
        }
        return conn;
    }
    //关闭相关通道
    public static void close(ResultSet rs,PreparedStatement p,Connection conn) {
        try {
            if(!rs.isClosed()){
                rs.close();
            }
            if(!p.isClosed()){
                p.close();
            }
            if(!conn.isClosed()){
                conn.close();
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("数据关闭出错");
        }
    }
    //关闭相关通道
    public static void close(PreparedStatement p,Connection conn)
    {
        try {
            if(!p.isClosed()){
                p.close();
            }
            if(!conn.isClosed()){
                conn.close();
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println("数据关闭出错");
        }
    }
}