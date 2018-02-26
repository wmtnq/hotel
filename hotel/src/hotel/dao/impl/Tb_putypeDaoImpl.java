package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_putypeDao;
import hotel.entry.Tb_putype;

/**
 * 客户类型
 * 
 * @author dadawang
 *
 */
public class Tb_putypeDaoImpl extends BaseDaoDBUtil<Tb_putype> implements Tb_putypeDao {

	// 获取全部客户类型
	@Override
	public List<Tb_putype> getAllTb_putype() {
		// TODO Auto-generated method stub
		String prepardSql = "SELECT * FROM tb_putype";
		List<Tb_putype> list = super.executeQuery(new BeanListHandler<Tb_putype>(Tb_putype.class), prepardSql);

		return list;
	}

	// 通过id获取客户类型
	@Override
	public Tb_putype getByIdTb_putype(int pt_id) {
		String prepardSql = "SELECT * FROM tb_putype WHERE pt_id = ?";
		Tb_putype tb_putype = super.executeQuery(new BeanHandler<Tb_putype>(Tb_putype.class), prepardSql, pt_id);

		return tb_putype;
	}

	public static void main(String[] args) {
		Tb_putypeDaoImpl tb = new Tb_putypeDaoImpl();
		System.out.println(tb.getAllTb_putype().get(0).getPt_typeName());
	}

}
