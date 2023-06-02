package com.gxy.config;

import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("com.gxy")
@PropertySource("jdbc.properties")
@Import({JdbcConfig.class, MybatisConfig.class})
@EnableAspectJAutoProxy
public class SpringConfig {
}
