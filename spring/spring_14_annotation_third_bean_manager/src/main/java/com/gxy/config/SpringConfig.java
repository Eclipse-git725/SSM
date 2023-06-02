package com.gxy.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.annotation.*;

import javax.sql.DataSource;

@Configuration
@ComponentScan("com.gxy")
@Import(JdbcConfig.class)
public class SpringConfig {

}
