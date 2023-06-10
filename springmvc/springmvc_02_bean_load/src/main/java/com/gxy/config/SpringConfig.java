package com.gxy.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
// @ComponentScan({"com.gxy.service", "com.gxy.dao"})
@ComponentScan(value = "com.gxy",
    excludeFilters = @ComponentScan.Filter(
            type = FilterType.ANNOTATION,
            classes = Controller.class
    )
)
public class SpringConfig {

}
