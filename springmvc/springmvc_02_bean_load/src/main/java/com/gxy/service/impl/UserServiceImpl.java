package com.gxy.service.impl;

import com.gxy.domain.User;
import com.gxy.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void save(User user) {
        System.out.println("user service ...");
    }
}
