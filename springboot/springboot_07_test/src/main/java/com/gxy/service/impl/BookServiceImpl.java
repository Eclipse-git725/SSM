package com.gxy.service.impl;

import com.gxy.service.BookService;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {
    @Override
    public void save() {
        System.out.println("bookservice is running...");
    }
}
