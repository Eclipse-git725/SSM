package com.gxy;

import com.gxy.service.BookService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForAutoWire {
    public static void main(String[] args) {
        //获取IOC容器
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService bookService = (BookService) ctx.getBean("bookService");
        bookService.save();
    }
}
