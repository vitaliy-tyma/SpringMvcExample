package com.luxoft.tyma;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
@EnableWebMvc
@ComponentScan("com.luxoft.tyma")
public class MvcConfig implements WebMvcConfigurer{

}
