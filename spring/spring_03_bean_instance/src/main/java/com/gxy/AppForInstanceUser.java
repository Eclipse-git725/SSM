package com.gxy;

import com.gxy.dao.BookDao;
import com.gxy.dao.OrderDao;
import com.gxy.factory.OrderDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        // 通过静态工厂创建dao
        OrderDao orderDao = OrderDaoFactory.getOrderDao();
        orderDao.save();
    }
}
