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

	// 结账同时添加结账信息表(Tb_balancement)
	@Override
	public int addTb_balancement(Tb_balancement tb_balancement) {
		String prepardSql = "INSERT tb_balancement VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)"; 
		int id = (int) super.executeUpdata(prepardSql, tb_balancement.getBm_id(),tb_balancement.getBm_checkinorderId(),tb_balancement.getBm_roomId(),tb_balancement.getBm_guestId(),tb_balancement.getBm_paymentmodel(),tb_balancement.getBm_totalRate(),tb_balancement.getBm_paidMoney(),tb_balancement.getBm_receivMoney(),tb_balancement.getBm_refund(),tb_balancement.getBm_receiptStatus(),tb_balancement.getBm_cardName(),tb_balancement.getBm_cardNumber(),tb_balancement.getBm_cardId(),tb_balancement.getBm_cardPhone(),tb_balancement.getBm_createTime(),tb_balancement.getBm_operator(),tb_balancement.getBm_receipt(),tb_balancement.getBm_company(),tb_balancement.getBm_phone(),tb_balancement.getBm_address(),tb_balancement.getBm_receiptStatus(),tb_balancement.getBm_remark());
		return id;
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
		String prepardSql = "SELECT * FROM tb_balancement where bm_checkinorderId = ? ";
		return super.executeQuery(new BeanHandler<Tb_balancement>(Tb_balancement.class), prepardSql, checkinorderId);
	}

}
