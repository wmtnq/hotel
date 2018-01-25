package hotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hotel.entry.Tb_putype;
import hotel.service.Tb_putypeService;
import hotel.service.impl.Tb_putypeServiceImpl;

public class GetAllTb_putypeServlet extends HttpServlet {
	private Tb_putypeService tb_putypeService = new Tb_putypeServiceImpl();
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		List<Tb_putype> list = tb_putypeService.getAllTb_putype();
		System.out.println(list.size());
		req.setAttribute("list", list);
		req.getRequestDispatcher("index.jsp").forward(req, resp);
	}
}
