package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_pupaymenttypeDao;
import hotel.entry.Tb_pupaymenttype;

/**
 * 支付类型
 * 
 * @author dadawang
 *
 */
public class Tb_pupaymenttypeDaoImpl extends BaseDaoDBUtil<Tb_pupaymenttype> implements Tb_pupaymenttypeDao {

	// 获取全部支付类型
	@Override
	public List<Tb_pupaymenttype> getAllTb_pupaymenttype() {
		// TODO Auto-generated method stub
		String prepardSql = "SELECT * FROM tb_pupaymenttype";
		List<Tb_pupaymenttype> list = super.executeQuery(new BeanListHandler<Tb_pupaymenttype>(Tb_pupaymenttype.class),
				prepardSql);
		return list;
	}

	// 通过id获取支付方式
	@Override
	public Tb_pupaymenttype getByIdTb_pupaymenttype(int ppt_id) {
		String prepardSql = "SELECT * FROM tb_pupaymenttype WHERE ppt_id = ?";
		Tb_pupaymenttype tb_pupaymenttype = super.executeQuery(
				new BeanHandler<Tb_pupaymenttype>(Tb_pupaymenttype.class), prepardSql, ppt_id);
		return tb_pupaymenttype;
	}

	public static void main(String[] args) {
		Tb_pupaymenttypeDaoImpl tb = new Tb_pupaymenttypeDaoImpl();
		System.out.println(tb.getByIdTb_pupaymenttype(1).getPpt_guestTypeName());
	}

}
