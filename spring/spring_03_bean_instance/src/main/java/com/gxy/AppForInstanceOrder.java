package com.gxy;

import com.gxy.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 若配置为多例则是两个不同的地址，默认为单例地址相同
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao1);
        BookDao bookDao2 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao2);
    }
}
