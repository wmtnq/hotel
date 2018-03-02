package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_room;
import hotel.service.Tb_roomService;
import hotel.service.impl.Tb_roomServiceImpl;
import hotel.servlet.BaseServlet;
import hotel.util.PublicMethod;

public class Tb_roomServlet extends BaseServlet {

	private Tb_roomService tb_roomService = new Tb_roomServiceImpl();

	// 获取所有的房间信息
	public void getAllTb_room(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_room> list = tb_roomService.getAllTb_room();
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

	// 获取所有的房间信息
		public void getAllTb_roomCK(HttpServletRequest req, HttpServletResponse resp) {
			List<Tb_room> list = tb_roomService.getAllTb_room();
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
	// 新增客房信息
	public void addTb_room(HttpServletRequest req, HttpServletResponse resp) {
		req.getParameter("");
		Tb_room tb_room = new Tb_room();
		int count = tb_roomService.addTb_room(tb_room);
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

	// 删除房间信息
	public void delTb_room(HttpServletRequest req, HttpServletResponse resp) {
		req.getParameter("");
		Tb_room tb_room = new Tb_room();
		int count = tb_roomService.delTb_room(tb_room);
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

	// 修改1：通过id获取客房信息
	public void getByIdTb_room(HttpServletRequest req, HttpServletResponse resp) {
		int rm_id = Integer.parseInt(req.getParameter(""));
		Tb_room tb_room = tb_roomService.getByIdTb_room(rm_id);
		String returnJSON = JSON.toJSONString(tb_room);
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
	public void updTb_room(HttpServletRequest req, HttpServletResponse resp) {
		req.getParameter("");
		Tb_room tb_room = new Tb_room();
		int count = tb_roomService.updTb_room(tb_room);
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
}
