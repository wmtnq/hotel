package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_checkinitemDao;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.util.PublicMethod;

public class Tb_checkinitemDaoImpl extends BaseDaoDBUtil<Tb_checkinitem> implements Tb_checkinitemDao {

	// 查询所有入住登记信息表(Tb_checkinitem)
	@Override
	public List<Tb_checkinitem> getAllTb_checkinitem() {
		// TODO Auto-generated method stub
		String prepardSql = "SELECT * FROM tb_checkinitem";
		return super.executeQuery(new BeanListHandler<Tb_checkinitem>(Tb_checkinitem.class), prepardSql);
	}

	// 查询所有入住登记信息表(Tb_checkinitem)和入住登记订单表(tb_checkinorder)和结账信息表(tb_balancement)筛选状态(CIMSTATE);
	@Override
	public List<Tb_checkinitem> getStatusTb_checkinitemAndTb_checkinorderAndTb_balancement(int state) {
		String prepardSql = "SELECT * FROM tb_checkinitem where cim_state != ?";
		return super.executeQuery(new BeanListHandler<Tb_checkinitem>(Tb_checkinitem.class), prepardSql, state);
	}

	// 模糊查询筛选订单、登记表、账单多表联查中匹配的条目并输出
	@Override
	public List<Tb_checkinitem> getAllTb_checkinitemAndTb_checkinorderAndTb_balancement(String value) {
		String prepardSql = "SELECT * FROM tb_checkinitem join tb_checkinorder on tb_checkinitem.cim_id=tb_checkinorder.cio_orderid join tb_balancement on tb_balancement.bm_checkinorderId=tb_checkinitem.cim_id WHERE bm_cardId LIKE CONCAT(?,'%') OR cio_id LIKE CONCAT(?,'%') OR bm_id LIKE CONCAT(?,'%')";
		List<Tb_checkinitem> list = super.executeQuery(new BeanListHandler<Tb_checkinitem>(Tb_checkinitem.class),
				prepardSql, value, value, value);
		return list;
	}

	// 通过房间ID查询这个房间的订单信息
	@Override
	public List<Tb_checkinitem> getByIdTb_checkinitemAndTb_checkinorderAndTb_balancement(int rmid) {
		String prepardSql = "SELECT * FROM tb_checkinitem WHERE cim_roomId = ? ORDER BY -cim_inDateTime";
		List<Tb_checkinitem> list = super.executeQuery(new BeanListHandler<Tb_checkinitem>(Tb_checkinitem.class),
				prepardSql, rmid);
		return list;
	}

	// 结账同时更新入住登记信息表(Tb_checkinitem)离开时间(CIMOUTDATETIME)、登记状态(CIMSTATE)
	@Override
	public int updTb_checkinitem(Tb_balancement tb_balancement) {
		String prepardSql = "UPDATE tb_checkinitem set cim_outdateTime=?,cim_state=? where cim_chechinorderId = ?";
		int count = super.executeUpdate(prepardSql, tb_balancement.getBm_createTime(), 2,
				tb_balancement.getBm_checkinorderId());
		return count;
	}

	// 入住添加1：添加入住信息登记表
	@Override
	public int addTb_checkinitem(Tb_checkinitem tb_checkinitem) {
		String prepardSql = "INSERT tb_checkinitem VALUES(?,?,?,?,?,?,?,?) ";
		int count = (int) super.executeUpdata(prepardSql, tb_checkinitem.getCim_id(),
				tb_checkinitem.getCim_chechinorderId(), tb_checkinitem.getCim_roomId(),
				tb_checkinitem.getCim_prctPrice(), tb_checkinitem.getCim_discount(), tb_checkinitem.getCim_inDateTime(),
				tb_checkinitem.getCim_outdateTime(), tb_checkinitem.getCim_state());
		return count;
	}

	@Override
	// 入住添加2：更新登记表订单号
	public int updTb_checkinorder(int cio_id, int cim_id) {
		String prepardSql = "Update tb_checkinorder set cim_chechinorderId = ? where cim_id =  ? ";
		int count = super.executeUpdate(prepardSql, cim_id, cio_id);
		return count;
	}

}
