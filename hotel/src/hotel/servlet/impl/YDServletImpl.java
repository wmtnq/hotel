package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_checkinorder;
import hotel.entry.Tb_guest;
import hotel.entry.Tb_room;
import hotel.service.Tb_checkinitemService;
import hotel.service.Tb_roomService;
import hotel.service.impl.Tb_checkinitemServiceImpl;
import hotel.service.impl.Tb_roomServiceImpl;
import hotel.servlet.BaseServlet;

public class YDServletImpl extends BaseServlet {
	private Tb_checkinitemService tb_checkinitemService = new Tb_checkinitemServiceImpl();
	private Tb_roomService Tb_roomService = new Tb_roomServiceImpl();
	public void ydaddTb_checkinitemService(HttpServletRequest req, HttpServletResponse resp) {
		String inroom = req.getParameter("inroom");
		String ydsex = req.getParameter("ydsex");
		String outroom = req.getParameter("outroom");
		String ydrmid = req.getParameter("ydrmid");
		String ydname = req.getParameter("ydname");
		String ydgusettype = req.getParameter("ydgusettype");
		String ydgusetvip = req.getParameter("ydgusetvip");
		String ydphone = req.getParameter("ydphone");
		String ydcardname = req.getParameter("ydcardname");
		String ydcardid = req.getParameter("ydcardid");
		String ydcountry = req.getParameter("ydcountry");
		String ydaddress = req.getParameter("ydaddress");
		String yddemail = req.getParameter("yddemail");
		String ydzip = req.getParameter("ydzip");

		Tb_room tb_room = Tb_roomService.getByIdTb_room(Integer.parseInt(ydrmid));
		Tb_guest tb_guest = new Tb_guest();
		tb_guest.setGt_id(0);
		tb_guest.setGt_name(ydname);
		tb_guest.setGt_gender(ydsex);
		tb_guest.setGt_type(Integer.parseInt(ydgusettype));
		
		tb_guest.setGt_pucategory(Integer.parseInt(ydgusetvip));
		tb_guest.setGt_cardcatalog(Integer.parseInt(ydcardname));
		tb_guest.setGt_cardId(ydcardid);
		tb_guest.setGt_country(Integer.parseInt(ydcountry));
		tb_guest.setGt_address(ydaddress);
		tb_guest.setGt_zip(ydzip);
		tb_guest.setGt_company(ydphone);
		tb_guest.setGt_email(yddemail);
		tb_guest.setGt_createtime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		Tb_checkinorder tb_checkinorder = new Tb_checkinorder();
		tb_checkinorder.setCio_State(1);
		tb_checkinorder.setCio_inDateTime(inroom);
		tb_checkinorder.setCio_outDateTime(outroom);
		
		if(true) {
			Date state = null;
			Date end = null;
			try {
				state = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(inroom);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				end = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(outroom);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			long between=(end.getTime()-state.getTime())/1000;//除以1000是为了转换成秒
			long day1=between/(24*3600);
			Long  money=  day1 * (long) (tb_room.getRm_prctPrice()-tb_room.getRm_prctdiscount());
			req.getSession().setAttribute("money", money);
			req.getSession().setAttribute("cdid", money);
			req.getSession().setAttribute("rml", tb_room.getTb_roomcatalog().getRc_bedNumber());
		tb_checkinorder.setCio_paidMoney(money.intValue());
		}
			tb_checkinorder.setCio_iseservid(1);
		Tb_checkinitem tb_checkinitem = new Tb_checkinitem();
		
		tb_checkinitem.setCim_roomId(Integer.parseInt(ydrmid));
		tb_checkinitem.setCim_prctPrice(tb_room.getTb_roomcatalog().getRc_prePrice());
		tb_checkinitem.setCim_discount(tb_room.getTb_roomcatalog().getRc_prediscount());
		tb_checkinitem.setCim_inDateTime(inroom);
		tb_checkinitem.setCim_outdateTime(outroom);
		tb_checkinitem.setCim_state(1);
		tb_checkinitem.setTb_guest(tb_guest);
		tb_checkinitem.setTb_checkinorder(tb_checkinorder);
		tb_checkinitem.getTb_checkinorder().setTb_guest(tb_guest);
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
}
