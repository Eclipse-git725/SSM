package com.gxy;

import com.gxy.config.SpringConfig;
import com.gxy.dao.BookDao;
import com.gxy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        DataSource bean = ctx.getBean(DataSource.class);
        System.out.println(bean);
    }
}
