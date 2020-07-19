package edu.monash.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.monash.util.DatabaseUtil;

/**
 * Servlet implementation class RegisterServlet
 */
//@WebServlet("/register_do")
public class RegisterServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		int age = Integer.parseInt(request.getParameter("age"));
		String gender = request.getParameter("gender");
			
		boolean isSuccess = DatabaseUtil.addUser(username, pwd, age, gender);
		if(isSuccess) {
			request.setAttribute("msg", "Register successfully!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			
		} else {
			request.setAttribute("msg", "Register failed!");
			request.getRequestDispatcher("register.jsp").forward(request, response);
		}
	}

}
