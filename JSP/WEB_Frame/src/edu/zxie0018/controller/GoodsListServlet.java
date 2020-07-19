package edu.zxie0018.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.zxie0018.model.Good;
import edu.zxie0018.service.GoodsService;

@WebServlet("/admin/goods_list")
public class GoodsListServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Good> goodsList = new GoodsService().selectAllGoods();
		
		req.setAttribute("GoodsList", goodsList);
		req.getRequestDispatcher("/admin/goods_list.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
