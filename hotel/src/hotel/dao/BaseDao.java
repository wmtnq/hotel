package hotel.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BaseDao {
	static String driver = "";
	static String url = "";
	static {
		InputStream is = BaseDao.class.getClassLoader().getResourceAsStream("config.properties");
		Properties pt = new Properties();
		try {
			pt.load(is);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver = pt.getProperty("driverClassName");
		url = pt.getProperty("url");
		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Connection getConnection() {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
	}

	public ResultSet executeQuery(String sql, Object... parames) {
		Connection conn = getConnection();
		ResultSet res = null;
		try {
			PreparedStatement pet = conn.prepareStatement(sql);
			for (int i = 0; i < parames.length; i++) {
				pet.setObject((i + 1), parames[i]);
			}
			res = pet.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return res;
	}

	public int executeUpData(String sql, Object... parames) {
		Connection conn = getConnection();
		int index = 0;
		try {
			PreparedStatement pet = conn.prepareStatement(sql);
			for (int i = 0; i < parames.length; i++) {
				pet.setObject((i + 1), parames[i]);
			}
			index = pet.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return index;
	}

	public void cloce(ResultSet res, Statement st, Connection conn) {
		try {
			res.close();
			st.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
