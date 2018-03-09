package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_pucountry;
import hotel.service.Tb_pucountryService;
import hotel.service.impl.Tb_pucountryServiceImpl;
import hotel.servlet.BaseServlet;

public class Tb_pucountryServletImpl extends BaseServlet {

	private Tb_pucountryService tb_pucountryService= new Tb_pucountryServiceImpl();
	//获取所有国籍
	public void getAllTb_pubcountry(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_pucountry> list = tb_pucountryService.getAllTb_pucountry();
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
