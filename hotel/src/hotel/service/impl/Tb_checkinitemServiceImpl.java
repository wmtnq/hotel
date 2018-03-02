package hotel.service.impl;

import java.util.List;

import hotel.dao.Tb_checkinitemDao;
import hotel.dao.Tb_checkinorderDao;
import hotel.dao.Tb_guestDao;
import hotel.dao.impl.Tb_checkinitemDaoImpl;
import hotel.dao.impl.Tb_checkinorderDaoImpl;
import hotel.dao.impl.Tb_guestDaoImpl;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.service.Tb_checkinitemService;
import hotel.util.PublicMethod;

public class Tb_checkinitemServiceImpl implements Tb_checkinitemService {

	private Tb_checkinitemDao tb_checkinitemDao = new Tb_checkinitemDaoImpl();
	private Tb_guestDao tb_guestDao = new Tb_guestDaoImpl();
	private Tb_checkinorderDao tb_checkinorderDao = new Tb_checkinorderDaoImpl();

	// 查询所有入住登记信息表(Tb_checkinitem)和入住登记订单表(tb_checkinorder)和结账信息表(tb_balancement)
	@Override
	public List<Tb_checkinitem> getAllTb_checkinitemAndTb_checkinorderAndTb_balancement() {
		// 获取所有订单信息
		List<Tb_checkinitem> listck = tb_checkinitemDao.getAllTb_checkinitem();
		if (listck.isEmpty()) {
			return listck;
		}
		// 创建List保存修改后的对象
		List<Tb_checkinitem> list = PublicMethod.getTb_checkinitemList(listck);
		return list;
	}

	// 查询所有入住登记信息表(Tb_checkinitem)和入住登记订单表(tb_checkinorder)和结账信息表(tb_balancement)筛选状态(CIMSTATE);
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
		List<Tb_checkinitem> listck = tb_checkinitemDao.getAllTb_checkinitemAndTb_checkinorderAndTb_balancement(value);
		if (listck.isEmpty()) {
			return listck;
		}
		List<Tb_checkinitem> list = PublicMethod.getTb_checkinitemList(listck);
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
		if (tb_checkinitem.getTb_room() != null && tb_checkinitem.getTb_checkinorder() != null
				&& tb_checkinitem.getTb_balancement() != null) {
			// 插入入住登记表
			int tb_checkinitemid = tb_checkinitemDao.addTb_checkinitem(tb_checkinitem);
			if (tb_checkinitemid > 0) {
				tb_checkinitem.getTb_checkinorder().setCio_orderid(tb_checkinitemid);
			} else {
				flag = false;
			}
			// 插入客户实体
			int tb_guestid = tb_guestDao.addTb_guest(tb_checkinitem);
			if (tb_guestid > 0) {
				tb_checkinitem.getTb_checkinorder().setCio_guestID(tb_guestid);
			} else {
				flag = false;
			}
			// 插入订单表
			int tb_checkinorderid = tb_checkinorderDao.addTb_checkinorder(tb_checkinitem);
			if (tb_checkinorderid <= 0) {
				flag = false;
			}
			// 更新登记表订单号
			if (tb_checkinitemDao.updTb_checkinorder(tb_checkinorderid, tb_checkinitemid) <= 0) {
				flag = false;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		Tb_checkinitemServiceImpl tb = new Tb_checkinitemServiceImpl();
		System.out.println(tb.getAllTb_checkinitemAndTb_checkinorderAndTb_balancement().get(0).getCim_outdateTime());
	}

}
