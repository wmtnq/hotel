package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_roomDao;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_room;
import hotel.entry.Tb_roomcatalog;

public class Tb_roomDaoImpl extends BaseDaoDBUtil<Tb_room> implements Tb_roomDao {

	// 获取全部的房间
	@Override
	public List<Tb_room> getAllTb_room() {
		String sql = "select * from Tb_room";
		return super.executeQuery(new BeanListHandler<Tb_room>(Tb_room.class), sql);

	}

	// 结账同时更新客房信息表(Tb_room)客房状态(RMSTATE)
	@Override
	public int updTb_room(Tb_balancement tb_balancement) {
		String prepardSql = "UPDATE tb_room set rm_state=? where rm_id=?";
		int count = super.executeUpdate(prepardSql, 0, tb_balancement.getBm_roomId());
		return count;
	}

	// 入住更新1：客房信息表(tb_room)客房状态(RMSTATE)
	@Override
	public int updTb_room(Tb_checkinitem tb_checkinitem) {
		String prepardSql = "Update tb_romm set rm_state=? where rm_id=?";
		int count = super.executeUpdate(prepardSql, tb_checkinitem.getCim_state(), tb_checkinitem.getCim_roomId());
		return count;
	}

	// 新增客房
	@Override
	public int addTb_room(Tb_room tb_room) {
		String sql = "insert into tb_room(rm_id,rm_area,rm_floor,rm_prctPrice,rm_telphone,"
				+ "rm_state,rm_available,rm_catalog,rm_picture,rm_prctdiscount)" + "values(?,?,?,?,?,?,?,?,?,?)";
		return super.executeUpdate(sql, tb_room.getRm_id(), tb_room.getRm_area(), tb_room.getRm_floor(),
				tb_room.getRm_prctPrice(), tb_room.getRm_telphone(), tb_room.getRm_state(), tb_room.getRm_available(),
				tb_room.getRm_catalog(), tb_room.getRm_picture(), tb_room.getRm_prctdiscount());
	}

	// 修改1：通过id获取该条客房的信息
	@Override
	public Tb_room getByIdTb_room(int id) {
		// TODO Auto-generated method stub
		String prepardSql = "Select * from tb_room where rm_id = ?";
		return super.executeQuery(new BeanHandler<Tb_room>(Tb_room.class), prepardSql, id);
	}

	// 修改2：更新客房信息
	@Override
	public int updTb_room(Tb_room tb_room) {
		String prepardSql = "UPDATE tb_room SET rm_area=?,rm_floor=?,rm_prctPrice=?,rm_telphone=?,rm_state=?,rm_available=?,rm_catalog=?,rm_picture=?,rm_prctdiscount=? WHERE rm_id=?";
		int count = super.executeUpdate(prepardSql, tb_room.getRm_area(), tb_room.getRm_floor(),
				tb_room.getRm_prctPrice(), tb_room.getRm_telphone(), tb_room.getRm_state(), tb_room.getRm_available(),
				tb_room.getRm_catalog(), tb_room.getRm_picture(), tb_room.getRm_prctdiscount(), tb_room.getRm_id());
		return count;
	}

	// 删除客房信息
	@Override
	public int delTb_room(Tb_room tb_room) {
		String sql = "delete from tb_room where rm_id=?";
		return super.executeUpdate(sql, tb_room.getRm_id());
	}

	// 删除客房信息
	@Override
	public int delTb_rooms(Tb_roomcatalog Tb_roomcatalog) {
		String prepardSql = "delete from tb_room where rm_catalog=?";
		int count = super.executeUpdate(prepardSql, Tb_roomcatalog.getRc_id());
		return count;
	}

}
