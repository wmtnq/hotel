package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_balancement;
import hotel.service.Tb_balancementService;
import hotel.service.impl.Tb_balancementServiceImpl;
import hotel.servlet.BaseServlet;
import hotel.util.PublicMethod;

public class Tb_balancementServlet extends BaseServlet {
	private Tb_balancementService tb_balancementService = new Tb_balancementServiceImpl();

	// 结账更新信息
	public void updTb_balancement(HttpServletRequest req, HttpServletResponse resp) {
		String tfcdid = req.getParameter("tfcdid");
		String tfrmid = req.getParameter("tfrmid");
		String tfgsid = req.getParameter("tfgsid");
		String tfindatetime = req.getParameter("tfindatetime");
		String tfprctprice = req.getParameter("tfprctprice");
		String tftotalrate = req.getParameter("tftotalrate");
		String tfpaidmoney = req.getParameter("tfpaidmoney");
		String tfreceivmoney = req.getParameter("tfreceivmoney");
		String tfpupayment = req.getParameter("tfpupayment");
		String tfbmrefund = req.getParameter("tfbmrefund");
		String tfbmcardnumber = req.getParameter("tfbmcardnumber");
		String tfbmcardname = req.getParameter("tfbmcardname");
		String tfbmcardid = req.getParameter("tfbmcardid");
		String tfbmcardphone = req.getParameter("tfbmcardphone");
		String tfbmremark = req.getParameter("tfbmremark");
		String tfbmreceipt = req.getParameter("tfbmreceipt");
		String tfbmcompany = req.getParameter("tfbmcompany");
		String tfbmaddress = req.getParameter("tfbmaddress");
		String tfbmoperator = req.getParameter("tfbmoperator");
		String tfbmphone = req.getParameter("tfbmphone");
		System.out.println("退房结账:" + ":" + tfcdid + ":" + tfrmid + ":" + tfgsid + ":" + tfindatetime + ":" + tfprctprice
				+ ":" + tftotalrate + ":" + tfpaidmoney + ":" + tfreceivmoney + ":" + tfpupayment + ":" + tfbmrefund
				+ ":" + tfbmcardnumber + ":" + tfbmcardname + ":" + tfbmcardid + ":" + tfbmcardphone + ":" + tfbmremark
				+ ":" + tfbmreceipt + ":" + tfbmcompany + ":" + tfbmaddress + ":" + tfbmoperator + ":" + tfbmphone);
		Tb_balancement tb_balancement = new Tb_balancement();
		tb_balancement.setBm_id(0);
		tb_balancement.setBm_checkinorderId(Integer.parseInt(tfcdid));
		tb_balancement.setBm_roomId(Integer.parseInt(tfrmid));
		tb_balancement.setBm_guestId(Integer.parseInt(tfgsid));
		tb_balancement.setBm_paymentmodel(Integer.parseInt(tfpupayment));
		tb_balancement.setBm_totalRate(Double.parseDouble(tftotalrate));
		tb_balancement.setBm_paidMoney(Double.parseDouble(tfpaidmoney));
		tb_balancement.setBm_receivMoney(Double.parseDouble(tfreceivmoney));
		if (tfbmrefund != "" && tfbmrefund != null) {
			tb_balancement.setBm_refund(Double.parseDouble(tfbmrefund));
		} else {
			tb_balancement.setBm_refund(0);
		}

		tb_balancement.setBm_refundState(0);
		tb_balancement.setBm_cardName(tfbmcardname);
		tb_balancement.setBm_cardNumber(tfbmcardnumber);
		tb_balancement.setBm_cardPhone(tfbmcardphone);
		tb_balancement.setBm_cardId(tfbmcardid);
		tb_balancement.setBm_operator(tfbmoperator);
		tb_balancement.setBm_company(tfbmcompany);
		tb_balancement.setBm_receipt(Integer.parseInt(tfbmreceipt));
		tb_balancement.setBm_phone(tfbmphone);
		tb_balancement.setBm_address(tfbmaddress);
		tb_balancement.setBm_receiptStatus(0);
		tb_balancement.setBm_remark(tfbmremark);
		tb_balancement.setBm_createTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
		System.out.println(tb_balancement.getBm_paymentmodel());
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

	// 更改发票信息
	public void updrpTb_balancement(HttpServletRequest req, HttpServletResponse resp) {
		String bm_id = req.getParameter("fpbmid");
		String bm_rpcp = req.getParameter("fpcorporate");
		String bm_rppo = req.getParameter("fpphone");
		String bm_rpad = req.getParameter("fpaddress");
		String bm_rpst = req.getParameter("fpstate");
		Tb_balancement tb_balancement = new Tb_balancement();
		tb_balancement.setBm_id(Integer.parseInt(bm_id));
		tb_balancement.setBm_company(bm_rpcp);
		tb_balancement.setBm_phone(bm_rppo);
		tb_balancement.setBm_address(bm_rpad);
		tb_balancement.setBm_receiptStatus(Integer.parseInt(bm_rpst));
		int count = tb_balancementService.updrpTb_balancement(tb_balancement);
		boolean flag = PublicMethod.getSuccess(count);
		String returnJSON = "";
		if (flag) {
			returnJSON = "成功!";
		}
		PrintWriter out;
		try {
			out = resp.getWriter();
			out.print(returnJSON);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// 更改退款信息
	public void updrsTb_balancement(HttpServletRequest req, HttpServletResponse resp) {
		String bm_id = req.getParameter("tkbmid");
		String bm_refund = req.getParameter("tkmoney");
		String bm_cardName = req.getParameter("tkcardname");
		String bm_cardId = req.getParameter("tkcardid");
		String bm_cardPhone = req.getParameter("tkphone");
		String bm_refundState = req.getParameter("tkstate");
		System.out.println(bm_id + ":" + bm_refund + ":" + bm_cardName + ":" + bm_cardId + ":" + bm_cardPhone + ":"
				+ bm_refundState);
		Tb_balancement tb_balancement = new Tb_balancement();
		tb_balancement.setBm_id(Integer.parseInt(bm_id));
		tb_balancement.setBm_refund(Double.parseDouble(bm_refund));
		tb_balancement.setBm_cardName(bm_cardName);
		tb_balancement.setBm_cardId(bm_cardId);
		tb_balancement.setBm_cardPhone(bm_cardPhone);
		tb_balancement.setBm_refundState(Integer.parseInt(bm_refundState));
		int count = tb_balancementService.updrsTb_balancement(tb_balancement);
		boolean flag = PublicMethod.getSuccess(count);
		String returnJSON = "";
		if (flag) {
			returnJSON = "成功!";
		}
		PrintWriter out;
		try {
			out = resp.getWriter();
			out.print(returnJSON);
			out.flush();
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void getByCdidTb_balancement(HttpServletRequest req, HttpServletResponse resp) {
		int cdid = Integer.parseInt(req.getParameter("cdid"));
		System.out.println("查询账单:" + cdid);
		Tb_balancement tb_balancement = tb_balancementService.getByCdidTb_balancement(cdid);
		String returnJSON = "";
		if (returnJSON != null) {
			returnJSON = JSON.toJSONString(tb_balancement);
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
