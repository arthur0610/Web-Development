package edu.zxie0018.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.zxie0018.dao.UserDao;
import edu.zxie0018.model.User;

public class AdminFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		HttpServletRequest httpReq = (HttpServletRequest) request;
		HttpServletResponse httpResp = (HttpServletResponse) response;
		Object object = httpReq.getSession().getAttribute("user");
		if(object == null) {
			httpResp.sendRedirect(httpReq.getContextPath()+"/index.jsp");
		} else {
			User u = (User) object;
			if(u.isAdmin()) {
				chain.doFilter(request, response);
			} else {
				httpResp.sendRedirect(httpReq.getContextPath()+"/index.jsp");
			}
		}
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
