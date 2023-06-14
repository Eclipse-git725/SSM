package com.gxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan({"com.gxy.controller", "com.gxy.config"})
@EnableWebMvc
public class SpringMvcConfig {
}
