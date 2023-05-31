package com.gxy;

import com.gxy.dao.BookDao;
import com.gxy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        //获取IOC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 获取bean
        // BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        // bookDao.save();

        BookService bookService = (BookService) ctx.getBean("service");
        bookService.save();
    }
}
