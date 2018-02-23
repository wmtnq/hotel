package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_balancementDao;
import hotel.entry.Tb_balancement;

/**
 * 
 * @author dadawang 结账信息表
 */
public class Tb_balancementDaoImpl extends BaseDaoDBUtil<Tb_balancement> implements Tb_balancementDao {

	// 结账同时更新结账信息表(Tb_balancement)
	@Override
	public int updTb_balancement(Tb_balancement tb_balancement) {
		// TODO Auto-generated method stub
		return 0;
	}

	// 获取需要发票的订单
	@Override
	public List<Tb_balancement> getAllReceipt(int state) {
		// TODO Auto-generated method stub
		return null;
	}

	// 获取结账中退款金额不为0的条目
	@Override
	public List<Tb_balancement> getAllReceipt() {
		// TODO Auto-generated method stub
		return null;
	}

	//查询3：根据订单编号查询账单
	@Override
	public Tb_balancement getTb_balancementRow(int checkinorderId) {
		// TODO Auto-generated method stub
		String prepardSql = "SELECT * FROM tb_balancement where bm_checkinorderId = ? ";
		return super.executeQuery(new BeanHandler<Tb_balancement>(Tb_balancement.class), prepardSql, checkinorderId);
	}

}
