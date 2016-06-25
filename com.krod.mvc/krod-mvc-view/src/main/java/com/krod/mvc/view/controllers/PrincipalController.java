package com.krod.mvc.view.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/application")
public class PrincipalController {
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
