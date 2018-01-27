package hotel.dao;

import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;

/**
 * 
 * @author dadawang 入住登记订单表
 */
public interface Tb_checkinorderDao {

	// 结账同时更新入住登记订单表(Tb_checkinorder)登记状态(CIOSTATE)、客人实际离开时间(CIOPRCTOUTDATETIME)、支付类型(CIOPAYMENTMODEL)
	int updTb_checkinorder(Tb_balancement tb_balancement);

	//入住添加2：入住登记订单表
	int addTb_checkinorder(Tb_checkinitem tb_checkinitem);

	
}
