package hotel.dao;

import java.util.List;

import hotel.entry.Tb_putype;

/**
 * 
 * @author dadawang 客户类型表
 */
public interface Tb_putypeDao {
	// 获取所有客户类型
	List<Tb_putype> getAllTb_putype();

	// 通过id获取客户类型
	Tb_putype getByIdTb_putype(int pt_id);
}
