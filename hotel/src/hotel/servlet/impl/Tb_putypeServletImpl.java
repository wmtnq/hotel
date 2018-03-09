package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_putype;
import hotel.service.Tb_putypeService;
import hotel.service.impl.Tb_putypeServiceImpl;
import hotel.servlet.BaseServlet;

public class Tb_putypeServletImpl extends BaseServlet {

	private Tb_putypeService tb_pucardService = new Tb_putypeServiceImpl();
	//获取所有客户类型
	public void getAllTb_putype(HttpServletRequest req, HttpServletResponse resp) {
		 List<Tb_putype> list = tb_pucardService.getAllTb_putype();
		 String returnJSON = "";
		 if(!list.isEmpty()) {
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
}
