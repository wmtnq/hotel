package hotel.dao.impl;

import org.apache.commons.dbutils.handlers.BeanHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_checkinorderDao;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_checkinorder;

public class Tb_checkinorderDaoImpl extends BaseDaoDBUtil<Tb_checkinorder> implements Tb_checkinorderDao {

	// 结账同时更新入住登记订单表(Tb_checkinorder)登记状态(CIOSTATE)、客人实际离开时间(CIOPRCTOUTDATETIME)、支付类型(CIOPAYMENTMODEL)
	@Override
	public int updTb_checkinorder(Tb_balancement tb_balancement) {
		// TODO Auto-generated method stub
		return 0;
	}

	//入住添加2：入住登记订单表
	@Override
	public int addTb_checkinorder(Tb_checkinitem tb_checkinitem) {
		// TODO Auto-generated method stub
		return 0;
	}

	//查询订单2：通过登记编号查询订单
	@Override
	public	Tb_checkinorder getTb_checkinorderRow(int orderId) {
		// TODO Auto-generated method stub
		String prepardSql  = "Select * from tb_checkinorder where cio_id = ?";
		return super.executeQuery(new BeanHandler<Tb_checkinorder>(Tb_checkinorder.class), prepardSql,orderId);
	}
}
