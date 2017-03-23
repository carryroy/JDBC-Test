package com.kdf.dao;

import com.kdf.bean.Goddess;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.Date;

/**
 * GoddessDao Tester.
 *
 * @author <Authors name>
 * @version 1.0
 * @since <pre>���� 23, 2017</pre>
 */
public class GoddessDaoTest {

    private GoddessDao goddessDao;

    @Before
    public void before() throws Exception {
        goddessDao = new GoddessDao();
    }

    @After
    public void after() throws Exception {
    }

    /**
     * Method: addGoddess(Goddess goddess)
     */
    @Test
    public void testAddGoddess() throws Exception {
        Goddess goddess = new Goddess();
        goddess.setSex(1);
        goddess.setCreate_user("ADMIN");
        goddess.setUpdate_user("ADMIN");
        goddess.setIsdel(0);
        goddess.setUser_name("贾静雯");
        goddess.setBirthday(new Date());
        goddess.setSex(1);
        goddess.setAge(25);
        goddess.setEmail("jiajingwen@163.com");
        goddess.setMobile("15688888888");
        goddess.setIsdel(0);
        goddess.setId(7);
        goddessDao.addGoddess(goddess);
    }

    /**
     * Method: delGoddess(Integer id)
     */
    @Test
    public void testDelGoddess() throws Exception {
goddessDao.delGoddess(2);
    }

    /**
     * Method: updateGoddess(Goddess goddess)
     */
    @Test
    public void testUpdateGoddess() throws Exception {
        Goddess goddess = new Goddess();
        goddess.setSex(1);
        goddess.setCreate_user("ADMIN");
        goddess.setUpdate_user("ADMIN");
        goddess.setIsdel(0);
        goddess.setUser_name("贾静雯");
        goddess.setBirthday(new Date());
        goddess.setSex(1);
        goddess.setAge(25);
        goddess.setEmail("jiajingwen@163.com");
        goddess.setMobile("15688888888");
        goddess.setIsdel(0);
        goddess.setId(1);
        goddessDao.updateGoddess(goddess);
    }


} 
