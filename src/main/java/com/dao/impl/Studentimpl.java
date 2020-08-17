package com.dao.impl;

import com.dao.UserDao;

public class Studentimpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取了学生信息");
    }
}
