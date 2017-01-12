package com.opm.conf;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@ComponentScan(basePackages = "com.opm")
@EnableTransactionManagement
@PropertySource("classpath:application.properties")
public class AppConfig extends  WebMvcConfigurerAdapter{

 	 @Override
     public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
         configurer.enable();
     }
 	
}
