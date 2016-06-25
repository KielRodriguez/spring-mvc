package com.krod.mvc.app.config;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration.Dynamic;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.DispatcherServlet;

public class WebAppInitializer implements WebApplicationInitializer{

	@Override
	public void onStartup(ServletContext servlet) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(App.class);
		
		Dynamic dynamic = servlet.addServlet("dispatcher", new DispatcherServlet(context));
	    dynamic.addMapping("/*");
	    dynamic.setLoadOnStartup(1);
		
		
	}

	
}
