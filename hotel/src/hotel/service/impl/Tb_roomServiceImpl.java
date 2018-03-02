package hotel.service.impl;

import java.util.ArrayList;
import java.util.List;

import hotel.dao.Tb_roomDao;
import hotel.dao.Tb_roomcatalogDao;
import hotel.dao.impl.Tb_roomDaoImpl;
import hotel.dao.impl.Tb_roomcatalogDaoImpl;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_room;
import hotel.entry.Tb_roomcatalog;
import hotel.service.Tb_roomService;

public class Tb_roomServiceImpl implements Tb_roomService {
	private Tb_roomDao tb_roomDao = new Tb_roomDaoImpl();
	private Tb_roomcatalogDao tb_roomcatalogDao = new Tb_roomcatalogDaoImpl();

	// 查询房间的所有信息(查)
	@Override
	public List<Tb_room> getAllTb_room() {
		List<Tb_room> listrm = tb_roomDao.getAllTb_room();
		List<Tb_room> list = new ArrayList<Tb_room>();
		for (Tb_room tb_room : listrm) {
			Tb_roomcatalog tb_roomcatalog = tb_roomcatalogDao.getByIdTb_roomcatalog(tb_room.getRm_catalog());
			tb_room.setTb_roomcatalog(tb_roomcatalog);
			list.add(tb_room);
		}
		return list;
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

	// 修改1：通过id获取客房信息
	@Override
	public Tb_room getByIdTb_room(int rm_id) {
		Tb_room Tb_room = tb_roomDao.getByIdTb_room(rm_id);
		return Tb_room;
	}

	public static void main(String[] args) {
		Tb_roomServiceImpl ts = new Tb_roomServiceImpl();
		System.out.println(ts.getAllTb_room().get(0).getRm_area());
	}
}
