package hotel.util;

import java.util.ArrayList;
import java.util.List;

import hotel.dao.Tb_balancementDao;
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
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_checkinorder;
import hotel.entry.Tb_guest;
import hotel.entry.Tb_pucard;
import hotel.entry.Tb_pucategory;
import hotel.entry.Tb_pucountry;
import hotel.entry.Tb_pupaymenttype;
import hotel.entry.Tb_putype;
import hotel.entry.Tb_room;
import hotel.entry.Tb_roomcatalog;

public class PublicMethod {

	// 截取时间
	public static String getDateTime(String date) {
		String datex = date.substring(0, (date.indexOf('.')));
		return datex;
	}

	// 填充登记订单实体类
	public static List<Tb_checkinitem> getTb_checkinitemList(List<Tb_checkinitem> listck) {
		Tb_checkinorderDao tb_checkinorderDao = new Tb_checkinorderDaoImpl();
		Tb_balancementDao tb_balancementDao = new Tb_balancementDaoImpl();
		Tb_roomDao tb_roomDao = new Tb_roomDaoImpl();
		Tb_guestDao tb_guestDao = new Tb_guestDaoImpl();
		Tb_pupaymenttypeDao tb_pupaymenttypeDao = new Tb_pupaymenttypeDaoImpl();
		Tb_pucardDao tb_pucardDao = new Tb_pucardDaoImpl();
		Tb_pucategoryDao tb_pucategoryDao = new Tb_pucategoryDaoImpl();
		Tb_putypeDao tb_putypeDao = new Tb_putypeDaoImpl();
		List<Tb_checkinitem> list = new ArrayList<Tb_checkinitem>();
		if (!listck.isEmpty()) {
			for (Tb_checkinitem tb_checkinitem : listck) {
				// 获取房间信息
				Tb_room tb_room = null;
				if (tb_checkinitem.getCim_roomId() > 0) {
					tb_room = tb_roomDao.getByIdTb_room(tb_checkinitem.getCim_roomId());
					if (tb_room != null) {
						tb_checkinitem.setTb_room(tb_room);
					}
				}
				// 获取订单信息并存进Tb_checkinitem对象
				Tb_checkinorder tb_checkinorder = null;
				Tb_guest tb_guest = null;
				Tb_pupaymenttype tb_pupaymenttype = null;
				Tb_pucard tb_pucard = null;
				Tb_pucategory tb_pucategory = null;
				if (tb_checkinitem.getCim_chechinorderId() > 0) {
					tb_checkinorder = tb_checkinorderDao.getTb_checkinorderRow(tb_checkinitem.getCim_chechinorderId());
					// 获取订单信息客户实体
					if (tb_checkinorder != null) {
						if (tb_checkinorder.getCio_guestID() > 0) {
							tb_guest = tb_guestDao.getByIdTb_guest(tb_checkinorder.getCio_guestID());
							tb_checkinorder.setTb_guest(tb_guest);
						}
						// 获取订单支付方式
						if (tb_checkinorder.getCio_paymentmodel() > 1) {
							tb_pupaymenttype = tb_pupaymenttypeDao
									.getByIdTb_pupaymenttype(tb_checkinorder.getCio_paymentmodel());
						} else {
							tb_pupaymenttype = tb_pupaymenttypeDao.getByIdTb_pupaymenttype(1);
						}
						tb_checkinorder.setTb_pupaymenttype(tb_pupaymenttype);
						// 获取证件类型
						if (tb_checkinorder.getCio_guestCardCatalog() > 0) {
							tb_pucard = tb_pucardDao.getByIdTb_pucard(tb_checkinorder.getCio_guestCardCatalog());
							tb_checkinorder.setTb_pucard(tb_pucard);
						}
						// 获取客户类型
						if (tb_checkinorder.getCio_guestCatalog() > 0) {
							tb_pucategory = tb_pucategoryDao
									.getByIdTb_pucategory(tb_checkinorder.getCio_guestCatalog());
							tb_checkinorder.setTb_pucategory(tb_pucategory);
						}
						// 获取客户类别
						if (tb_checkinorder.getCio_guestType() > 0) {
							Tb_putype tb_putype = tb_putypeDao.getByIdTb_putype(tb_checkinorder.getCio_guestType());
							tb_checkinorder.setTb_putype(tb_putype);
						}
						// 截取入住时间
						if (tb_checkinorder.getCio_inDateTime() != null && tb_checkinorder.getCio_inDateTime() != "") {
							tb_checkinorder
									.setCio_inDateTime(PublicMethod.getDateTime(tb_checkinorder.getCio_inDateTime()));
						}
						// 截取预计离开时间
						if (tb_checkinorder.getCio_outDateTime() != null
								&& tb_checkinorder.getCio_outDateTime() != "") {
							tb_checkinorder
									.setCio_outDateTime(PublicMethod.getDateTime(tb_checkinorder.getCio_outDateTime()));
						}
						// 截取实际离开时间
						if (tb_checkinorder.getCio_prctOutDateTime() != null
								&& tb_checkinorder.getCio_prctOutDateTime() != "") {
							tb_checkinorder.setCio_prctOutDateTime(
									PublicMethod.getDateTime(tb_checkinorder.getCio_prctOutDateTime()));
						}
						tb_checkinitem.setTb_checkinorder(tb_checkinorder);
					}
				}
				// 获取账单信息
				if (tb_checkinorder.getCio_id() > 0) {
					Tb_balancement tb_balancement = tb_balancementDao.getTb_balancementRow(tb_checkinorder.getCio_id());
					if (tb_balancement != null) {
						// 存储客户实体
						if (tb_guest != null) {
							tb_balancement.setTb_guest(tb_guest);
						}
						// 存储客房信息
						if (tb_room != null) {
							tb_balancement.setTb_room(tb_room);
						}
						if (tb_balancement.getBm_createTime() != null && tb_balancement.getBm_createTime() != "") {
							tb_balancement
									.setBm_createTime(PublicMethod.getDateTime(tb_balancement.getBm_createTime()));
						}
						tb_checkinitem.setTb_balancement(tb_balancement);
					}
				}
				// 截取正确的入住时间(去掉.0)
				if (tb_checkinitem.getCim_inDateTime() != null && tb_checkinitem.getCim_inDateTime() != "") {
					tb_checkinitem.setCim_inDateTime(PublicMethod.getDateTime(tb_checkinitem.getCim_inDateTime()));
				}
				// 截取正确的离开时间(去掉.0)
				if (tb_checkinitem.getCim_outdateTime() != null && tb_checkinitem.getCim_outdateTime() != "") {
					tb_checkinitem.setCim_outdateTime(PublicMethod.getDateTime(tb_checkinitem.getCim_outdateTime()));
				}
				list.add(tb_checkinitem);
			}
		}
		return list;

	}

	public static boolean getSuccess(int count) {
		boolean flag = true;
		if (count <= 0) {
			flag = false;
		}
		return flag;
	}

	public static List<Tb_balancement> getTb_balancementList(List<Tb_balancement> listbm) {
		Tb_roomDao tb_roomDao = new Tb_roomDaoImpl();
		Tb_roomcatalogDao Tb_roomcatalogDao = new Tb_roomcatalogDaoImpl();
		Tb_guestDao tb_guestDao = new Tb_guestDaoImpl();
		Tb_pucategoryDao tb_pucategoryDao = new Tb_pucategoryDaoImpl();
		Tb_pucardDao tb_pucardDao = new Tb_pucardDaoImpl();
		Tb_putypeDao tb_putypeDao = new Tb_putypeDaoImpl();
		Tb_pucountryDao tb_pucountryDao = new Tb_pucountryDaoImpl();
		Tb_pupaymenttypeDao Tb_pupaymenttypeDao = new Tb_pupaymenttypeDaoImpl();
		List<Tb_balancement> list = new ArrayList<Tb_balancement>();
		if (!listbm.isEmpty()) {
			for (Tb_balancement tb_balancement : listbm) {
				if (tb_balancement.getBm_roomId() > 0) {
					// 获取房间信息
					Tb_room tb_room = tb_roomDao.getByIdTb_room(tb_balancement.getBm_roomId());
					if (tb_room.getRm_catalog() > 0) {
						// 获取房间类型
						Tb_roomcatalog tb_roomcatalog = Tb_roomcatalogDao
								.getByIdTb_roomcatalog(tb_room.getRm_catalog());
						tb_room.setTb_roomcatalog(tb_roomcatalog);
						tb_balancement.setTb_room(tb_room);
					}
				}
				if (tb_balancement.getBm_paymentmodel() > 0) {
					//获取支付类型
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
					if (tb_guest.getGt_pucategory() > 0) {
						Tb_pucategory tb_pucategory = tb_pucategoryDao
								.getByIdTb_pucategory(tb_guest.getGt_pucategory());
						if (tb_pucategory != null) {
							tb_guest.setTb_pucategory(tb_pucategory);
						}
					}
					tb_balancement.setTb_guest(tb_guest);
				}
				list.add(tb_balancement);
			}
		}
		return list;
	}
}
