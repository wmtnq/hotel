package hotel.servlet.impl;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSON;

import hotel.entry.Tb_roomcatalog;
import hotel.service.Tb_roomcatalogService;
import hotel.service.impl.Tb_roomcatalogServiceImpl;
import hotel.servlet.BaseServlet;
import hotel.util.PublicMethod;

public class Tb_roomcatalogServlet extends BaseServlet {
	private Tb_roomcatalogService tb_roomcatalogService = new Tb_roomcatalogServiceImpl();

	// 获取全部
	private void getAllTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_roomcatalog> list = tb_roomcatalogService.getAllTb_roomcatalog();
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
	
	// 获取全部
	private void getStateAllTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_roomcatalog> list = tb_roomcatalogService.getStateAllTb_roomcatalog();
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

	// 入住获取房间
	private void getAllTb_roomcatalogCK(HttpServletRequest req, HttpServletResponse resp) {
		List<Tb_roomcatalog> list = tb_roomcatalogService.getAllTb_roomcatalog();
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

	// 通过ID获取
	private void getByIdTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {
		String id = req.getParameter("id");
		Tb_roomcatalog tb_roomcatalog = tb_roomcatalogService.getByIdTb_roomcatalog(Integer.parseInt(id));
		String returnJSON = JSON.toJSONString(tb_roomcatalog);
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

	// 修改
	private void updTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {
		String rcid = req.getParameter("rcid");
		String rcname = req.getParameter("rcname");
		String rcbednumber = req.getParameter("rcbednumber");
		String rcpreprice = req.getParameter("rcpreprice");
		String rcprediscount = req.getParameter("rcprediscount");
		String rchourbaseprice = req.getParameter("rchourbaseprice");
		String rcperhourprice = req.getParameter("rcperhourprice");
		Tb_roomcatalog tb_roomcatalog = new Tb_roomcatalog();
		tb_roomcatalog.setRc_id(Integer.parseInt(rcid));
		tb_roomcatalog.setRc_name(rcname);
		tb_roomcatalog.setRc_bedNumber(Integer.parseInt(rcbednumber));
		tb_roomcatalog.setRc_prePrice(Double.parseDouble(rcpreprice));
		tb_roomcatalog.setRc_prediscount(Double.parseDouble(rcprediscount));
		tb_roomcatalog.setRc_hourbasePrice(Double.parseDouble(rchourbaseprice));
		tb_roomcatalog.setRc_hourbasePrice(Double.parseDouble(rcperhourprice));
		int count = tb_roomcatalogService.updTb_roomcatalog(tb_roomcatalog);
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

	// 新增
	private void addTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {
		String rcid = req.getParameter("rcaddid");
		String rcname = req.getParameter("rcaddname");
		String rcbednumber = req.getParameter("rcaddbednumber");
		String rcpreprice = req.getParameter("rcaddpreprice");
		String rcprediscount = req.getParameter("rcaddprediscount");
		String rchourbaseprice = req.getParameter("rcaddhourbaseprice");
		String rcperhourprice = req.getParameter("rcaddperhourprice");
		System.out.println("新增客房类型:"+rcname+":"+rcbednumber+":"+rcpreprice+":"+rcprediscount+":"+rchourbaseprice+":"+rcperhourprice);
		Tb_roomcatalog tb_roomcatalog = new Tb_roomcatalog();
		if(rcid!="") {
			tb_roomcatalog.setRc_id(Integer.parseInt(rcid));
		}else {
			tb_roomcatalog.setRc_id(0);
		}
		tb_roomcatalog.setRc_name(rcname);
		tb_roomcatalog.setRc_bedNumber(Integer.parseInt(rcbednumber));
		tb_roomcatalog.setRc_prePrice(Float.parseFloat(rcpreprice));
		tb_roomcatalog.setRc_prediscount(Float.parseFloat(rcprediscount));
		tb_roomcatalog.setRc_hourbasePrice(Float.parseFloat(rchourbaseprice));
		tb_roomcatalog.setRc_perhourPrice(Float.parseFloat(rchourbaseprice));;
		tb_roomcatalog.setRc_state(1);
		int count = tb_roomcatalogService.addTb_roomcatalog(tb_roomcatalog);
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

	//暂停入住客该房类型以及该客房类型下的所有房间
	public void pauseTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {
		String rc_id = req.getParameter("rc_id");
		System.out.println(rc_id);
		Tb_roomcatalog tb_roomcatalog = new Tb_roomcatalog();
		tb_roomcatalog.setRc_id(Integer.parseInt(rc_id));
		boolean flag = tb_roomcatalogService.pauseTb_roomcatalog(tb_roomcatalog);
		String returnJSON = "";
		System.out.println("删除客房类型"+flag);
		if(flag) {
			returnJSON = "成功!";
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
	
	//开启客房类型以及该客房类型下的所有房间
		public void startTb_roomcatalog(HttpServletRequest req, HttpServletResponse resp) {
			String rc_id = req.getParameter("rc_id");
			Tb_roomcatalog tb_roomcatalog = new Tb_roomcatalog();
			tb_roomcatalog.setRc_id(Integer.parseInt(rc_id));
			boolean flag = tb_roomcatalogService.startTb_roomcatalog(tb_roomcatalog);
			String returnJSON = "";
			System.out.println("删除客房类型"+flag);
			if(flag) {
				returnJSON = "成功!";
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

		//开启客房类型
			public void startTb_roomcatalogx(HttpServletRequest req, HttpServletResponse resp) {
				String rc_id = req.getParameter("rc_id");
				Tb_roomcatalog tb_roomcatalog = new Tb_roomcatalog();
				tb_roomcatalog.setRc_id(Integer.parseInt(rc_id));
				boolean flag = tb_roomcatalogService.startTb_roomcatalogx(tb_roomcatalog);
				String returnJSON = "";
				System.out.println("删除客房类型"+flag);
				if(flag) {
					returnJSON = "成功!";
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
