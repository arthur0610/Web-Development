package edu.zxie0018.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.zxie0018.service.UserService;


@WebServlet("/verifyUsername")
public class VerifyUsernameServlet extends HttpServlet {

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		
		UserService userService = new UserService();
		boolean isExist = userService.isExist(username);
		response.getWriter().append("{\"isSuccess\":"+!isExist+"}");
	}

}
