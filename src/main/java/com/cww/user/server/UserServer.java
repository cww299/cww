package com.cww.user.server;

import org.springframework.stereotype.Service;

import com.cww.common.pojo.PageParameter;
import com.cww.common.pojo.PageResult;
import com.cww.user.pojo.User;

@Service
public interface UserServer {

	public PageResult<User> findPage(User user,PageParameter page);

	public User login(User user);
}
