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


	// 新增客房信息
	public void addTb_room(HttpServletRequest req, HttpServletResponse resp) {
		String rmid =req.getParameter("rmaddid");
		String rmarea= req.getParameter("rmaddarea");
		String rmfloor= req.getParameter("rmaddfloor");
		String rmprctprice= req.getParameter("rmaddprctprice");
		String rmprctdiscount= req.getParameter("rmaddprctdiscount");
		String rmphone= req.getParameter("rmaddphone");
		String rmstate= req.getParameter("rmaddstate");
		String rmcatalog= req.getParameter("rmaddcatalog");
		String rmimgsrc= req.getParameter("rmaddimgsrc");
		System.out.println(rmid+":"+rmarea+":"+rmfloor+":"+rmprctprice+":"+rmphone+":"+rmstate+":"+rmcatalog+":"+rmprctdiscount+":"+rmimgsrc);
		Tb_room tb_room = new Tb_room();
		if(rmid!="") {
			tb_room.setRm_id(Integer.parseInt(rmid));
		}else {
			tb_room.setRm_id(0);
		}
		tb_room.setRm_area(rmarea);
		tb_room.setRm_floor(rmfloor);
		tb_room.setRm_prctPrice(Double.parseDouble(rmprctprice));
		tb_room.setRm_telphone(rmphone);
		tb_room.setRm_state(Integer.parseInt(rmstate));
		if(rmcatalog=="3"){
			tb_room.setRm_available(0);
		}else {
			tb_room.setRm_available(1);
		}
		tb_room.setRm_catalog(Integer.parseInt(rmcatalog));
		tb_room.setRm_prctdiscount(Double.parseDouble(rmprctdiscount));
		tb_room.setRm_picture(rmimgsrc);
		tb_room.setRm_statex(1);
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

	// 暂停入住该房间信息
	public void pauseTb_room(HttpServletRequest req, HttpServletResponse resp) {
		String rm_id = req.getParameter("rm_id");
		Tb_room tb_room = new Tb_room();
		tb_room.setRm_id(Integer.parseInt(rm_id));
		int count = tb_roomService.pauseTb_room(tb_room);
		boolean flag = PublicMethod.getSuccess(count);
		String returnJSON = "";
		System.out.println("删除" + flag);
		if (flag) {
			returnJSON = "成功";
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

	// 开放入住该房间信息
	public void startTb_room(HttpServletRequest req, HttpServletResponse resp) {
		String rm_id = req.getParameter("rm_id");
		Tb_room tb_room = new Tb_room();
		tb_room.setRm_id(Integer.parseInt(rm_id));
		int count = tb_roomService.startTb_room(tb_room);
		boolean flag = PublicMethod.getSuccess(count);
		String returnJSON = "";
		System.out.println("删除" + flag);
		if (flag) {
			returnJSON = "成功";
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

	// 修改1：通过id获取客房信息
	public void getByIdTb_room(HttpServletRequest req, HttpServletResponse resp) {
		int rm_id = Integer.parseInt(req.getParameter("rmid"));
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
		String rmid =req.getParameter("rmid");
		String rmarea= req.getParameter("rmarea");
		String rmfloor= req.getParameter("rmfloor");
		String rmprctprice= req.getParameter("rmprctprice");
		String rmprctdiscount= req.getParameter("rmprctdiscount");
		String rmphone= req.getParameter("rmphone");
		String rmstate= req.getParameter("rmstate");
		String rmcatalog= req.getParameter("rmcatalog");
		String rmimgsrc= req.getParameter("rmimgsrc");
		System.out.println(rmid+":"+rmarea+":"+rmfloor+":"+rmprctprice+":"+rmphone+":"+rmstate+":"+rmcatalog+":"+rmprctdiscount+":"+rmimgsrc);
		Tb_room tb_room = new Tb_room();
		tb_room.setRm_id(Integer.parseInt(rmid));
		tb_room.setRm_area(rmarea);
		tb_room.setRm_floor(rmfloor);
		tb_room.setRm_prctPrice(Double.parseDouble(rmprctprice));
		tb_room.setRm_telphone(rmphone);
		tb_room.setRm_state(Integer.parseInt(rmstate));
		if(rmcatalog=="3"){
			tb_room.setRm_available(0);
		}else {
			tb_room.setRm_available(1);
		}
		tb_room.setRm_catalog(Integer.parseInt(rmcatalog));
		tb_room.setRm_prctdiscount(Double.parseDouble(rmprctdiscount));
		tb_room.setRm_picture(rmimgsrc);
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
