package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_guestDao;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_guest;

public class Tb_guestDaoImpl extends BaseDaoDBUtil<Tb_guest> implements Tb_guestDao {

	// 获取客户信息分组计算数量按照数量倒序排列消费的总和判断会员等级
	@Override
	public List<Tb_guest> getAllTb_guest() {
		// TODO Auto-generated method stub
		String prepardSql = "SELECT *,SUM(tb_checkinorder.cio_totalRate) as gt_expenditure ,COUNT(1) as gt_nuber FROM tb_guest,tb_checkinorder WHERE tb_guest.gt_id = tb_checkinorder.cio_guestID GROUP BY tb_guest.gt_cardId";
		List<Tb_guest> list = super.executeQuery(new BeanListHandler<Tb_guest>(Tb_guest.class), prepardSql);
		return list;
	}

	// 入住添加3：添加客户信息
	@Override
	public long addTb_guest(Tb_checkinitem tb_checkinitem) {
		// TODO Auto-generated method stub
		String prepardSql = "INSERT tb_guest VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Tb_guest tb_guest = tb_checkinitem.getTb_checkinorder().getTb_guest();
		long count = (long) super.executeUpdata(prepardSql, tb_guest.getGt_id(), tb_guest.getGt_name(),
				tb_guest.getGt_type(), tb_guest.getGt_pucategory(), tb_guest.getGt_cardcatalog(),
				tb_guest.getGt_cardId(), tb_guest.getGt_country(), tb_guest.getGt_address(), tb_guest.getGt_zip(),
				tb_guest.getGt_company(), tb_guest.getGt_telPhone(), tb_guest.getGt_mobile(), tb_guest.getGt_gender(),
				tb_guest.getGt_email(), tb_guest.getGt_createtime());
		return count;
	}

	// 通过id获取客户实体
	@Override
	public Tb_guest getByIdTb_guest(int id) {
		String prepardSql = "SELECT * FROM tb_guest";
		Tb_guest tb_guest = super.executeQuery(new BeanHandler<Tb_guest>(Tb_guest.class), prepardSql);
		return tb_guest;
	}

	// 更新客户类别
	@Override
	public int updGt_expenditure(int gs_id, int gr_id) {
		String prepardSql = "UPDATE tb_guest SET gt_pucategory = ? WHERE gt_id = ?";
		int count = super.executeUpdate(prepardSql, gr_id, gs_id);
		return count;
	}

	//更新客户信息
	
	
	//通过身份证号获取客户实体
	@Override
	public Tb_guest getByCardidTb_guest(String cardid) {
		String prepardSql = "SELECT * FROM tb_guest where gt_cardId = ?";
		Tb_guest tb_guest = super.executeQuery(new BeanHandler<Tb_guest>(Tb_guest.class), prepardSql, cardid);
		return tb_guest;
	}
	
	public int updTb_guest(Tb_checkinitem tb_checkinitem) {
		String prepardSql = "UPDATE tb_guest SET gt_telPhone = ?,gt_mobile=? ,gt_company=?,gt_address=?,gt_email = ? WHERE gt_id = ?";
		Tb_guest tb_guest= tb_checkinitem.getTb_checkinorder().getTb_guest();
		super.executeUpdate(prepardSql, tb_guest.getGt_telPhone(),tb_guest.getGt_mobile(),tb_guest.getGt_company(),tb_guest.getGt_address(),tb_guest.getGt_email(),tb_guest.getGt_id());
		return 0;
	}
}
