package com.gxy.dao.impl;

import com.gxy.dao.BookDao;
import org.springframework.stereotype.Repository;

@Repository
public class BookDaoImpl implements BookDao {

    public void save() {

        System.out.println("book dao save ...");
    }

    public void update(){
        System.out.println("book dao update ...");
    }

}
