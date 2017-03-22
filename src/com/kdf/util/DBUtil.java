package com.kdf.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by wb-kdf229912 on 2017/3/22.
 */
public class DBUtil {

    private static Connection conn = null;

    static {
        try {
            //加载驱动程序
            Class.forName(Constant.DRIVER);
            //初始化数据库的连接
            conn = DriverManager.getConnection(Constant.URL, Constant.USER, Constant.PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //获得数据库的连接
    public static Connection getConnection() {
        return conn;
    }
}
