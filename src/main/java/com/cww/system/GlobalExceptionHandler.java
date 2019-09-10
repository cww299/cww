package com.cww.system;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e) throws Exception{
		ModelAndView m = new ModelAndView();
		m.addObject("exception",e);
		m.addObject("url",req.getRequestURI());
		m.setViewName("system/errorPage");
		return m;
	}
}
