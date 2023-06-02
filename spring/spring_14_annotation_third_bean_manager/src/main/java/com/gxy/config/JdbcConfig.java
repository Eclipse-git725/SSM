package com.gxy.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.gxy.dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

public class JdbcConfig {
    // 1.定义一个方法获得要管理的对象
    // 2.添加@Bean表示当前方法返回值是一个bean

    // 第三方bean中注入简单类型
    @Value("com.mysql.jdbc.Driver")
    private String driver;
    @Value("jdbc:mysql://127.0.0.1:3306/spring_db")
    private String url;

    // 注入引用类型
    @Bean
    public DataSource dataSource(BookDao bookDao){
        // 自动注入
        System.out.println(bookDao);
        DruidDataSource ds = new DruidDataSource();
        ds.setDriverClassName(driver);
        ds.setUrl(url);
        ds.setUsername("root");
        ds.setPassword("123456");
        return ds;
    }
}
