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
	long addTb_guest(Tb_checkinitem tb_checkinitem);

	//通过ID获取客户信息
	Tb_guest getByIdTb_guest(int id);
	
	//更新客户类别
	int updGt_expenditure(int gs_id,int gr_id );
	
	//通过身份证号获取客户实体
	Tb_guest  getByCardidTb_guest(String cardid);
	
	//入住更改信息
	int updTb_guest(Tb_checkinitem tb_checkinitem);
}
