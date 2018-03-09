package hotel.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletResponse respone = (HttpServletResponse) resp;
		HttpServletRequest request = (HttpServletRequest)req;
		Object object = request.getSession().getAttribute("log");
		System.out.println("过滤器");
		System.out.println(object==null);
		if (object != null) {
			chain.doFilter(req, resp);
		}else {
			respone.sendRedirect("http://locahost:8080/hotel/home/register.jsp");
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
