package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpResponse;

import hotel.servlet.BaseServlet;
import hotel.util.sendMessage.SDKDemo;

public class SDKDemoImpl extends BaseServlet {

	public void setMessageService(HttpServletRequest req, HttpServletResponse resp) {
		String telNumber =  req.getParameter("telNumber");
		int yzm = (int) (Math.random() * 9000 + 1000);
		req.getSession().setAttribute("yzm", yzm);
		String content = "您的验证码是"+yzm+"，在10分钟内有效。如非本人操作请忽略本短信。";
		SDKDemo.sendMessage(telNumber, content);
		String returnJSON = "成功!";
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

	public void getMessageService(HttpServletRequest req, HttpServletResponse resp) {
		String ycode = req.getParameter("yanzheng");
		String rcode = (String) req.getSession().getAttribute("yzm");
		String returnJSON = "";
		if (ycode == rcode) {
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
}
