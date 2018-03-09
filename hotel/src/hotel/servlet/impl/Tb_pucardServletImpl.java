package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_pucard;
import hotel.service.Tb_pucardService;
import hotel.service.impl.Tb_pucardServiceImpl;
import hotel.servlet.BaseServlet;

public class Tb_pucardServletImpl extends BaseServlet {

	private Tb_pucardService tb_pucardService = new Tb_pucardServiceImpl();

	// 获取所有的身份证类型
	public void getAllTb_pucard(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_pucard> list = tb_pucardService.getAllTb_pucard();
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
}
