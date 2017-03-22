package com.kdf.dao;

import com.kdf.bean.Goddess;
import com.kdf.util.Constant;
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

    private Connection connection = DBUtil.getConnection();

    private PreparedStatement preparedStatement = null;

    /**
     * 增加女神的方法
     * @param goddess 女神对象
     * @throws SQLException
     */
    public void addGoddess(Goddess goddess) throws SQLException {

        //获取预编译Statement
        preparedStatement = connection.prepareStatement(Constant.addSql);

        preparedStatement.setString(1,goddess.getUser_name());
        preparedStatement.setInt(2,goddess.getSex());
        preparedStatement.setInt(3,goddess.getAge());
        preparedStatement.setDate(4, new Date(goddess.getBirthday().getTime()));
        preparedStatement.setString(5, goddess.getEmail());
        preparedStatement.setString(6,goddess.getMobile());
        preparedStatement.setString(7,goddess.getCreate_user());
        preparedStatement.setString(8, goddess.getUpdate_user());
        preparedStatement.setInt(9,goddess.getIsdel());

        //执行
        preparedStatement.execute();
    }

    /**
     * 删除女神的方法
     * @param id 女神编号
     */
    public void delGoddess(Integer id) throws SQLException {
        preparedStatement = connection.prepareStatement(Constant.delSql);
        preparedStatement.setInt(1,id);
        preparedStatement.execute();
    }

    /**
     * 修改女神信息的方法
     * @param goddess 女神对象
     * @throws SQLException
     */
    public void updateGoddess(Goddess goddess) throws SQLException {
        preparedStatement = connection.prepareStatement(Constant.updateSql);
        preparedStatement.setString(1,goddess.getUser_name());
        preparedStatement.setInt(2,goddess.getSex());
        preparedStatement.setInt(3,goddess.getAge());
        preparedStatement.setDate(4, new Date(goddess.getBirthday().getTime()));
        preparedStatement.setString(5, goddess.getEmail());
        preparedStatement.setString(6,goddess.getMobile());
        preparedStatement.setString(7, goddess.getUpdate_user());
        preparedStatement.setInt(8,goddess.getIsdel());
        preparedStatement.setInt(9,goddess.getId());
        preparedStatement.execute();
    }
}
