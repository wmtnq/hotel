package hotel.dao;

import java.util.List;

import hotel.entry.Tb_checkinorder;

public interface Tb_checkinorderDao {

	//获取全部的订单
	public List<Tb_checkinorder> getAllTb_checkinorder();
	//根据身份证号筛选订单
	public List<Tb_checkinorder> getByGuestcardIdTb_checkinorder(String GUESTCARDID);

}
