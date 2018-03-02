package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_operator;
import hotel.service.Tb_operatorService;
import hotel.service.impl.Tb_operatorServiceImpl;
import hotel.servlet.BaseServlet;
import hotel.util.PublicMethod;

public class Tb_operatorServlet extends BaseServlet {

	private Tb_operatorService tb_operatorService = new Tb_operatorServiceImpl();

	// 获取所有的操作员信息
	public void getAllTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_operator> list = tb_operatorService.getAllTb_operator();
		String returnJSON = JSON.toJSONString(list);
		try {
			PrintWriter out = resp.getWriter();
			out.print(returnJSON);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/*
		 * try { resp.sendRedirect("admin/homepage.jsp"); } catch (IOException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}

	// 新增操作员
	public void addTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		req.getParameter("");
		Tb_operator tb_operator = new Tb_operator();
		int count = tb_operatorService.addTb_operator(tb_operator);
		boolean flag = PublicMethod.getSuccess(count);
		try {
			PrintWriter out = resp.getWriter();
			out.print(flag);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 修改1：通过id获取操作员信息
	public void getByNameTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		String opusername = req.getParameter("zz");
		Tb_operator tb_operator = tb_operatorService.getByNameTb_operator("zz");
		String returnJSON = JSON.toJSONString(tb_operator);
		System.out.println(returnJSON);
		try {
			PrintWriter out = resp.getWriter();
			out.print(returnJSON);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 修改2：更新修改后的数据
	public void updTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		req.getParameter("");
		Tb_operator tb_operator = new Tb_operator();
		int count = tb_operatorService.updTb_operator(tb_operator);
		boolean flag = PublicMethod.getSuccess(count);
		try {
			PrintWriter out = resp.getWriter();
			out.print(flag);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 删除操作员
	public void delTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		String opusername = req.getParameter("");
		int count = tb_operatorService.delTb_operator(opusername);
		boolean flag = PublicMethod.getSuccess(count);
		try {
			PrintWriter out = resp.getWriter();
			out.print(flag);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	}
}
