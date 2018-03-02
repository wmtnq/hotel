package hotel.service.impl;

import java.util.ArrayList;
import java.util.List;

import hotel.dao.Tb_guestDao;
import hotel.dao.Tb_pucardDao;
import hotel.dao.Tb_pucategoryDao;
import hotel.dao.Tb_pucountryDao;
import hotel.dao.Tb_putypeDao;
import hotel.dao.impl.Tb_guestDaoImpl;
import hotel.dao.impl.Tb_pucardDaoImpl;
import hotel.dao.impl.Tb_pucategoryDaoImpl;
import hotel.dao.impl.Tb_pucountryDaoImpl;
import hotel.dao.impl.Tb_putypeDaoImpl;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_guest;
import hotel.entry.Tb_pucard;
import hotel.entry.Tb_pucategory;
import hotel.entry.Tb_pucountry;
import hotel.entry.Tb_putype;
import hotel.service.Tb_guestService;

public class Tb_guestServiceImpl implements Tb_guestService {

	private Tb_guestDao tb_guestDao = new Tb_guestDaoImpl();
	private Tb_pucategoryDao tb_pucategoryDao = new Tb_pucategoryDaoImpl();
	private Tb_pucardDao tb_pucardDao = new Tb_pucardDaoImpl();
	private Tb_putypeDao tb_putypeDao = new Tb_putypeDaoImpl();
	private Tb_pucountryDao tb_pucountryDao = new Tb_pucountryDaoImpl();

	// 获取客户信息分组计算数量按照数量倒序排列消费的总和判断会员等级
	@Override
	public List<Tb_guest> getAllTb_guest() {
		// TODO Auto-generated method stub
		List<Tb_guest> listDao = tb_guestDao.getAllTb_guest();
		List<Tb_guest> list = new ArrayList<Tb_guest>();
		if (!listDao.isEmpty()) {
			for (Tb_guest tb_guest : listDao) {
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
					if(tb_pucard!=null) {
						tb_guest.setTb_pucard(tb_pucard);
					}
				}
				// 获取客户类型
				if(tb_guest.getGt_type()>0) {
					Tb_putype tb_putype = tb_putypeDao.getByIdTb_putype(tb_guest.getGt_type());
					if(tb_putype!=null) {
						tb_guest.setTb_putype(tb_putype);
					}
				}
				// 获取客户类别(会员)
				if(tb_guest.getGt_pucategory()>0) {
					Tb_pucategory tb_pucategory = tb_pucategoryDao.getByIdTb_pucategory(tb_guest.getGt_pucategory());
					if(tb_pucategory!=null) {
						tb_guest.setTb_pucategory(tb_pucategory);
					}
				}
				list.add(tb_guest);
			}
		}
		return list;
	}

	// 入住添加3：添加客户信息
	@Override
	public int addTb_guest(Tb_checkinitem tb_checkinitem) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		Tb_guestServiceImpl tb = new Tb_guestServiceImpl();
		System.out.println(tb.getAllTb_guest().get(0).getTb_pucategory().getPcg_categoryName());
	}
}
