package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_pupaymenttype;
import hotel.service.Tb_pupaymenttypeService;
import hotel.service.impl.Tb_pupaymenttypeServiceImpl;
import hotel.servlet.BaseServlet;

public class Tb_pupaymenttypeServletImpl extends BaseServlet {

	private Tb_pupaymenttypeService tb_pupaymenttypeService = new Tb_pupaymenttypeServiceImpl();

	//获取全部支付类型
	public void getAllTb_pupaymenttype(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_pupaymenttype> list = tb_pupaymenttypeService.getAllTb_pupaymenttype();
		String retnruJSON = "";
		if (!list.isEmpty()) {
			retnruJSON = JSON.toJSONString(list);
		}
		try {
			PrintWriter out = resp.getWriter();
			out.print(retnruJSON);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
