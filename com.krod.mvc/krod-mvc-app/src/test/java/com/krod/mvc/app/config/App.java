package com.krod.mvc.app.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.krod.mvc.view.controllers")
@EnableWebMvc
public class App {

}
