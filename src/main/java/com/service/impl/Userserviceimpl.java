package com.service.impl;

import com.dao.UserDao;
import com.service.Userservice;

public class Userserviceimpl implements Userservice {
  private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getuser() {

//        userDaoimpl.getUser();
      userDao.getUser();
    }


}
