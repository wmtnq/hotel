package hotel.dao;

import java.util.List;

import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_guest;

/**
 * 
 * @author dadawang 客户信息表
 */
public interface Tb_guestDao {

	// 获取客户信息分组计算数量按照数量倒序排列消费的总和判断会员等级
	List<Tb_guest> getAllTb_guest();

	//入住添加3：添加客户信息
	int addTb_guest(Tb_checkinitem tb_checkinitem);

}
