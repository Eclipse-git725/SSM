package com.gxy.config;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.support.AbstractDispatcherServletInitializer;

// 4.定义一个servlet容器启动的配置类，加载spring的配置
public class ServletContainersInitConfig extends AbstractDispatcherServletInitializer {
    // 加载springmvc容器配置
    @Override
    protected WebApplicationContext createServletApplicationContext() {
        AnnotationConfigWebApplicationContext ctx = new AnnotationConfigWebApplicationContext();
        ctx.register(SpringMvcConfig.class);
        return ctx;
    }

    // 设置归springmvc处理的请求
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }

    // 加载spring配置
    @Override
    protected WebApplicationContext createRootApplicationContext() {
        return null;
    }
}
