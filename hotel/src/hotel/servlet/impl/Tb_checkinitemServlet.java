package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_pucard;
import hotel.entry.Tb_pucategory;
import hotel.entry.Tb_pucountry;
import hotel.entry.Tb_pupaymenttype;
import hotel.entry.Tb_putype;
import hotel.entry.Tb_room;
import hotel.entry.Tb_roomcatalog;
import hotel.service.Tb_checkinitemService;
import hotel.service.Tb_pucardService;
import hotel.service.Tb_pucategoryService;
import hotel.service.Tb_pucountryService;
import hotel.service.Tb_pupaymenttypeService;
import hotel.service.Tb_putypeService;
import hotel.service.Tb_roomService;
import hotel.service.impl.Tb_checkinitemServiceImpl;
import hotel.service.impl.Tb_pucardServiceImpl;
import hotel.service.impl.Tb_pucategoryServiceImpl;
import hotel.service.impl.Tb_pucountryServiceImpl;
import hotel.service.impl.Tb_pupaymenttypeServiceImpl;
import hotel.service.impl.Tb_putypeServiceImpl;
import hotel.service.impl.Tb_roomServiceImpl;
import hotel.servlet.BaseServlet;

public class Tb_checkinitemServlet extends BaseServlet {

	private Tb_checkinitemService tb_checkinitemService = new Tb_checkinitemServiceImpl();
	private Tb_roomService tb_roomService = new Tb_roomServiceImpl();
	private Tb_pucardService tb_pucardService = new Tb_pucardServiceImpl();
	private Tb_pucategoryService tb_pucategoryService = new Tb_pucategoryServiceImpl();
	private Tb_pucountryService tb_pucountryService = new Tb_pucountryServiceImpl();
	private Tb_pupaymenttypeService tb_pupaymenttypeService = new Tb_pupaymenttypeServiceImpl();
	private Tb_putypeService tb_putypeService = new Tb_putypeServiceImpl();

	// 入住1:查询房间状态
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

	// 入住2：获取类型类别
	public void getAllType(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_pucard> listpc = tb_pucardService.getAllTb_pucard();
		List<Tb_pucategory> listpcg = tb_pucategoryService.getAllTb_pucategory();
		List<Tb_pucountry> listpct = tb_pucountryService.getAllTb_pucountry();
		List<Tb_pupaymenttype> listppt = tb_pupaymenttypeService.getAllTb_pupaymenttype();
		List<Tb_putype> listpt = tb_putypeService.getAllTb_putype();
		HttpSession session = req.getSession();
		session.setAttribute("listpc", listpc);
		session.setAttribute("listpcg", listpcg);
		session.setAttribute("listpct", listpct);
		session.setAttribute("listppt", listppt);
		session.setAttribute("listpt", listpt);
		req.getSession().setAttribute("state", "ckx");
		try {
			resp.sendRedirect("admin/homepage.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 入住3:添加入住信息
	public void addTb_checkinitemService(HttpServletRequest req, HttpServletResponse resp) {
		req.getParameter("");
		Tb_checkinitem tb_checkinitem = new Tb_checkinitem();
		boolean flag = tb_checkinitemService.addTb_checkinitem(tb_checkinitem);
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

	// 获取全部登记表信息
	public void getAllTb_checkinitemAndTb_checkinorderAndTb_balancement(HttpServletRequest req,
			HttpServletResponse resp) {
		List<Tb_checkinitem> list = tb_checkinitemService.getAllTb_checkinitemAndTb_checkinorderAndTb_balancement();
		req.getSession().setAttribute("listck", list);
		req.getSession().setAttribute("state", "ck");
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

	// 获取全部登记表非退房订单
		public void getByStateTb_checkinitem(HttpServletRequest req,
				HttpServletResponse resp) {
			List<Tb_checkinitem> list = tb_checkinitemService.getStatusTb_checkinitemAndTb_checkinorderAndTb_balancement(0);
			List<Tb_checkinitem> listx = tb_checkinitemService.getStatusTb_checkinitemAndTb_checkinorderAndTb_balancement(1);
			String returnJSON = JSON.toJSONString(list);
			returnJSON=returnJSON+JSON.toJSONString(listx);
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

	// 模糊搜索登记表信息
	public void getAllTb_checkinitem(HttpServletRequest req, HttpServletResponse resp) {
		String value = req.getParameter("value");
		List<Tb_checkinitem> list = tb_checkinitemService
				.getAllTb_checkinitemAndTb_checkinorderAndTb_balancement(value);
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

}
