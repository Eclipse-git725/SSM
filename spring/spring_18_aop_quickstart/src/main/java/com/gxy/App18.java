package com.gxy;

import com.gxy.config.SpringConfig;
import com.gxy.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App18 {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        BookDao bookDao = ctx.getBean(BookDao.class);
        // bookDao.update();
        System.out.println(bookDao);
        System.out.println(bookDao.getClass());
    }
}
