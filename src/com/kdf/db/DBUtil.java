package com.kdf.db;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by wb-kdf229912 on 2017/3/22.
 */
public class DBUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&amp;characterEncoding=utf-8";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    private static Connection conn = null;

    static {
        try {
            //加载驱动程序
            Class.forName("com.mysql.jdbc.Driver");
            //获得数据库的连接
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection() {
        return conn;
    }
}
