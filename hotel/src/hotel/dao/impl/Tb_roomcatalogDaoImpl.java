package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_roomcatalogDao;
import hotel.entry.Tb_roomcatalog;

public class Tb_roomcatalogDaoImpl extends BaseDaoDBUtil<Tb_roomcatalog> implements Tb_roomcatalogDao {

	// 获取所有房间类型
	@Override
	public List<Tb_roomcatalog> getAllTb_roomcatalog() {
		// TODO Auto-generated method stub
		String sql = "select * from tb_roomcatalog";
		return super.executeQuery(new BeanListHandler<Tb_roomcatalog>(Tb_roomcatalog.class), sql);
	}
	
	// 获取所有房间类型
		@Override
		public List<Tb_roomcatalog> getStateAllTb_roomcatalog() {
			// TODO Auto-generated method stub
			String sql = "select * from tb_roomcatalog where rc_state = 1";
			return super.executeQuery(new BeanListHandler<Tb_roomcatalog>(Tb_roomcatalog.class), sql);
		}

	// 新增房间类型
	@Override
	public int addTb_roomcatalog(Tb_roomcatalog tb_roomcatalog) {
		String sql = "insert tb_roomcatalog values(?,?,?,?,?,?,?,?)";
		return super.executeUpdate(sql, tb_roomcatalog.getRc_id(),tb_roomcatalog.getRc_name(),tb_roomcatalog.getRc_bedNumber(),tb_roomcatalog.getRc_prePrice(),tb_roomcatalog.getRc_prediscount(),tb_roomcatalog.getRc_hourbasePrice(),tb_roomcatalog.getRc_perhourPrice(),tb_roomcatalog.getRc_state());
	}

	// 修改1：通过id获取该房型的类型信息
	@Override
	public Tb_roomcatalog getByIdTb_roomcatalog(int id) {
		String prepardSql = "select * from Tb_roomcatalog where rc_id=?";
		return super.executeQuery(new BeanHandler<Tb_roomcatalog>(Tb_roomcatalog.class), prepardSql, id);
	}

	// 修改2：更新房型的类型
	@Override
	public int updTb_roomcatalog(Tb_roomcatalog tb_roomcatalog) {
		String prepardSql = "UPDATE tb_roomcatalog SET rc_name=?,rc_bedNumber=?,rc_prePrice=?,rc_prediscount=?,rc_hourbasePrice=?,rc_perhourPrice=? WHERE rc_id=?";
		int count = super.executeUpdate(prepardSql, tb_roomcatalog.getRc_name(), tb_roomcatalog.getRc_bedNumber(),
				tb_roomcatalog.getRc_prePrice(), tb_roomcatalog.getRc_prediscount(),
				tb_roomcatalog.getRc_hourbasePrice(), tb_roomcatalog.getRc_perhourPrice(), tb_roomcatalog.getRc_id());
		return count;
	}

	// 暂停入住该客房类型：暂停入住该客房类型必须要先暂停入住该类型的客房
	@Override
	public int pauseTb_roomcatalog(Tb_roomcatalog tb_roomcatalog) {
		String sql = "UPDATE tb_roomcatalog SET rc_state = 0 where rc_id=?";
		return super.executeUpdate(sql, tb_roomcatalog.getRc_id());
	}

	// 开放入住客房类型：开放入住该客房类型必须要先开放入住该类型的客房
	@Override
	public int startTb_roomcatalog(Tb_roomcatalog tb_roomcatalog) {
		String sql = "UPDATE tb_roomcatalog SET rc_state = 1 where rc_id=?";
		return super.executeUpdate(sql, tb_roomcatalog.getRc_id());
	}

	public static void main(String[] args) {
		Tb_roomcatalogDaoImpl tb = new Tb_roomcatalogDaoImpl();
		System.out.println(tb.getAllTb_roomcatalog().get(0).getRc_bedNumber());
	}
}
