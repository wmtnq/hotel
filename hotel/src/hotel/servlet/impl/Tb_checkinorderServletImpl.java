package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_checkinorder;
import hotel.entry.Tb_room;
import hotel.service.Tb_checkinorderService;
import hotel.service.Tb_roomService;
import hotel.service.impl.Tb_checkinorderServiceImpl;
import hotel.service.impl.Tb_roomServiceImpl;
import hotel.servlet.BaseServlet;

public class Tb_checkinorderServletImpl extends BaseServlet {

	private Tb_checkinorderService tb_checkinorderService = new Tb_checkinorderServiceImpl();

	private Tb_roomService tb_roomService = new Tb_roomServiceImpl();
	//通过订单获取订单信息
	public void getByCdidTb_checkinorder(HttpServletRequest req, HttpServletResponse resp) {
		int cdid = Integer.parseInt(req.getParameter("cdid"));
		Tb_checkinorder tb_checkinorder = tb_checkinorderService.getByCdidTb_checkinorder(cdid);
		String returnJSON = "";
		if (tb_checkinorder != null) {
			returnJSON = JSON.toJSONString(tb_checkinorder);
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
	
	//通过房号订单号获取订单和客房信息(退房)
	public void getByCdidRmidTb_checkinorder(HttpServletRequest req, HttpServletResponse resp) {
		int tfcdid = Integer.parseInt(req.getParameter("tfcdid"));
		int tfrmid = Integer.parseInt(req.getParameter("tfrmid"));
		System.out.println("退房获取订单:"+tfcdid+":"+tfrmid);
		Tb_checkinorder tb_checkinorder = tb_checkinorderService.getByCdidTb_checkinorder(tfcdid);
		Tb_room tb_room = tb_roomService.getByIdTb_room(tfrmid);
		try {
			Date state = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(tb_checkinorder.getCio_inDateTime());
			Date end = new Date();
			long between=(end.getTime()-state.getTime())/1000;//除以1000是为了转换成秒
			long day1=between/(24*3600);
			Long  money=  day1 * (long) (tb_room.getRm_prctPrice()-tb_room.getRm_prctdiscount());
			tb_checkinorder.setCio_totalRate(money);
			req.getSession().setAttribute("money",String.valueOf(money));
			req.getSession().setAttribute("cdid", tb_checkinorder.getCio_id());
			req.getSession().setAttribute("rml",tb_room.getTb_roomcatalog().getRc_name());
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		tb_checkinorder.setTb_room(tb_room);
		String returnJSON = "";
		if (tb_checkinorder != null) {
			returnJSON = JSON.toJSONString(tb_checkinorder);
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
}
