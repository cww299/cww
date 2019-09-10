package com.cww.user.controller;

import java.text.DateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	@RequestMapping("/helloYt")
	public String hell(Model m) throws Exception{
		m.addAttribute("now",DateFormat.getDateTimeInstance().format(new Date()));
		if(true){
			throw new Exception("some Exception");
		}
		return "helloYt";
	}
}
