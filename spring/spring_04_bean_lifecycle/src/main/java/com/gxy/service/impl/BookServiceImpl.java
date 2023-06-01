package com.gxy.service.impl;

import com.gxy.dao.BookDao;
import com.gxy.dao.impl.BookDaoImpl;
import com.gxy.service.BookService;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BookServiceImpl implements BookService, InitializingBean, DisposableBean {
    // 删除业务层中new的dao对象
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    // 提高对应的set方法
    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
        System.out.println("service set..");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("service destroy...");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("service init...");
    }
}
