package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_pucategoryDao;
import hotel.entry.Tb_pucategory;

/**
 * 客人类别表
 * 
 * @author dadawang
 *
 */
public class Tb_pucategoryDaoImpl extends BaseDaoDBUtil<Tb_pucategory> implements Tb_pucategoryDao {

	// 获取所有客人类别
	@Override
	public List<Tb_pucategory> getAllTb_pucategory() {
		// TODO Auto-generated method stub
		String prepardSql = "SELECT * FROM tb_pucategory";

		List<Tb_pucategory> list = super.executeQuery(new BeanListHandler<Tb_pucategory>(Tb_pucategory.class),
				prepardSql);
		return list;
	}

	public static void main(String[] args) {
		Tb_pucategoryDaoImpl tb = new Tb_pucategoryDaoImpl();
		System.out.println(tb.getAllTb_pucategory().get(0).getPcg_categoryName());
	}
}
