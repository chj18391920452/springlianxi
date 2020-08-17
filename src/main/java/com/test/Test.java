package com.test;

import com.dao.impl.Studentimpl;
import com.dao.impl.Teacherimpl;
import com.service.Userservice;
import com.service.impl.Userserviceimpl;

public class Test {
    public static void main(String[] args) {
        Userservice userservice =new Userserviceimpl();
        ((Userserviceimpl) userservice).setUserDao(new Studentimpl());
        userservice.getuser();
    }
}
