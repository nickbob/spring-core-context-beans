package ru.nickbob.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("ru.nickbob")
@PropertySource("classpath:app.prop")
public class SpringConfig {

}