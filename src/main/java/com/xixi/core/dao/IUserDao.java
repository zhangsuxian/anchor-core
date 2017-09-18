package com.xixi.core.dao;

import com.xixi.core.entity.User;

public interface IUserDao {
  User selectByPrimaryKey(int userId);
}
