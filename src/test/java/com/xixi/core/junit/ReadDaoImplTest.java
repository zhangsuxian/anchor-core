package com.xixi.core.junit;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xixi.core.dao.IUserDao;
import com.xixi.core.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:config/spring-mvc.xml"})
public class ReadDaoImplTest {
	@Resource
	private IUserDao userDao;
	@Test
	public void getListTest() {
		User user = userDao.selectByPrimaryKey(1);
		assertEquals(1, user.getId());
	}
}