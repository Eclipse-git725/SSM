package com.gxy.service.impl;

import com.gxy.dao.BookDao;
import com.gxy.dao.impl.BookDaoImpl;
import com.gxy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// @Component
@Service
public class BookServiceImpl implements BookService {
    @Autowired
    @Qualifier("bookDao")
    private BookDao bookDao;
    @Override
    public void save() {
        System.out.println("book service save...");
        bookDao.save();
    }

    // public void setBookDao(BookDao bookDao) {
    //     this.bookDao = bookDao;
    // }
}
