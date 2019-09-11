package com.cww.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cww.common.pojo.CommonResponse;
import com.cww.common.pojo.PageParameter;
import com.cww.common.pojo.PageResult;
import com.cww.user.dao.UserDao;
import com.cww.user.pojo.User;


@Controller
public class UserController {
	@Autowired 
	UserDao userDao;
	
	@RequestMapping("/listUser")
	@ResponseBody
	public CommonResponse listUser(PageParameter page) throws Exception{
		CommonResponse cr = new CommonResponse();
        Page<User> us = userDao.findAll(page);
        cr.setData(new PageResult<User>(us,page));
		return cr;
	}
}
