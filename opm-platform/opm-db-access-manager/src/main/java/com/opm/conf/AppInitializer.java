package com.opm.conf;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;

public class AppInitializer implements ApplicationContextInitializer {

	
	
	private AnnotationConfigWebApplicationContext getContext() {
        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.setConfigLocation("com.opm.config");
        return context;
    }

	@Override
	public void initialize(ConfigurableApplicationContext applicationContext) {
		
	}
	
}
