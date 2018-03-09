package hotel.service.impl;

import hotel.dao.Tb_balancementDao;
import hotel.dao.Tb_checkinorderDao;
import hotel.dao.Tb_guestDao;
import hotel.dao.Tb_pucardDao;
import hotel.dao.Tb_pucategoryDao;
import hotel.dao.Tb_pucountryDao;
import hotel.dao.Tb_pupaymenttypeDao;
import hotel.dao.Tb_putypeDao;
import hotel.dao.Tb_roomDao;
import hotel.dao.impl.Tb_balancementDaoImpl;
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
import hotel.service.Tb_checkinorderService;
import hotel.util.PublicMethod;

public class Tb_checkinorderServiceImpl implements Tb_checkinorderService {

	private Tb_checkinorderDao Tb_checkinorderDao = new Tb_checkinorderDaoImpl();

	@Override
	public int updTb_checkinorder(Tb_balancement tb_balancement) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int addTb_checkinorder(Tb_checkinitem tb_checkinitem) {
		// TODO Auto-generated method stub
		return 0;
	}

	// 通过订单编号查找订单
	@Override
	public Tb_checkinorder getByCdidTb_checkinorder(int cdid) {
		Tb_checkinorder tb_checkinorder = Tb_checkinorderDao.getTb_checkinorderRow(cdid);
		Tb_checkinorderDao tb_checkinorderDao = new Tb_checkinorderDaoImpl();
		Tb_balancementDao tb_balancementDao = new Tb_balancementDaoImpl();
		Tb_roomDao tb_roomDao = new Tb_roomDaoImpl();
		Tb_guestDao tb_guestDao = new Tb_guestDaoImpl();
		Tb_pupaymenttypeDao tb_pupaymenttypeDao = new Tb_pupaymenttypeDaoImpl();
		Tb_pucardDao tb_pucardDao = new Tb_pucardDaoImpl();
		Tb_pucategoryDao tb_pucategoryDao = new Tb_pucategoryDaoImpl();
		Tb_putypeDao tb_putypeDao = new Tb_putypeDaoImpl();
		Tb_pucountryDao tb_pucountryDao = new Tb_pucountryDaoImpl();
		Tb_guest tb_guest = null;
		Tb_pupaymenttype tb_pupaymenttype = null;
		Tb_pucard tb_pucard = null;
		Tb_pucategory tb_pucategory = null;
		Tb_room tb_room = null;
		Tb_putype tb_putype = null;
		if (tb_checkinorder != null) {

			if (tb_checkinorder != null) {
				if (tb_checkinorder.getCio_guestID() > 0) {
					tb_guest = tb_guestDao.getByIdTb_guest(tb_checkinorder.getCio_guestID());
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
						tb_pucard = tb_pucardDao.getByIdTb_pucard(tb_guest.getGt_cardcatalog());
						if (tb_pucard != null) {
							tb_guest.setTb_pucard(tb_pucard);
							tb_checkinorder.setTb_pucard(tb_pucard);
						}
					}
					// 获取客户类型
					if (tb_guest.getGt_type() > 0) {
						tb_putype = tb_putypeDao.getByIdTb_putype(tb_guest.getGt_type());
						if (tb_putype != null) {
							tb_guest.setTb_putype(tb_putype);
							tb_checkinorder.setTb_putype(tb_putype);
						}
					}
					// 获取客户类别(会员)
					if (tb_guest.getGt_expenditure() != "") {
						tb_pucategory = tb_pucategoryDao.getByIdTb_pucategory(tb_guest.getGt_cardcatalog());
						if (tb_pucategory != null) {
							tb_guest.setTb_pucategory(tb_pucategory);
							tb_checkinorder.setTb_pucategory(tb_pucategory);
							tb_guestDao.updGt_expenditure(tb_guest.getGt_id(), tb_pucategory.getPcg_cio());
						}
					}
				}
				tb_checkinorder.setTb_guest(tb_guest);
			}
			// 获取订单支付方式
			if (tb_checkinorder.getCio_paymentmodel() > 1) {
				tb_pupaymenttype = tb_pupaymenttypeDao.getByIdTb_pupaymenttype(tb_checkinorder.getCio_paymentmodel());
			} else {
				tb_pupaymenttype = tb_pupaymenttypeDao.getByIdTb_pupaymenttype(1);
			}
			tb_checkinorder.setTb_pupaymenttype(tb_pupaymenttype);

			// 截取入住时间
			if (tb_checkinorder.getCio_inDateTime() != null && tb_checkinorder.getCio_inDateTime() != "") {
				tb_checkinorder.setCio_inDateTime(PublicMethod.getDateTime(tb_checkinorder.getCio_inDateTime()));
			}
			// 截取预计离开时间
			if (tb_checkinorder.getCio_outDateTime() != null && tb_checkinorder.getCio_outDateTime() != "") {
				tb_checkinorder.setCio_outDateTime(PublicMethod.getDateTime(tb_checkinorder.getCio_outDateTime()));
			}
			// 截取实际离开时间
			if (tb_checkinorder.getCio_prctOutDateTime() != null && tb_checkinorder.getCio_prctOutDateTime() != "") {
				tb_checkinorder
						.setCio_prctOutDateTime(PublicMethod.getDateTime(tb_checkinorder.getCio_prctOutDateTime()));
			}
		}
		return tb_checkinorder;
	}

}
