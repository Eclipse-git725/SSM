package com.gxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan({"com.gxy"})
@PropertySource("{jdbc.properties}")
public class SpringConfig {
}
