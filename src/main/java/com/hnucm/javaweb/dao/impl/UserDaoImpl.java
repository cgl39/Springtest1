package com.hnucm.javaweb.dao.impl;

import com.hnucm.javaweb.dao.UserDao;

public class UserDaoImpl implements UserDao {
    public String findUser() {
        //todo 数据库请求获取用户名
        String name="testname";
        return name;
    }
}
