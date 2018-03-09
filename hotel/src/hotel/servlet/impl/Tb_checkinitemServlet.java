package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_checkinorder;
import hotel.entry.Tb_guest;
import hotel.entry.Tb_room;
import hotel.service.Tb_checkinitemService;
import hotel.service.Tb_roomService;
import hotel.service.impl.Tb_checkinitemServiceImpl;
import hotel.service.impl.Tb_roomServiceImpl;
import hotel.servlet.BaseServlet;

public class Tb_checkinitemServlet extends BaseServlet {

	private Tb_checkinitemService tb_checkinitemService = new Tb_checkinitemServiceImpl();
	private Tb_roomService tb_roomService = new Tb_roomServiceImpl();

	// 入住1:查询房间状态
	public void getAllTb_room(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_room> list = tb_roomService.getStateAllTb_room();
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

	// 入住3:添加入住信息
	public void addTb_checkinitemService(HttpServletRequest req, HttpServletResponse resp) {
		String rzcdindatetime = req.getParameter("rzcdindatetime");
		String rzcdoutdatetime = req.getParameter("rzcdoutdatetime");
		String rzcdrmlid = req.getParameter("rzcdrmlid");
		String rzcdmannumber = req.getParameter("rzcdmannumber");
		String rzcdstate = req.getParameter("rzcdstate");
		String rzgsname = req.getParameter("rzgsname");
		String rzgsgtgender = req.getParameter("rzgsgtgender");
		String rzgstpye = req.getParameter("rzgstpye");
		String rzgsgory = req.getParameter("rzgsgory");
		String rzgscardcatalog = req.getParameter("rzgscardcatalog");
		String rzgscardid = req.getParameter("rzgscardid");
		String rzgsgtcountry = req.getParameter("rzgsgtcountry");
		String rzgsgtzip = req.getParameter("rzgsgtzip");
		String rzgsphone = req.getParameter("rzgsphone");
		String rzgsaddress = req.getParameter("rzgsaddress");
		String rzgsemail = req.getParameter("rzgsemail");
		String rzoperator = req.getParameter("rzoperator");
		System.out.println("入住:" + rzcdindatetime + ":" + rzcdoutdatetime + ":" + rzcdrmlid + ":" + rzcdmannumber + ":"
				+ rzcdstate + ":" + rzgsname + ":" + rzgsgtgender + ":" + rzgstpye + ":" + rzgsgory + ":"
				+ rzgscardcatalog + ":" + rzgscardid + ":" + rzgsgtcountry + ":" + rzgsgtzip + ":" + rzgsphone + ":"
				+ rzgsaddress + ":" + rzgsemail);
		System.out.println("客户类别"+rzgsgory);
		Tb_room tb_room = tb_roomService.getByIdTb_room(Integer.parseInt(rzcdrmlid));
		Tb_guest tb_guest = new Tb_guest();
		tb_guest.setGt_id(0);
		tb_guest.setGt_name(rzgsname);
		tb_guest.setGt_gender(rzgsgtgender);
		tb_guest.setGt_type(Integer.parseInt(rzgstpye));
		tb_guest.setGt_pucategory(Integer.parseInt(rzgsgory));
		tb_guest.setGt_cardcatalog(Integer.parseInt(rzgscardcatalog));
		tb_guest.setGt_cardId(rzgscardid);
		tb_guest.setGt_country(Integer.parseInt(rzgsgtcountry));
		tb_guest.setGt_address(rzgsaddress);
		tb_guest.setGt_zip(rzgsgtzip);
		tb_guest.setGt_company(rzgsphone);
		tb_guest.setGt_email(rzgsemail);
		tb_guest.setGt_createtime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		Tb_checkinorder tb_checkinorder = new Tb_checkinorder();
		tb_checkinorder.setCio_State(Integer.parseInt(rzcdstate));
		tb_checkinorder.setCio_inDateTime(rzcdindatetime);
		tb_checkinorder.setCio_paymentmodel(1);
		tb_checkinorder.setCio_outDateTime(rzcdoutdatetime);
		tb_checkinorder.setCio_manNumber(Integer.parseInt(rzcdmannumber));
		if (rzcdstate == "1") {
			Date state = null;
			Date end = null;
			try {
				state = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(rzcdindatetime);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(rzcdoutdatetime);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			long between = (end.getTime() - state.getTime()) / 1000;// 除以1000是为了转换成秒
			long day1 = between / (24 * 3600);
			Long money = day1 * (long) (tb_room.getRm_prctPrice() - tb_room.getRm_prctdiscount());
			req.getSession().setAttribute("money", money);
			req.getSession().setAttribute("cdid", money);
			req.getSession().setAttribute("rml", tb_room.getTb_roomcatalog().getRc_bedNumber());
			tb_checkinorder.setCio_paidMoney(money.intValue());
		}
		tb_checkinorder.setTb_guest(tb_guest);
		tb_checkinorder.setCio_operator(rzoperator);
		if (rzcdstate == "0") {
			tb_checkinorder.setCio_iseservid(0);
		} else {
			tb_checkinorder.setCio_iseservid(1);
		}
		tb_checkinorder.setTb_guest(tb_guest);
		Tb_checkinitem tb_checkinitem = new Tb_checkinitem();
		tb_checkinitem.setCim_roomId(Integer.parseInt(rzcdrmlid));
		tb_checkinitem.setCim_prctPrice(tb_room.getTb_roomcatalog().getRc_prePrice());
		tb_checkinitem.setCim_discount(tb_room.getTb_roomcatalog().getRc_prediscount());
		tb_checkinitem.setCim_inDateTime(rzcdindatetime);
		tb_checkinitem.setCim_state(Integer.parseInt(rzcdstate));
		tb_checkinitem.setTb_guest(tb_guest);
		tb_checkinitem.setTb_checkinorder(tb_checkinorder);
		tb_checkinitem.setTb_room(tb_room);
		tb_checkinitem.setCim_roomId(tb_room.getRm_id());
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
	public void getByStateTb_checkinitem(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_checkinitem> list = tb_checkinitemService.getStatusTb_checkinitemAndTb_checkinorderAndTb_balancement(2);
		String returnJSON = "";
		if (!list.isEmpty()) {
			returnJSON = JSON.toJSONString(list);
		}
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
