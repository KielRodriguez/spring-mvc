package com.krod.mvc.app.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

@Configuration
public class WebAppInitializer implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		System.out.println("STARTING THE CONFIGURATION");
		AnnotationConfigWebApplicationContext rootContext = 
				new AnnotationConfigWebApplicationContext();
		rootContext.register(AppConfig.class);
		
		servletContext.addListener( new ContextLoaderListener(rootContext) );
		
		AnnotationConfigWebApplicationContext dispatcherContex 
			= new AnnotationConfigWebApplicationContext();
		//dispatcherContex.register(annotatedClasses);
		
		ServletRegistration.Dynamic dispatcher =
				servletContext.addServlet( "dispatcher", new DispatcherServlet(dispatcherContex) );
		dispatcher.setLoadOnStartup(1);
		dispatcher.addMapping("/");
		
		
	}
	
}
