package hotel.dao;

import java.util.List;

import hotel.entry.Tb_pucategory;

/**
 * 
 * @author dadawang 客人类别表
 */
public interface Tb_pucategoryDao {

	// 获取所有的客户类别
	List<Tb_pucategory> getAllTb_pucategory();

	//通过消费额获取客户类别
	Tb_pucategory getByMoneyTb_pucategory(int  gt_expenditure);
	
	//通过id获取客户类别
	Tb_pucategory getByIdTb_pucategory(int gr_id);
}
