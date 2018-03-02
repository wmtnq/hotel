package hotel.service.impl;

import java.util.ArrayList;
import java.util.List;

import hotel.dao.Tb_balancementDao;
import hotel.dao.Tb_checkinitemDao;
import hotel.dao.Tb_checkinorderDao;
import hotel.dao.Tb_guestDao;
import hotel.dao.Tb_pucardDao;
import hotel.dao.Tb_pucategoryDao;
import hotel.dao.Tb_pucountryDao;
import hotel.dao.Tb_putypeDao;
import hotel.dao.Tb_roomDao;
import hotel.dao.Tb_roomcatalogDao;
import hotel.dao.impl.Tb_balancementDaoImpl;
import hotel.dao.impl.Tb_checkinitemDaoImpl;
import hotel.dao.impl.Tb_checkinorderDaoImpl;
import hotel.dao.impl.Tb_guestDaoImpl;
import hotel.dao.impl.Tb_pucardDaoImpl;
import hotel.dao.impl.Tb_pucategoryDaoImpl;
import hotel.dao.impl.Tb_pucountryDaoImpl;
import hotel.dao.impl.Tb_putypeDaoImpl;
import hotel.dao.impl.Tb_roomDaoImpl;
import hotel.dao.impl.Tb_roomcatalogDaoImpl;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_guest;
import hotel.entry.Tb_pucard;
import hotel.entry.Tb_pucategory;
import hotel.entry.Tb_pucountry;
import hotel.entry.Tb_putype;
import hotel.entry.Tb_room;
import hotel.entry.Tb_roomcatalog;
import hotel.service.Tb_balancementService;
import hotel.util.PublicMethod;

public class Tb_balancementServiceImpl implements Tb_balancementService {
	private Tb_balancementDao tb_balancementDao = new Tb_balancementDaoImpl();
	private Tb_checkinorderDao tb_checkinorderDao = new Tb_checkinorderDaoImpl();
	private Tb_checkinitemDao tb_checkinitemDao = new Tb_checkinitemDaoImpl();
	private Tb_roomDao tb_roomDao = new Tb_roomDaoImpl();
	// 结账同时更新信息表(Tb_balancement)
	@Override
	public boolean updTb_balancement(Tb_balancement tb_balancement) {
		boolean falg = true;
		if (tb_balancement != null) {
			if (tb_balancementDao.addTb_balancement(tb_balancement) <= 0) {
				falg = false;
			}
			if (tb_checkinitemDao.updTb_checkinitem(tb_balancement) <= 0) {
				falg = false;
			}
			if (tb_checkinorderDao.updTb_checkinorder(tb_balancement) <= 0) {
				falg = false;
			}
			if (tb_roomDao.updTb_room(tb_balancement) <= 0) {
				falg = false;
			}
		}
		return falg;
	}

	// 获取需要发票的订单
	@Override
	public List<Tb_balancement> getAllReceipt() {
		List<Tb_balancement> listbm = tb_balancementDao.getAllReceipt();
		if (listbm.isEmpty()) {
			return listbm;
		}
		List<Tb_balancement> list = PublicMethod.getTb_balancementList(listbm);
		return list;
	}

	// 获取结账中退款金额不为0的条目
	@Override
	public List<Tb_balancement> getAllRefundState() {
		List<Tb_balancement> listrs = tb_balancementDao.getAllReceipt();
		if (listrs.isEmpty()) {
			return listrs;
		}
		List<Tb_balancement> list = PublicMethod.getTb_balancementList(listrs);
		return list;
	}
	public static void main(String[] args) {
		Tb_balancementServiceImpl tb = new Tb_balancementServiceImpl();
		System.out.println(tb.getAllReceipt().get(0).getTb_guest().getGt_name());
		System.out.println(tb.getAllRefundState().get(0).getTb_guest().getGt_name());
	}
}
