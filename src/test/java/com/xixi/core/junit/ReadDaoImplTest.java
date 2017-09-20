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
@ContextConfiguration({"classpath:config/spring-mvc.xml","classpath:config/spring-mybatis.xml"})
public class ReadDaoImplTest {
	@Resource
	private IUserDao userDao;
	@Test
	public void getListTest() {
		User user = userDao.selectByPrimaryKey(1);
		assertEquals(2, user.getId());
	}
	@Test
	public void getListTest1() {
		User user = userDao.selectByPrimaryKey(1);
		assertEquals(2, user.getId());
	}
	@Test
	public void getListTest2() {
		User user = userDao.selectByPrimaryKey(1);
		assertEquals(2, user.getId());
	}
	@Test
	public void getListTest3() {
		User user = userDao.selectByPrimaryKey(1);
		assertEquals(2, user.getId());
	}
	@Test
	public void getListTest4() {
		User user = userDao.selectByPrimaryKey(1);
		assertEquals(2, user.getId());
	}
	@Test
	public void getListTest5() {
		User user = userDao.selectByPrimaryKey(1);
		assertEquals(2, user.getId());
	}
	@Test
	public void getListTest6() {
		User user = userDao.selectByPrimaryKey(1);
		assertEquals(2, user.getId());
	}
	@Test
	public void getListTest7() {
		User user = userDao.selectByPrimaryKey(1);
		assertEquals(2, user.getId());
	}
}