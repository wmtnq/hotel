package hotel.service.impl;

import java.util.List;

import hotel.dao.Tb_balancementDao;
import hotel.dao.Tb_checkinitemDao;
import hotel.dao.Tb_checkinorderDao;
import hotel.dao.Tb_guestDao;
import hotel.dao.Tb_pucardDao;
import hotel.dao.Tb_pucategoryDao;
import hotel.dao.Tb_pucountryDao;
import hotel.dao.Tb_pupaymenttypeDao;
import hotel.dao.Tb_putypeDao;
import hotel.dao.Tb_roomDao;
import hotel.dao.impl.Tb_balancementDaoImpl;
import hotel.dao.impl.Tb_checkinitemDaoImpl;
import hotel.dao.impl.Tb_checkinorderDaoImpl;
import hotel.dao.impl.Tb_guestDaoImpl;
import hotel.dao.impl.Tb_pucardDaoImpl;
import hotel.dao.impl.Tb_pucategoryDaoImpl;
import hotel.dao.impl.Tb_pucountryDaoImpl;
import hotel.dao.impl.Tb_pupaymenttypeDaoImpl;
import hotel.dao.impl.Tb_putypeDaoImpl;
import hotel.dao.impl.Tb_roomDaoImpl;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_checkinorder;
import hotel.entry.Tb_guest;
import hotel.entry.Tb_pucard;
import hotel.entry.Tb_pucategory;
import hotel.entry.Tb_pucountry;
import hotel.entry.Tb_pupaymenttype;
import hotel.entry.Tb_putype;
import hotel.entry.Tb_room;
import hotel.service.Tb_checkinitemService;
import hotel.service.Tb_roomService;
import hotel.util.PublicMethod;

public class Tb_checkinitemServiceImpl implements Tb_checkinitemService {

	private Tb_checkinitemDao tb_checkinitemDao = new Tb_checkinitemDaoImpl();
	private Tb_guestDao tb_guestDao = new Tb_guestDaoImpl();
	private Tb_checkinorderDao tb_checkinorderDao = new Tb_checkinorderDaoImpl();
	private Tb_roomService Tb_roomService = new Tb_roomServiceImpl();

	// 查询所有入住登记信息表(Tb_checkinitem)和入住登记订单表(tb_checkinorder)和结账信息表(tb_balancement)
	@Override
	public List<Tb_checkinitem> getAllTb_checkinitemAndTb_checkinorderAndTb_balancement() {
		// 获取所有订单信息
		List<Tb_checkinitem> listck = tb_checkinitemDao.getAllTb_checkinitem();
		if (listck.isEmpty()) {
			return listck;
		}
		List<Tb_checkinitem> list = PublicMethod.getTb_checkinitemList(listck);
		return list;
	}
	// 创建List保存修改后的对象

	// 查看状态的订单;
	@Override
	public List<Tb_checkinitem> getStatusTb_checkinitemAndTb_checkinorderAndTb_balancement(int state) {
		// 获取指定状态的信息表
		List<Tb_checkinitem> listck = tb_checkinitemDao
				.getStatusTb_checkinitemAndTb_checkinorderAndTb_balancement(state);
		if (listck.isEmpty()) {
			return listck;
		}
		// 保存填充过后的信息表
		List<Tb_checkinitem> list = PublicMethod.getTb_checkinitemList(listck);
		return list;
	}

	// 模糊查询筛选订单、登记表、账单多表联查中匹配的条目并输出
	@Override
	public List<Tb_checkinitem> getAllTb_checkinitemAndTb_checkinorderAndTb_balancement(String value) {
		List<Tb_checkinitem> listck = null;
		List<Tb_checkinitem> list = null;
		if (value != "" && value != null) {
			listck = tb_checkinitemDao.getAllTb_checkinitemAndTb_checkinorderAndTb_balancement(value);
			if (listck.isEmpty()) {
				return listck;
			}
			list = PublicMethod.getTb_checkinitemList(listck);
		} else {
			listck = tb_checkinitemDao.getAllTb_checkinitem();
			if (listck.isEmpty()) {
				return listck;
			}
			list = PublicMethod.getTb_checkinitemList(listck);
		}
		return list;
	}

	// 通过房间ID查询这个房间的订单信息
	@Override
	public List<Tb_checkinitem> getByIdTb_checkinitemAndTb_checkinorderAndTb_balancement(int rmid) {
		// 通过获取Tb_checkinitem集合
		List<Tb_checkinitem> listck = tb_checkinitemDao.getByIdTb_checkinitemAndTb_checkinorderAndTb_balancement(rmid);
		if (listck.isEmpty()) {
			return listck;
		}
		// 创建List集合用来保存修改后的集合
		List<Tb_checkinitem> list = PublicMethod.getTb_checkinitemList(listck);
		return list;
	}

	// 结账同时更新入住登记信息表(Tb_checkinitem)离开时间(CIMOUTDATETIME)、登记状态(CIMSTATE)
	@Override
	public int updTb_checkinitem(Tb_balancement tb_balancement) {
		return 0;
	}

	// 添加入住信息登记表
	@Override
	public boolean addTb_checkinitem(Tb_checkinitem tb_checkinitem) {
		boolean flag = true;
		// 插入客户实体
		if (tb_checkinitem.getTb_guest() != null&&tb_checkinitem!=null) {
			System.out.println("入住service"+tb_checkinitem.getTb_checkinorder().getTb_guest().getGt_pucategory());
		Tb_guest tb_guest =  tb_guestDao.getByCardidTb_guest(tb_checkinitem.getTb_guest().getGt_cardId());
		if ( tb_guest== null) {
			long tb_guestid = tb_guestDao.addTb_guest(tb_checkinitem);
			if (tb_guestid > 0) {
				tb_checkinitem.getTb_checkinorder().getTb_guest().setGt_id(Integer.parseInt(String.valueOf(tb_guestid)));
			} else {
				flag = false;
			}
		}else {
			tb_guestDao.updTb_guest(tb_checkinitem);
			tb_checkinitem.getTb_checkinorder().getTb_guest().setGt_id(tb_guest.getGt_id());
		}
			// 插入入住登记表
			long tb_checkinitemid = tb_checkinitemDao.addTb_checkinitem(tb_checkinitem);
			System.out.println("登记号"+tb_checkinitemid);
			if (tb_checkinitemid > 0) {
				tb_checkinitem.getTb_checkinorder().setCio_orderid(Integer.parseInt(String.valueOf(tb_checkinitemid)));
			} else {
				flag = false;
			}
			// 插入订单表
			System.out.println("入住添加订单service"+tb_checkinitem.getTb_checkinorder().getTb_guest().getGt_pucategory());
			long tb_checkinorderid = tb_checkinorderDao.addTb_checkinorder(tb_checkinitem);
			System.out.println("订单号"+tb_checkinorderid);
			if (tb_checkinorderid <= 0) {
				flag = false;
			}
			// 更新登记表订单号
			if (tb_checkinitemDao.updTb_checkinorder(Integer.parseInt(String.valueOf(tb_checkinorderid)),Integer.parseInt(String.valueOf(tb_checkinitemid)))<= 0) {
				flag = false;
			}
			Tb_roomService.updTb_room(tb_checkinitem);
			
		}
		return flag;
	}

	public static void main(String[] args) {
		Tb_checkinitemServiceImpl tb = new Tb_checkinitemServiceImpl();
		System.out.println(
				tb.getAllTb_checkinitemAndTb_checkinorderAndTb_balancement().get(0).getTb_guest().getGt_address());
	}

}
