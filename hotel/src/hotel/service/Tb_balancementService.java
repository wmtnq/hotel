package hotel.service;

import java.util.List;

import hotel.entry.Tb_balancement;

/**
 * 
 * @author dadawang 结账信息表
 */
public interface Tb_balancementService {

	// 结账同时更新结账信息表(Tb_balancement)
	boolean updTb_balancement(Tb_balancement tb_balancement);

	// 获取需要发票的订单
	List<Tb_balancement> getAllReceipt();

	// 获取结账中退款金额不为0的条目
	List<Tb_balancement> getAllRefundState();

	// 更改发票信息
	int updrpTb_balancement(Tb_balancement tb_balancement);

	// 更改退款信息
	int updrsTb_balancement(Tb_balancement tb_balancement);

	//通过订单编号获取账单
	Tb_balancement getByCdidTb_balancement(int cdid);
}
