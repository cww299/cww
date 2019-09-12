package com.cww.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cww.common.pojo.CommonResponse;
import com.cww.common.pojo.PageParameter;
import com.cww.common.pojo.PageResult;
import com.cww.user.pojo.User;
import com.cww.user.server.UserServer;


@Controller
public class UserController {
	@Autowired 
	UserServer userServer;
	
	@RequestMapping("/listUserPage")
	@ResponseBody
	public CommonResponse listUser(PageParameter page,User user) throws Exception{
		CommonResponse cr = new CommonResponse();
        PageResult<User> us = userServer.findPage(user,page);
        cr.setData(us);
        cr.setMsg("查询成功");
		return cr;
	}
	
	@RequestMapping("/login")
	@ResponseBody
	public CommonResponse login(User user) throws Exception{
		CommonResponse cr = new CommonResponse();
		System.out.println(user.getUsername());
		User u = userServer.login(user);
		if(u!=null){
			cr.setData(u);
			cr.setMsg("登录成功");
		}
		else{
			cr.setMsg("账号或密码错误");
			cr.setCode(1500);
		}
		return cr;
	}
}
