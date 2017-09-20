package com.xixi.core.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xixi.core.dao.IUserDao;
import com.xixi.core.entity.User;
import com.xixi.core.service.api.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		User user = userDao.selectByPrimaryKey(userId);
		if (user != null) {
			user.getAge();
		}
		String name = user.getUserName();
		if(name == "findbugs"){
			user.setUserName("findbugs");
		}
		return user;
	}

}
