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
		return user;
	}

}
