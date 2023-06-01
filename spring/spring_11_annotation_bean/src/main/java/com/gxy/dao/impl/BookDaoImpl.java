package com.gxy.dao.impl;

import com.gxy.dao.BookDao;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

// @Component("bookDao")
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
