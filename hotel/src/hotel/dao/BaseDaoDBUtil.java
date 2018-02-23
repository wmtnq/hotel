package hotel.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import hotel.util.JdbcUtil;

public class BaseDaoDBUtil<T> {

	private QueryRunner queryRunner = new QueryRunner();
	private Connection conn = null;

	/**
	 * 更新
	 * 
	 * @param prepardSql
	 * @param objects
	 * @return
	 */
	public int executeUpdate(String prepardSql, Object... objects) {
		conn = JdbcUtil.getConnection();
		PreparedStatement ps = null;
		int num = 0;
		try {
			ps = conn.prepareStatement(prepardSql);
			for (int i = 0; i < objects.length; i++) {
				ps.setObject(i + 1, objects[i]);
			}
			num = ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn, ps);
		}
		return num;
	}

	/**
	 * 查询返回多个对象
	 * 
	 * @param mapper
	 * @param prepardSql
	 * @param objects
	 * @return
	 */
	public List<T> executeQuery(BeanListHandler<T> mapper, String prepardSql, Object... objects) {
		List<T> list = new ArrayList<T>();
		conn = JdbcUtil.getConnection();
		try {
			list = queryRunner.query(conn, prepardSql, mapper, objects);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
		}
		return list;
	}

	/**
	 * 查询返回单个对象
	 * 
	 * @param mapper
	 * @param prepardSql
	 * @param objects
	 * @return
	 */
	public T executeQuery(BeanHandler<T> mapper, String prepardSql, Object... objects) {
		T t = null;
		conn = JdbcUtil.getConnection();
		try {
			t = queryRunner.query(conn, prepardSql, mapper, objects);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
		}
		return t;
	}

	/**
	 * 查询返回单个数值
	 * @param mapper
	 * @param prepardSql
	 * @param objects
	 * @return
	 */
	public Object executeQuery(ScalarHandler mapper, String prepardSql, Object... objects) {
		Object object = null;
		conn = JdbcUtil.getConnection();
		try {
			object = queryRunner.query(conn, prepardSql, mapper, objects);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			JdbcUtil.close(conn);
		}
		return object;
	}
}
