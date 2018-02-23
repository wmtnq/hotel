package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_checkinitemDao;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;

public class Tb_checkinitemDaoImpl extends BaseDaoDBUtil<Tb_checkinitem> implements Tb_checkinitemDao {

	// 查询所有入住登记信息表(Tb_checkinitem)
	@Override
	public List<Tb_checkinitem> getAllTb_checkinitem() {
		// TODO Auto-generated method stub
		String prepardSql = "SELECT * FROM tb_checkinitem";
		return super.executeQuery(new BeanListHandler<Tb_checkinitem>(Tb_checkinitem.class), prepardSql);
	}

	@Override
	public List<Tb_checkinitem> getStatusTb_checkinitemAndTb_checkinorderAndTb_balancement(int state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tb_checkinitem> getAllTb_checkinitemAndTb_checkinorderAndTb_balancement() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tb_checkinitem> getByIdTb_checkinitemAndTb_checkinorderAndTb_balancement(int rmid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Tb_checkinitem> getNotidleTb_checkinitemAndTb_checkinorderAndTb_balancement(int state) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updTb_checkinitem(Tb_balancement tb_balancement) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addTb_checkinitem(Tb_checkinitem tb_checkinitem) {
		// TODO Auto-generated method stub
		return 0;
	}

}
