package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hotel.entry.Tb_operator;
import hotel.service.Tb_operatorService;
import hotel.service.impl.Tb_operatorServiceImpl;
import hotel.servlet.BaseServlet;

public class LogServlet extends BaseServlet {
	private Tb_operatorService tb_operatorService = new Tb_operatorServiceImpl();

	// 验证登录
	public void getByNameByPass(HttpServletRequest req, HttpServletResponse resp) {
		String opusername = req.getParameter("name");
		String pass = req.getParameter("pass");
		System.out.println("log");
		System.out.println(opusername+":"+pass);
		Tb_operator tb_operator = tb_operatorService.getByNameByPass(opusername, pass);
		String returnJSON = "";
		System.out.println("log");
		System.out.println(tb_operator==null);
		if (tb_operator != null) {
			if(tb_operator.getOp_state() != 0) {
			req.getSession().setAttribute("log", tb_operator);
			returnJSON = "成功";
			}else {
				returnJSON = "禁用";
				}
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

	//退出
	public void returnHome(HttpServletRequest req,HttpServletResponse resp) {
		req.getSession().removeAttribute("log");
		try {
			resp.sendRedirect("http://locahost:8080/hotel/home/register.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//解锁
		public void delLock(HttpServletRequest req, HttpServletResponse resp) {
				String opusername = req.getParameter("dellockname");
				String pass = req.getParameter("dellockpass");
				System.out.println("log");
				System.out.println(opusername+":"+pass);
				Tb_operator tb_operator = tb_operatorService.getByNameByPass(opusername, pass);
				String returnJSON = "";
				System.out.println("log");
				System.out.println(tb_operator==null);
				if (tb_operator != null) {
					req.getSession().setAttribute("log", tb_operator);
					returnJSON = "true";
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
