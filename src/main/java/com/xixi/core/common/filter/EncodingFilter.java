package com.xixi.core.common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EncodingFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain chain)
			throws IOException, ServletException {
        //1 进行Request与Response对象的类型强转  
        HttpServletRequest request = (HttpServletRequest)arg0;  
        HttpServletResponse response = (HttpServletResponse)arg1;  
          
        //2 解决中文乱码问题:1)请求的中文乱码(GET\POST);2)响应的中文乱码.  
        request.setCharacterEncoding("utf-8");  
        response.setContentType("text/html;charset=utf-8");  
          
        //3 放行  
        chain.doFilter(request, response);  
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
