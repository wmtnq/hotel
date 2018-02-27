package hotel.service.impl;

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
import hotel.service.Tb_balancementService;

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
	public List<Tb_balancement> getAllReceipt(int state) {
		return tb_balancementDao.getAllReceipt(state);
	}

	// 获取结账中退款金额不为0的条目
	@Override
	public List<Tb_balancement> getAllReceipt() {
		return tb_balancementDao.getAllReceipt();
	}

}
