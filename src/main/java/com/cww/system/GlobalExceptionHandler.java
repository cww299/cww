package com.cww.system;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.cww.common.pojo.CommonResponse;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = Exception.class)
	public ModelAndView defaultErrorHandler(HttpServletRequest req,Exception e) throws Exception{
		ModelAndView mav = new ModelAndView();
		MappingJackson2JsonView view = new MappingJackson2JsonView();
		CommonResponse responseInfo = new CommonResponse();
		responseInfo.setCode(1500);
		responseInfo.setMsg("抱歉,服务器异常了,详情 [" + (e == null ? "未知" : e.getClass().getSimpleName().replace("Exception", "")) + "]");
		view.setAttributesMap(responseInfo.toMap());
		mav.setView(view);
		return mav;
	}
}
