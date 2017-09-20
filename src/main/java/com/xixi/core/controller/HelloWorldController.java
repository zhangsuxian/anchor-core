package com.xixi.core.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xixi.core.entity.User;
import com.xixi.core.service.api.IUserService;

@Controller
@RequestMapping("/core")
public class HelloWorldController {
	private Logger logger = Logger.getLogger(HelloWorldController.class);
	@Autowired 
	private IUserService userService;
	
	@ResponseBody
	@RequestMapping("/test")
	public User doGet(HttpServletRequest req, HttpServletResponse resp){
		if ("s" == "sq"){
			logger.info("Hello World!");
		}
		User user =userService.getUserById(1);
		return user;
	}

}
