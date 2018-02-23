package hotel.service.impl;

import java.util.ArrayList;
import java.util.List;

import hotel.dao.Tb_balancementDao;
import hotel.dao.Tb_checkinitemDao;
import hotel.dao.Tb_checkinorderDao;
import hotel.dao.Tb_roomDao;
import hotel.dao.impl.Tb_balancementDaoImpl;
import hotel.dao.impl.Tb_checkinitemDaoImpl;
import hotel.dao.impl.Tb_checkinorderDaoImpl;
import hotel.dao.impl.Tb_roomDaoImpl;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_checkinorder;
import hotel.entry.Tb_room;

public class Tb_checkinitemServiceImpl implements Tb_checkinitemDao {

	private Tb_checkinitemDao tb_checkinitemDao = new Tb_checkinitemDaoImpl();
	private Tb_checkinorderDao tb_checkinorderDao = new Tb_checkinorderDaoImpl();
	private Tb_balancementDao tb_balancementDao = new Tb_balancementDaoImpl();
	private Tb_roomDao tb_roomDao = new Tb_roomDaoImpl();
	// 查询所有入住登记信息表(Tb_checkinitem)和入住登记订单表(tb_checkinorder)和结账信息表(tb_balancement)
	@Override
	public List<Tb_checkinitem> getAllTb_checkinitem() {
		// TODO Auto-generated method stub
		//获取所有订单信息
		List<Tb_checkinitem> listck = tb_checkinitemDao.getAllTb_checkinitem();
		//创建List保存修改后的对象
		List<Tb_checkinitem> list = new ArrayList<Tb_checkinitem>();
		//遍历从Dao层获取的List
		for (Tb_checkinitem tb_checkinitem : listck) {
			//获取订单信息并存进Tb_checkinitem对象
			Tb_checkinorder tb_checkinorder =tb_checkinorderDao.getTb_checkinorderRow(tb_checkinitem.getCim_chechinorderId());
			tb_checkinitem.setTb_checkinorder(tb_checkinorder);
			//获取账单信息
			Tb_balancement tb_balancement = tb_balancementDao.getTb_balancementRow(tb_checkinorder.getCio_id());
			tb_checkinitem.setTb_balancement(tb_balancementDao.getTb_balancementRow(tb_checkinorder.getCio_id()));
			//获取房间信息
			Tb_room tb_room = tb_roomDao.getByIdTb_room(tb_checkinitem.getCim_roomId());
			tb_checkinitem.setTb_room(tb_room);
			
		}
		return null;
	}

	// 查询所有入住登记信息表(Tb_checkinitem)和入住登记订单表(tb_checkinorder)和结账信息表(tb_balancement)筛选状态(CIMSTATE);
	@Override
	public List<Tb_checkinitem> getStatusTb_checkinitemAndTb_checkinorderAndTb_balancement(int state) {
		// TODO Auto-generated method stub
		return null;
	}

	// 模糊查询筛选订单、登记表、账单多表联查中匹配的条目并输出
	@Override
	public List<Tb_checkinitem> getAllTb_checkinitemAndTb_checkinorderAndTb_balancement() {
		// TODO Auto-generated method stub
		return null;
	}

	// 通过房间ID查询这个房间的订单信息
	@Override
	public List<Tb_checkinitem> getByIdTb_checkinitemAndTb_checkinorderAndTb_balancement(int rmid) {
		// TODO Auto-generated method stub
		return null;
	}

	// 获取不是空闲状态的房间
	@Override
	public List<Tb_checkinitem> getNotidleTb_checkinitemAndTb_checkinorderAndTb_balancement(int state) {
		// TODO Auto-generated method stub
		return null;
	}

	// 结账同时更新入住登记信息表(Tb_checkinitem)离开时间(CIMOUTDATETIME)、登记状态(CIMSTATE)
	@Override
	public int updTb_checkinitem(Tb_balancement tb_balancement) {
		// TODO Auto-generated method stub
		return 0;
	}

	// 入住添加1：添加入住信息登记表
	@Override
	public int addTb_checkinitem(Tb_checkinitem tb_checkinitem) {
		// TODO Auto-generated method stub
		return 0;
	}

}
