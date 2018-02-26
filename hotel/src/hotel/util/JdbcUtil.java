package hotel.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class JdbcUtil {

	private static ComboPooledDataSource dataSource = null;
	private static Connection conn = null;
	static {
		dataSource = new ComboPooledDataSource("webApp");
	}

	public static Connection getConnection() {
		try {
			conn = dataSource.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public static boolean close(Connection conn) {

		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("关闭失败");
			return false;
		}

		return true;
	}

	public static boolean close(Connection conn, Statement ps) {

		try {
			if (ps != null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return false;

	}

	public static boolean close(Connection conn, Statement ps, ResultSet res) {

		try {
			if (res != null) {
				res.close();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("ResuleSet关闭失败");
			return false;
		}

		try {
			if (ps != null) {
				ps.close();
			}
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Statement关闭失败");
			return false;
		}

		try {
			if (conn != null) {
				conn.close();
				conn = null;
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("Connection关闭失败");
		}

		return true;
	}

}
