package com.gxy.service.impl;

import com.gxy.controller.Code;
import com.gxy.dao.BookDao;
import com.gxy.exception.BussinessException;
import com.gxy.service.BookService;
import domain.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;
    @Override
    public boolean save(Book book) {
        return bookDao.save(book) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public Book getById(Integer id) {
        if(id==1){
            throw new BussinessException(Code.Bussiness_ERR, "请输入正确信息");
        }
        /*try{
            int i = 1/0;
        }catch (Exception e){
            throw new SystemException(Code.SYSTEM_ERR, "服务器访问超时，请重试", e);
        }*/
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
