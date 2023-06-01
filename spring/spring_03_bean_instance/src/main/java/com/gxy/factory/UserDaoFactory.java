package com.gxy.factory;

import com.gxy.dao.UserDao;
import com.gxy.dao.impl.UserDaoImpl;

public class UserDaoFactory {
    public UserDao getUserDao(){
        return new UserDaoImpl();
    }
}
