package hotel.service.impl;

import java.util.List;

import hotel.dao.Tb_roomDao;
import hotel.dao.impl.Tb_roomDaoImpl;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_room;
import hotel.service.Tb_roomService;

public class Tb_roomServiceImpl implements Tb_roomService {
	private Tb_roomDao tb_roomDao = new Tb_roomDaoImpl();

	// 查询房间的所有信息(查)
	@Override
	public List<Tb_room> getAllTb_room() {
		return tb_roomDao.getAllTb_room();
	}

	// 结账同时更新客房信息表(Tb_room)客房状态(RMSTATE)
	@Override
	public int updTb_room(Tb_balancement tb_balancement) {
		// TODO Auto-generated method stub
		return tb_roomDao.updTb_room(tb_balancement);
	}

	// 入住更新1：客房信息表(tb_room)客房状态(RMSTATE)
	@Override
	public int updTb_room(Tb_checkinitem tb_checkinitem) {
		// TODO Auto-generated method stub
		return tb_roomDao.updTb_room(tb_checkinitem);
	}

	// 新增客房信息(增)
	@Override
	public int addTb_room(Tb_room tb_room) {
		int rm_id = tb_roomDao.addTb_room(tb_room);
		return rm_id;
	}

	// 修改客房信息(改)
	@Override
	public int updTb_room(Tb_room tb_room) {
		int count = tb_roomDao.updTb_room(tb_room);
		return count;
	}

	// 删除客房信息(删)
	@Override
	public int delTb_room(Tb_room tb_room) {
		int count = tb_roomDao.delTb_room(tb_room);
		return count;
	}

	public static void main(String[] args) {
		Tb_roomServiceImpl ts = new Tb_roomServiceImpl();
		System.out.println(ts.getAllTb_room().get(0).getRm_area());
	}
}
