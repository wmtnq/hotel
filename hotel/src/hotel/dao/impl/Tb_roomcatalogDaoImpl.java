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

	// 新增房间类型
	@Override
	public int addTb_roomcatalog(Tb_roomcatalog tb_roomcatalog) {
		String sql = "inster into tb_roomcatalog(rc_id,rc_name,rc_bedNumber,rc_prePrice,rc_prediscount,rc_hourbasePrice,rc_perhourPrice)"
				+ "values(?,?,?,?,?,?,?)";
		return super.executeUpdate(sql, tb_roomcatalog);
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

	// 删除客房类型：删除客房必须要先删除该类型的客房
	@Override
	public int delTb_roomcatalog(Tb_roomcatalog tb_roomcatalog) {
		String sql = "delete from tb_roomcatalog where rc_id=?";
		return super.executeUpdate(sql, tb_roomcatalog);
	}

	public static void main(String[] args) {
		Tb_roomcatalogDaoImpl tb = new Tb_roomcatalogDaoImpl();
		System.out.println(tb.getAllTb_roomcatalog().get(0).getRc_bedNumber());
	}
}
