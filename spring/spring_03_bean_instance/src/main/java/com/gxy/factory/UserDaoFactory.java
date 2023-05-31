package com.gxy.factory;

import com.gxy.dao.OrderDao;
import com.gxy.dao.impl.OrderDaoImpl;

public class OrderDaoFactory {
    public static OrderDao getOrderDao(){
        return new OrderDaoImpl();
    }
}
