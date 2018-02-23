package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_roomDao;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_room;

public class Tb_roomDaoImpl extends BaseDaoDBUtil<Tb_room> implements Tb_roomDao {

	//获取全部的房间
	@Override
	public List<Tb_room> getAllTb_room() {
		// TODO Auto-generated method stub
		return null;
		
	}

	//结账同时更新客房信息表(Tb_room)客房状态(RMSTATE)
	@Override
	public int updTb_room(Tb_balancement tb_balancement) {
		// TODO Auto-generated method stub
		return 0;
	}

	//入住更新1：客房信息表(tb_room)客房状态(RMSTATE)
	@Override
	public int updTb_room(Tb_checkinitem tb_checkinitem) {
		// TODO Auto-generated method stub
		return 0;
	}

	//新增客房
	@Override
	public int addTb_room() {
		// TODO Auto-generated method stub
		return 0;
	}

	//修改1：通过id获取该条客房的信息
	@Override
	public Tb_room getByIdTb_room(int id) {
		// TODO Auto-generated method stub
		String prepardSql = "Select * from tb_room where rm_id = ?";
		return super.executeQuery(new BeanHandler<Tb_room>(Tb_room.class), prepardSql, id);
	}

	//修改2：更新客房信息
	@Override
	public int add_Tb_room(Tb_room tb_room) {
		// TODO Auto-generated method stub
		return 0;
	}

	//删除客房信息
	@Override
	public int del_Tb_room() {
		// TODO Auto-generated method stub
		return 0;
	}

}
