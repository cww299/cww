package com.cww.system;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

import com.cww.common.pojo.CommonResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public CommonResponse defaultErrorHandler(HttpServletRequest req,Exception e) throws Exception{
		CommonResponse cr = new CommonResponse();
		cr.setCode(1500);
		cr.setMsg("服务器异常："+e.getClass().getSimpleName());
		return cr;
	}
}
