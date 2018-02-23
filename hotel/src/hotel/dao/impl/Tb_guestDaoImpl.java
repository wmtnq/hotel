package hotel.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	public int addTb_guest(Tb_checkinitem tb_checkinitem) {
		// TODO Auto-generated method stub
		String prepardSql = "";
		super.executeUpdate(prepardSql);
		return 0;
	}

	public static void main(String[] args) {
		Tb_guestDaoImpl tb  =  new Tb_guestDaoImpl();
		System.out.println(tb.getAllTb_guest().get(0).getGt_cardcatalog());
	}
}
