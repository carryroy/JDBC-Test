package com.kdf.action;

import com.kdf.bean.Goddess;
import com.kdf.dao.GoddessDao;

import java.sql.SQLException;
import java.util.Date;

/**
 * 操作数据库
 * Created by wb-kdf229912 on 2017/3/23.
 */
public class GoddessAction {

    private GoddessDao goddessDao = null;

    public GoddessAction(){
        goddessDao = new GoddessDao();
    }

    public void add(Goddess goddess) throws SQLException {
        goddess.setCreate_date(new Date());
        goddess.setCreate_user("carryroy");
        goddess.setIsdel(0);
        goddess.setSex(1);
        goddessDao.addGoddess(goddess);
    }

    public void del(Integer id) throws SQLException {
        goddessDao.delGoddess(id);
    }

    public void edit(Goddess goddess) throws SQLException {
        goddessDao.updateGoddess(goddess);
    }

}
