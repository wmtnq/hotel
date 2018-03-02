package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_roomcatalog;
import hotel.service.Tb_roomcatalogService;
import hotel.service.impl.Tb_roomcatalogServiceImpl;
import hotel.servlet.BaseServlet;
import hotel.util.PublicMethod;

public class Tb_roomcatalogServlet extends BaseServlet {
	private Tb_roomcatalogService tb_roomcatalogService = new Tb_roomcatalogServiceImpl();

	// 获取全部
	private void getAllTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_roomcatalog> list = tb_roomcatalogService.getAllTb_roomcatalog();
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
	}

	// 入住获取房间
	private void getAllTb_roomcatalogCK(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_roomcatalog> list = tb_roomcatalogService.getAllTb_roomcatalog();
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
	}

	// 通过ID获取
	private void getByIdTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		Tb_roomcatalog tb_roomcatalog = tb_roomcatalogService.getByIdTb_roomcatalog(Integer.parseInt(id));
		String returnJSON = JSON.toJSONString(tb_roomcatalog);
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

	// 修改
	private void updTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {
		req.getParameter("");
		Tb_roomcatalog tb_roomcatalog = new Tb_roomcatalog();
		int count = tb_roomcatalogService.updTb_roomcatalog(tb_roomcatalog);
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

	// 添加
	private void addTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {

		req.getParameter("");
		req.getParameter("");
		Tb_roomcatalog tb_roomcatalog = new Tb_roomcatalog();
		int count = tb_roomcatalogService.addTb_roomcatalog(tb_roomcatalog);
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

	public void delTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {
		req.getParameter("");
		Tb_roomcatalog tb_roomcatalog = new Tb_roomcatalog();
		boolean flag = tb_roomcatalogService.delTb_roomcatalog(tb_roomcatalog);
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
}
