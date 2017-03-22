package com.kdf.dao;

import com.kdf.bean.Goddess;
import com.kdf.util.DBUtil;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * 增删改查
 * Created by wb-kdf229912 on 2017/3/22.
 */
public class GoddessDao {

    public void addGoddess(Goddess goddess) throws SQLException {
        Connection connection = DBUtil.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO imooc_goddess" +
                "(user_name,sex,age,birthday,email,mobile,create_user,create_date,update_user,update_date,isdel) " +
                "VALUES (?,?,?,?,?,?,?,CURRENT_DATE ,?,CURRENT_DATE ,?)");
        preparedStatement.setString(1,goddess.getUser_name());
        preparedStatement.setInt(2,goddess.getSex());
        preparedStatement.setInt(3,goddess.getAge());
        preparedStatement.setDate(4, new Date(goddess.getBirthday().getTime()));
        preparedStatement.setString(5, goddess.getEmail());
        preparedStatement.setString(6,goddess.getMobile());
    }

}
