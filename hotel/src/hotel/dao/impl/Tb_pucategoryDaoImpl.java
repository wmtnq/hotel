package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
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

	// 通过消费额获取客户类别
	@Override
	public Tb_pucategory getByMoneyTb_pucategory(int  gt_expenditure) {
		String prepardSql = "SELECT * FROM tb_pucategory WHERE pcg_expenditure<=? ORDER BY -pcg_expenditure LIMIT 1 ";
		Tb_pucategory tb_pucategory = super.executeQuery(new BeanHandler<Tb_pucategory>(Tb_pucategory.class),
				prepardSql, gt_expenditure);
		return tb_pucategory;
	}

	public static void main(String[] args) {
		Tb_pucategoryDaoImpl tb = new Tb_pucategoryDaoImpl();
		System.out.println(tb.getAllTb_pucategory().get(0).getPcg_categoryName());
	}

	// 通过id获取客户类别
	@Override
	public Tb_pucategory getByIdTb_pucategory(int gr_id) {
		String prepardSql = "SELECT * FROM tb_pucategory WHERE pcg_cio = ?";
		Tb_pucategory tb_pucategory = super.executeQuery(new BeanHandler<Tb_pucategory>(Tb_pucategory.class),
				prepardSql, gr_id);
		return tb_pucategory;
	}
}
