package com.kdf.bean;

import java.util.Date;

/**
 * Created by wb-kdf229912 on 2017/3/22.
 */
public class Goddess {
    /**
     * 女神编号
     */
    private Integer id;
    /**
     * 女神名字
     */
    private String user_name;
    /**
     * 女神性别
     */
    private Integer sex;
    /**
     * 女神年龄
     */
    private Integer age;
    /**
     * 女神生日
     */
    private Date birthday;
    /**
     * 女神邮箱
     */
    private String email;
    /**
     * 女神手机
     */
    private String mobile;
    /**
     * 创建人
     */
    private String create_user;
    /**
     * 创建时间
     */
    private Date create_date;
    /**
     * 修改人
     */
    private String update_user;
    /**
     * 修改时间
     */
    private Date update_date;
    /**
     * 是否删除
     */
    private Integer isdel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getCreate_user() {
        return create_user;
    }

    public void setCreate_user(String create_user) {
        this.create_user = create_user;
    }

    public Date getCreate_date() {
        return create_date;
    }

    public void setCreate_date(Date create_date) {
        this.create_date = create_date;
    }

    public String getUpdate_user() {
        return update_user;
    }

    public void setUpdate_user(String update_user) {
        this.update_user = update_user;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }

    @Override
    public String toString() {
        return "Goddess{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", birthday=" + birthday +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", create_user='" + create_user + '\'' +
                ", create_date=" + create_date +
                ", update_user='" + update_user + '\'' +
                ", update_date=" + update_date +
                ", isdel=" + isdel +
                '}';
    }
}
