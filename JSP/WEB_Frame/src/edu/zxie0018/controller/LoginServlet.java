package edu.zxie0018.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.zxie0018.model.User;
import edu.zxie0018.service.UserService;


@WebServlet("/login_do")
public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		//System.out.println(username);
		String pwd = request.getParameter("pwd");
		//System.out.println(pwd);
		
		UserService userService = new UserService();
		User user = userService.login(username, pwd);
		if(user != null) {
			request.getSession().setAttribute("user", user);
			if(user.isAdmin()) {
				response.sendRedirect(request.getContextPath() + "/admin/goods_list");
				//request.getRequestDispatcher("/admin/goods_list").forward(request, response);
				//response.sendRedirect(request.getContextPath() + "/admin/goods_list.jsp");
				//request.getRequestDispatcher("/admin/goods_list.jsp").forward(request, response);
			} else {
				request.getRequestDispatcher("/").forward(request, response);
			}
		} else {
			request.setAttribute("msg", "<font color='red'>Login failed!</font>");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
	}

}
