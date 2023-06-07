package com.gxy.service.impl;

import com.gxy.dao.ResourceDao;
import com.gxy.service.ResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResourceServiceImpl implements ResourceService {
    @Autowired
    private ResourceDao resourceDao;
    public boolean openURL(String url, String password) {
        return resourceDao.readResource(url,password);
    }
}
