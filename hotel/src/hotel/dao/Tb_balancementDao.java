package hotel.dao;

import java.util.List;

import hotel.entry.Tb_balancement;

/**
 * 
 * @author dadawang 结账信息表
 */
public interface Tb_balancementDao {

	// 结账同时添加结账信息表(Tb_balancement)
	int addTb_balancement(Tb_balancement tb_balancement);

	// 获取需要发票的订单
	List<Tb_balancement> getAllReceipt(int state);

	// 获取结账中退款金额不为0的条目
	List<Tb_balancement> getAllReceipt();

	//查询3：根据订单编号查询账单
	Tb_balancement getTb_balancementRow(int bm_checkinorderId);
}
