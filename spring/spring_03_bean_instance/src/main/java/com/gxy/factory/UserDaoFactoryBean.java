package com.gxy.factory;

import com.gxy.dao.UserDao;
import com.gxy.dao.impl.UserDaoImpl;
import org.springframework.beans.factory.FactoryBean;

public class UserDaoFactoryBean implements FactoryBean<UserDao> {
    // 代替原始实例工厂中创建对象的方法
    @Override
    public UserDao getObject() throws Exception {
        return new UserDaoImpl();
    }

    @Override
    public Class<?> getObjectType() {
        return UserDao.class;
    }

    // false就是非单例的
    // @Override
    // public boolean isSingleton() {
    //     return false;
    // }
}
