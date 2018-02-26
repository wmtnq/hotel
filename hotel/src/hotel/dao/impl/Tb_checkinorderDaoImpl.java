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
		String prepardSql = "UPDATE tb_checkinorder set cio_prctOutDateTime=?,cio_State=?,cio_paymentmodel=?,cio_totalRate=? where cio_id = ?";
		int count = super.executeUpdate(prepardSql, tb_balancement.getBm_createTime(), 2,
				(tb_balancement.getBm_totalRate() + tb_balancement.getBm_paidMoney() - tb_balancement.getBm_refund()),
				tb_balancement.getBm_checkinorderId());
		return count;
	}

	// 入住添加2：入住登记订单表
	@Override
	public int addTb_checkinorder(Tb_checkinitem tb_checkinitem) {
		String prepardSql = "INSERT Tb_checkinorder VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
		Tb_checkinorder tb_checkinorder = tb_checkinitem.getTb_checkinorder();
		int count = (int) super.executeUpdata(prepardSql, tb_checkinorder.getCio_id(), tb_checkinorder.getCio_guestID(),
				tb_checkinorder.getCio_manNumber(), tb_checkinorder.getCio_guestCatalog(),
				tb_checkinorder.getCio_guestType(), tb_checkinorder.getCio_groupName(),
				tb_checkinorder.getCio_guestCardCatalog(), tb_checkinorder.getCio_guestCardId(),
				tb_checkinorder.getCio_cause(), tb_checkinorder.getCio_State(), tb_checkinorder.getCio_inDateTime(),
				tb_checkinorder.getCio_outDateTime(), tb_checkinorder.getCio_prctOutDateTime(),
				tb_checkinorder.getCio_paymentmodel(), tb_checkinorder.getCio_paidMoney(),
				tb_checkinorder.getCio_iseservid(), tb_checkinorder.getCio_operator(),
				tb_checkinorder.getCio_guestGender(), tb_checkinorder.getCio_totalRate(),
				tb_checkinorder.getCio_consumption(), tb_checkinorder.getCio_consumptionDetails(),
				tb_checkinorder.getCio_orderid());
		return count;
	}

	// 查询订单2：通过登记编号查询订单
	@Override
	public Tb_checkinorder getTb_checkinorderRow(int orderId) {
		// TODO Auto-generated method stub
		String prepardSql = "Select * from tb_checkinorder where cio_id = ?";
		return super.executeQuery(new BeanHandler<Tb_checkinorder>(Tb_checkinorder.class), prepardSql, orderId);
	}

	// 更新额外消费以及额外消费说明
	@Override
	public int updTb_checkinorder(Tb_checkinorder tb_checkinorder) {
		String prepardSql = "UPDATE tb_checkinorder set cio_consumption=?,cio_consumptionDetails=? WHERE cio_id = ?";
		int count = super.executeUpdate(prepardSql, tb_checkinorder.getCio_consumption(),
				tb_checkinorder.getCio_consumptionDetails(), tb_checkinorder.getCio_id());
		return count;
	}

}
