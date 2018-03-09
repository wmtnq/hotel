package hotel.util.updimg;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpAjax extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String path = req.getSession().getServletContext().getRealPath("home/admin/roomimg");
		String imageData = req.getParameter("imagedata");
		System.out.println(path);
		Date date = new Date();
		long time =  date.getTime();
		String fileName = time+".jpg";
		System.out.println("服务器绝对路径的地址："+path);
		System.out.println("文件名称:"+fileName);
		System.out.println(imageData);
		imageData = imageData.substring(imageData.indexOf(",")+1);
		imageData = imageData.replaceAll(" ", "+");
		System.out.println(imageData);
		ImageUtil.generateImage(imageData, path+"/"+fileName);
		resp.getWriter().print("roomimg/"+fileName);
	}

}
