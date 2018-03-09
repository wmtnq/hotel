package hotel.dao;

import java.util.List;

import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;

/**
 * 
 * @author dadawang 入住登记信息表
 */
public interface Tb_checkinitemDao {

	// 查询所有入住登记信息表(Tb_checkinitem)
	List<Tb_checkinitem> getAllTb_checkinitem();
	
	
	// 查询所有入住登记信息表(Tb_checkinitem)和入住登记订单表(tb_checkinorder)和结账信息表(tb_balancement)筛选状态(CIMSTATE);
	List<Tb_checkinitem> getStatusTb_checkinitemAndTb_checkinorderAndTb_balancement(int state);

	// 模糊查询筛选订单、登记表、账单多表联查中匹配的条目并输出
	List<Tb_checkinitem> getAllTb_checkinitemAndTb_checkinorderAndTb_balancement(String value);

	// 通过房间ID查询这个房间的订单信息
	List<Tb_checkinitem> getByIdTb_checkinitemAndTb_checkinorderAndTb_balancement(int rmid);

	// 结账同时更新入住登记信息表(Tb_checkinitem)离开时间(CIMOUTDATETIME)、登记状态(CIMSTATE)
	int updTb_checkinitem(Tb_balancement tb_balancement);

	//入住添加1：添加入住信息登记表
	long addTb_checkinitem(Tb_checkinitem tb_checkinitem);
	
	// 入住添加2：更新登记表订单号
	int updTb_checkinorder(int cio_id, int cim_id);

}
