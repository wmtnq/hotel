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
import hotel.dao.Tb_pupaymenttypeDao;
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
import hotel.dao.impl.Tb_pupaymenttypeDaoImpl;
import hotel.dao.impl.Tb_putypeDaoImpl;
import hotel.dao.impl.Tb_roomDaoImpl;
import hotel.dao.impl.Tb_roomcatalogDaoImpl;
import hotel.entry.Tb_balancement;
import hotel.entry.Tb_guest;
import hotel.entry.Tb_pucard;
import hotel.entry.Tb_pucategory;
import hotel.entry.Tb_pucountry;
import hotel.entry.Tb_pupaymenttype;
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
		List<Tb_balancement> listrs = tb_balancementDao.getAllRefundState();
		if (listrs.isEmpty()) {
			return listrs;
		}
		List<Tb_balancement> list = PublicMethod.getTb_balancementList(listrs);
		return list;
	}

	// 更改发票信息
	@Override
	public int updrpTb_balancement(Tb_balancement tb_balancement) {
		int count = tb_balancementDao.updrpTb_balancement(tb_balancement);
		return count;
	}

	// 更改退款信息
	@Override
	public int updrsTb_balancement(Tb_balancement tb_balancement) {
		int count = tb_balancementDao.updrsTb_balancement(tb_balancement);
		return count;
	}

	public static void main(String[] args) {
		Tb_balancementServiceImpl tb_balancementServiceImpl = new Tb_balancementServiceImpl();
		System.out.println(tb_balancementServiceImpl.getAllReceipt().get(0).getBm_address());
	}

	// 通过订单编号获取订单
	@Override
	public Tb_balancement getByCdidTb_balancement(int cdid) {
		Tb_balancement tb_balancement = tb_balancementDao.getTb_balancementRow(cdid);
		Tb_roomDao tb_roomDao = new Tb_roomDaoImpl();
		Tb_roomcatalogDao Tb_roomcatalogDao = new Tb_roomcatalogDaoImpl();
		Tb_guestDao tb_guestDao = new Tb_guestDaoImpl();
		Tb_pucategoryDao tb_pucategoryDao = new Tb_pucategoryDaoImpl();
		Tb_pucardDao tb_pucardDao = new Tb_pucardDaoImpl();
		Tb_putypeDao tb_putypeDao = new Tb_putypeDaoImpl();
		Tb_pucountryDao tb_pucountryDao = new Tb_pucountryDaoImpl();
		Tb_pupaymenttypeDao Tb_pupaymenttypeDao = new Tb_pupaymenttypeDaoImpl();
		List<Tb_balancement> list = new ArrayList<Tb_balancement>();
		if (tb_balancement != null) {
			if (tb_balancement.getBm_roomId() > 0) {
				// 获取房间信息
				Tb_room tb_room = tb_roomDao.getByIdTb_room(tb_balancement.getBm_roomId());
				if (tb_room.getRm_catalog() > 0) {
					// 获取房间类型
					Tb_roomcatalog tb_roomcatalog = Tb_roomcatalogDao.getByIdTb_roomcatalog(tb_room.getRm_catalog());
					tb_room.setTb_roomcatalog(tb_roomcatalog);
					tb_balancement.setTb_room(tb_room);
				}
			}
			if (tb_balancement.getBm_paymentmodel() > 0) {
				// 获取支付类型
				Tb_pupaymenttype tb_pupaymenttype = Tb_pupaymenttypeDao
						.getByIdTb_pupaymenttype(tb_balancement.getBm_paymentmodel());
				tb_balancement.setTb_pupaymenttype(tb_pupaymenttype);
			}
			if (tb_balancement.getBm_guestId() > 0) {
				// 获取用户实体
				Tb_guest tb_guest = tb_guestDao.getByIdTb_guest(tb_balancement.getBm_guestId());
				// 获取性别
				if (tb_guest.getGt_gender() != null && tb_guest.getGt_gender() != "") {
					if (Integer.parseInt(tb_guest.getGt_gender()) == 0) {
						tb_guest.setGt_gender("女");
					} else {
						tb_guest.setGt_gender("男");
					}
				}
				// 获取国籍
				if (tb_guest.getGt_pucategory() > 0) {
					Tb_pucountry tb_pucountry = tb_pucountryDao.getByIdTb_pucountry(tb_guest.getGt_country());
					// 保存国籍
					if (tb_pucountry != null) {
						tb_guest.setTb_pucountry(tb_pucountry);
					}
				}
				// 获取证件类型
				if (tb_guest.getGt_cardcatalog() > 0) {
					Tb_pucard tb_pucard = tb_pucardDao.getByIdTb_pucard(tb_guest.getGt_cardcatalog());
					if (tb_pucard != null) {
						tb_guest.setTb_pucard(tb_pucard);
					}
				}
				// 获取客户类型
				if (tb_guest.getGt_type() > 0) {
					Tb_putype tb_putype = tb_putypeDao.getByIdTb_putype(tb_guest.getGt_type());
					if (tb_putype != null) {
						tb_guest.setTb_putype(tb_putype);
					}
				}
				// 获取客户类别(会员)
				if (tb_guest.getGt_cardcatalog() > 0) {
					Tb_pucategory tb_pucategory = tb_pucategoryDao.getByIdTb_pucategory(tb_guest.getGt_cardcatalog());
					if (tb_pucategory != null) {
						tb_guest.setTb_pucategory(tb_pucategory);
						tb_guestDao.updGt_expenditure(tb_guest.getGt_id(), tb_pucategory.getPcg_cio());
					}
				}
				tb_balancement.setTb_guest(tb_guest);
				// 截取日期
				tb_balancement.setBm_createTime(PublicMethod.getDateTime(tb_balancement.getBm_createTime()));

			}
		}
		return tb_balancement;
	}
}
