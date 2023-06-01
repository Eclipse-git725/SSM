package com.gxy.dao.impl;

import com.gxy.dao.BookDao;

public class BookDaoImpl implements BookDao {
    // 私有也能访问
    private BookDaoImpl() {
        System.out.println("book dao constructor is running...");
    }

    @Override
    public void save() {
        System.out.println("book dao save...");
    }
}
