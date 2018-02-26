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
	public List<Tb_checkinitem> getAllTb_checkinitemAndTb_checkinorderAndTb_balancement(String value) {
		// 获取所有订单信息
		List<Tb_checkinitem> listck = tb_checkinitemDao.getAllTb_checkinitem();
		// 创建List保存修改后的对象
		List<Tb_checkinitem> list = PublicMethod.getTb_checkinitemList(listck);
		return list;
	}

	// 查询所有入住登记信息表(Tb_checkinitem)和入住登记订单表(tb_checkinorder)和结账信息表(tb_balancement)筛选状态(CIMSTATE);
	@Override
	public List<Tb_checkinitem> getStatusTb_checkinitemAndTb_checkinorderAndTb_balancement(int state) {
		//获取指定状态的信息表
		List<Tb_checkinitem> listck = tb_checkinitemDao.getStatusTb_checkinitemAndTb_checkinorderAndTb_balancement(state);
		//保存填充过后的信息表
		List<Tb_checkinitem> list = PublicMethod.getTb_checkinitemList(listck);
		return list;
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
		// 通过获取Tb_checkinitem集合
		List<Tb_checkinitem> listck = tb_checkinitemDao.getByIdTb_checkinitemAndTb_checkinorderAndTb_balancement(rmid);
		// 创建List集合用来保存修改后的集合
		List<Tb_checkinitem> list = PublicMethod.getTb_checkinitemList(listck);
		return list;
	}

	// 结账同时更新入住登记信息表(Tb_checkinitem)离开时间(CIMOUTDATETIME)、登记状态(CIMSTATE)
	@Override
	public int updTb_checkinitem(Tb_balancement tb_balancement) {
		// TODO Auto-generated method stub
		return 0;
	}

	// 添加入住信息登记表
	@Override
	public int addTb_checkinitem(Tb_checkinitem tb_checkinitem) {
		// 插入入住登记表
		int tb_checkinitemid = tb_checkinitemDao.addTb_checkinitem(tb_checkinitem);
		tb_checkinitem.getTb_checkinorder().setCio_orderid(tb_checkinitemid);
		// 插入客户实体
		int tb_guestid = tb_guestDao.addTb_guest(tb_checkinitem);
		tb_checkinitem.getTb_checkinorder().setCio_guestID(tb_guestid);
		// 插入订单表
		int tb_checkinorderid = tb_checkinorderDao.addTb_checkinorder(tb_checkinitem);
		// 更新登记表订单号
		int count = tb_checkinitemDao.updTb_checkinorder(tb_checkinorderid, tb_checkinitemid);
		return count;
	}

	public static void main(String[] args) {
		Tb_checkinitemServiceImpl tb = new Tb_checkinitemServiceImpl();
		System.out.println(tb.getByIdTb_checkinitemAndTb_checkinorderAndTb_balancement(1));
	}

}
