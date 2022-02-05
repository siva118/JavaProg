package com.te.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@ComponentScan("com.te")
@EnableWebMvc
public class JavaAnnotationConfig {
	
@Bean	
public LocalEntityManagerFactoryBean getBean() {
	LocalEntityManagerFactoryBean local=new LocalEntityManagerFactoryBean();
	local.setPersistenceUnitName("Friends");
	return local;
}

@Bean
public InternalResourceViewResolver getBeans() {
	InternalResourceViewResolver resolver=new InternalResourceViewResolver();
	resolver.setPrefix("/WEB-INF/views/");
	resolver.setSuffix(".jsp");
	return resolver;
}

}
