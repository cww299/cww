package com.cww.user.server;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import com.cww.common.pojo.PageParameter;
import com.cww.common.pojo.PageResult;
import com.cww.user.dao.UserDao;
import com.cww.user.pojo.User;

@Service
public class UserServerImp implements UserServer{
	
	@Autowired
	UserDao userDao;

	@Override
	public PageResult<User> findPage(User user,PageParameter page) {
		
		Pageable pageable = new PageRequest(page.getPage(),page.getSize());
		
		Page<User> us = userDao.findAll(new Specification<User>(){

			@Override
			public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
				
				List<Predicate> list = new ArrayList<Predicate>();
				
				if(user.getUsername()!=""){        
                    list.add(cb.like(root.get("username").as(String.class),"%"+user.getUsername()+"%"));
                }
				
				Predicate[] pre = new Predicate[list.size()];
				query.where(list.toArray(pre));
				
				return null;
			}
			
		},pageable);
	
		return new PageResult<User>(us);
	}

}
