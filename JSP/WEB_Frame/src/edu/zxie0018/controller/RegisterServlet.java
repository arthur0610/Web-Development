package edu.zxie0018.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.zxie0018.service.UserService;


@WebServlet("/register_do")
public class RegisterServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		System.out.println(username);
		String pwd = request.getParameter("pwd");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
		
		UserService userService = new UserService();
		boolean isSuccess = userService.register(username, pwd, age, gender);
		System.out.println(isSuccess);
		if(isSuccess) {
			request.setAttribute("msg", "<font color='green'>Register successfully!</font>");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		} else {
			request.setAttribute("msg", "<font color='red'>Register failed!</font>");
			request.getRequestDispatcher("/register.jsp").forward(request, response);
		}
	}

}
