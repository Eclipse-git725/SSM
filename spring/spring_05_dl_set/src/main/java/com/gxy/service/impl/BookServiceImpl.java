package com.gxy.service.impl;

import com.gxy.dao.BookDao;
import com.gxy.dao.UserDao;
import com.gxy.dao.impl.BookDaoImpl;
import com.gxy.service.BookService;

public class BookServiceImpl implements BookService {
    // 删除业务层中new的dao对象
    private BookDao bookDao;
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }


    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
        userDao.save();
    }

}
