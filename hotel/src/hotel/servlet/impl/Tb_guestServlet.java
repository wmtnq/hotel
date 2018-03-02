package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_guest;
import hotel.service.Tb_guestService;
import hotel.service.impl.Tb_guestServiceImpl;
import hotel.servlet.BaseServlet;

public class Tb_guestServlet extends BaseServlet {

	private Tb_guestService tb_guestService=  new Tb_guestServiceImpl();

	// 获取客户信息分组计算数量按照数量倒序排列消费的总和判断会员等级
	public void getAllTb_guest(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_guest> list = tb_guestService.getAllTb_guest();
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
