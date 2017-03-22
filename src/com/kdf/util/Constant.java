package com.kdf.util;

/**
 * Created by wb-kdf229912 on 2017/3/22.
 */
public class Constant {
    /**
     * 增加女神的语句
     */
    public static final String addSql = "INSERT INTO imooc_goddess(user_name,sex,age,birthday,email,mobile,create_user,create_date,update_user,update_date,isdel) VALUES (?,?,?,?,?,?,?,CURRENT_DATE ,?,CURRENT_DATE ,?)";
    /**
     * 删除女神的语句
     */
    public static final String delSql = "DELETE FROM imooc_goddess WHERE id = ?";
    /**
     * 修改女神信息的语句
     */
    public static final String updateSql = "UPDATE imooc_goddess SET user_name = ?,sex = ?,age = ?,birthday = ?,email = ?,mobile = ?,update_user = ?,update_date = current_date,isdel = ? WHERE id = ?";
    /**
     * 数据库url
     */
    public static final String URL = "jdbc:mysql://127.0.0.1:3306/test?useUnicode=true&amp;characterEncoding=utf-8";
    /**
     * 数据库用户名
     */
    public static final String USER = "root";
    /**
     * 数据库密码
     */
    public static final String PASSWORD = "root";
    /**
     * 驱动名
     */
    public static final String DRIVER = "com.mysql.jdbc.Driver";
}
