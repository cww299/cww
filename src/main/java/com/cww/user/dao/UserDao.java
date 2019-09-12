package com.cww.user.dao;

import com.cww.base.BaseDao;
import com.cww.user.pojo.User;


public interface UserDao extends BaseDao<User>{

	User getUserByUsernameAndPwd(String username, String pwd);

}