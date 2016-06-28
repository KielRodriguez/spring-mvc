package com.krod.mvc.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class PrincipalViewController {
	
	@RequestMapping("/index")
	public String index(){
		return "index";
	}
}
