package com.gxy;

import com.gxy.config.SpringConfig;
import com.gxy.dao.ResourceDao;
import com.gxy.service.ResourceService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(SpringConfig.class);
        ResourceService resourceService = ctx.getBean(ResourceService.class);
        boolean flag = resourceService.openURL("http://pan.baidu.com/haha", "root  ");
        System.out.println(flag);

    }
}
