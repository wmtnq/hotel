package hotel.dao;

import java.util.List;

import hotel.entry.Tb_checkinorder;
import hotel.entry.Tb_guest;

public interface Tb_guestDao {

	//获取全部的订单
	public List<Tb_checkinorder> getAllTb_checkinorder();
	//根据日期筛选订单
	public List<Tb_checkinorder> getByGuestcardIdTb_checkinorder(String INDATETIME);

	//获取客户信息并在订单里面统计消费次数和金额(用两表查询)
	public List<Tb_guest> getAllTb_guestAndTb_checkinorder(String GUESTCARDID);

}
