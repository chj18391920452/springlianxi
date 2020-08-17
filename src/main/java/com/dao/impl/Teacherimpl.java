package com.dao.impl;

import com.dao.UserDao;

public class Teacherimpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("获取了教师的信息");
    }
}
