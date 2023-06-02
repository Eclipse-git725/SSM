package com.gxy.dao.impl;

import com.gxy.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

// @Component("bookDao")
@Repository("bookDao")
// @Scope("prototype")
public class BookDaoImpl implements BookDao {
    // @Value("gxy")
    @Value("${name}")
    private String name;

    @Override
    public void save() {
        System.out.println("book dao save..." + name);
    }
}
