package edu.monash.servlet;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.monash.model.User;
import edu.monash.util.DatabaseUtil;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/login_do")
public class LoginServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String pwd = request.getParameter("pwd");
		
		User user = DatabaseUtil.verifyUser(username, pwd);
		if(user == null) {
			//out.println("login failed, username or password is incorrect!");
			request.setAttribute("msg", "login failed, username or password is incorrect!");
			request.getRequestDispatcher("login.jsp").forward(request, response);
		} else {
			//out.println("login successfully!");
			// session:
			int number = 0;
			ServletContext application = this.getServletContext();
			
			if(application.getAttribute("userNumber") != null) {
				number = (Integer) application.getAttribute("userNumber");
			}
			
			number++;
			
			application.setAttribute("userNumber", number);
			
			request.getSession().setAttribute("user", user);
			//session.setAttribute("user", user);
			//request.setAttribute("user", user);
			request.getRequestDispatcher("personCenter.jsp").forward(request, response);
		}
	}

}
