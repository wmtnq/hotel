package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_pucategory;
import hotel.service.Tb_pucategoryService;
import hotel.service.impl.Tb_pucategoryServiceImpl;
import hotel.servlet.BaseServlet;

public class Tb_pucategoryServletImpl extends BaseServlet {

	private Tb_pucategoryService tb_pucategoryService = new Tb_pucategoryServiceImpl();

	// 获取所有客户类别
	public void getAllTb_pucategory(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_pucategory> list = tb_pucategoryService.getAllTb_pucategory();
		String returnJSON= "";
		if(!list.isEmpty()) {
			returnJSON = JSON.toJSONString(list);
		}
		try {
			PrintWriter out= resp.getWriter();
			out.print(returnJSON);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
