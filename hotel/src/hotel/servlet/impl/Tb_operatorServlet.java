package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_operator;
import hotel.service.Tb_operatorService;
import hotel.service.impl.Tb_operatorServiceImpl;
import hotel.servlet.BaseServlet;
import hotel.util.PublicMethod;

public class Tb_operatorServlet extends BaseServlet {

	private Tb_operatorService tb_operatorService = new Tb_operatorServiceImpl();

	// 获取所有的操作员信息
	public void getAllTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_operator> list = tb_operatorService.getAllTb_operator();
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

		/*
		 * try { resp.sendRedirect("admin/homepage.jsp"); } catch (IOException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */
	}

	// 新增操作员
	public void addTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		String opuser = req.getParameter("opadduser");
		String oppass = req.getParameter("opaddpass");
		String oppge = req.getParameter("opaddpge");
		String opaddress = req.getParameter("opaddaddress");
		String opname = req.getParameter("opaddname");
		String opphone = req.getParameter("opaddphone");
		String opmobile = req.getParameter("opaddmobile");
		String opzip = req.getParameter("opaddzip");
		String opcreatetime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		System.out.println("操作员新增:" + opuser + ":" + oppass + ":" + oppge + ":" + opaddress + ":" + opname + ":"
				+ opphone + ":" + opmobile + ":" + opzip + ":" + opcreatetime);
		Tb_operator tb_operator = new Tb_operator();
		tb_operator.setOp_userName(opuser);
		tb_operator.setOp_passWord(oppass);
		tb_operator.setOp_privilege(Integer.parseInt(oppge));
		tb_operator.setOp_address(opaddress);
		tb_operator.setOp_name(opname);
		tb_operator.setOp_telephone(opphone);
		tb_operator.setOp_mobile(opmobile);
		tb_operator.setOp_zip(opzip);
		tb_operator.setOp_createTime(opcreatetime);
		tb_operator.setOp_state(1);
		int count = tb_operatorService.addTb_operator(tb_operator);
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

	// 修改1：通过id获取操作员信息
	public void getByNameTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		String opusername = req.getParameter("zz");
		Tb_operator tb_operator = tb_operatorService.getByNameTb_operator("zz");
		String returnJSON = JSON.toJSONString(tb_operator);
		System.out.println(returnJSON);
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

	// 修改密码
	public void updPassTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		String opuser = req.getParameter("oppassname");
		String opnewpass = req.getParameter("opnewpassword");
		Tb_operator tb_operator = new Tb_operator();
		tb_operator.setOp_userName(opuser);
		tb_operator.setOp_passWord(opnewpass);
		int count = tb_operatorService.updPassTb_operator(tb_operator);
		String returnJSON = "";
		if (count > 0) {
			returnJSON="成功！";
			req.getSession().removeAttribute("log");
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

	// 修改2：更新修改后的数据
	public void updTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		String opuser = req.getParameter("opuser");
		String oppass = req.getParameter("oppass");
		String oppge = req.getParameter("oppge");
		String opaddress = req.getParameter("opaddress");
		String opphone = req.getParameter("opphone");
		String opmobile = req.getParameter("opmobile");
		String opzip = req.getParameter("opzip");
		System.out.println("操作员修改:" + opuser + ":" + oppass + ":" + oppge + ":" + opaddress + ":" + opphone + ":"
				+ opmobile + ":" + opzip);
		Tb_operator tb_operator = new Tb_operator();
		tb_operator.setOp_userName(opuser);
		tb_operator.setOp_passWord(oppass);
		tb_operator.setOp_privilege(Integer.parseInt(oppge));
		tb_operator.setOp_address(opaddress);
		tb_operator.setOp_telephone(opphone);
		tb_operator.setOp_mobile(opmobile);
		tb_operator.setOp_zip(opzip);
		int count = tb_operatorService.updTb_operator(tb_operator);
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

	// 暂停操作员
	public void pauseTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		String opusername = req.getParameter("opusername");
		int count = tb_operatorService.pauseTb_operator(opusername);
		boolean flag = PublicMethod.getSuccess(count);
		String returnJSON = "";
		System.out.println(flag);
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

	// 开放操作员
	public void startTb_operator(HttpServletRequest req, HttpServletResponse resp) {
		String opusername = req.getParameter("opusername");
		int count = tb_operatorService.startTb_operator(opusername);
		boolean flag = PublicMethod.getSuccess(count);
		String returnJSON = "";
		System.out.println(flag);
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
	

	//锁定
		public void lock(HttpServletRequest req, HttpServletResponse resp) {
				req.getSession().removeAttribute("log");
				String returnJSON = "true";
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

	public static void main(String[] args) {
	}
}
