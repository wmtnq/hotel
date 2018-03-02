package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_balancement;
import hotel.service.Tb_balancementService;
import hotel.service.impl.Tb_balancementServiceImpl;
import hotel.servlet.BaseServlet;

public class Tb_balancementServlet extends BaseServlet {
	private Tb_balancementService tb_balancementService = new Tb_balancementServiceImpl();

	// 结账更新信息
	public void updTb_balancement(HttpServletRequest req, HttpServletResponse resp) {
		req.getParameter("");
		Tb_balancement tb_balancement = new Tb_balancement();
		boolean flag = tb_balancementService.updTb_balancement(tb_balancement);
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

	// 获取所有需要退款的账单信息
	public void getAllRefundState(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_balancement> list = tb_balancementService.getAllRefundState();
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

	// 获取所有需要发票的账单
	public void getAllReceipt(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_balancement> list = tb_balancementService.getAllReceipt();
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
