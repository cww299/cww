package com.cww.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cww.user.dao.UserDao;
import com.cww.user.pojo.User;


@RestController
public class UserController {
	@Autowired 
	UserDao userDao;
	
	@RequestMapping("/listUser")
	public String listUser(Model m) throws Exception{
		/*
		 * 将接口设置为异步查询、用于测试
		 */
		List<User> us = userDao.findAll();
		m.addAttribute("userList",us);
		return "listUser";
	}
}
