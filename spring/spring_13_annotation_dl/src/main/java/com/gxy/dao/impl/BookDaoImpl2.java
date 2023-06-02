package com.gxy.dao.impl;

import com.gxy.dao.BookDao;
import org.springframework.stereotype.Repository;

// @Component("bookDao")
@Repository("bookDao2")
// @Scope("prototype")
public class BookDaoImpl2 implements BookDao {
    @Override
    public void save() {
        System.out.println("book dao save...2");
    }
}
