package hotel.dao;

import java.util.List;

import hotel.entry.Tb_pupaymenttype;

/**
 * 
 * @author dadawang 支付类型
 */
public interface Tb_pupaymenttypeDao {

	// 获取所有的支付类型
	List<Tb_pupaymenttype> getAllTb_pupaymenttype();

	// 通过ID获取支付方式
	Tb_pupaymenttype getByIdTb_pupaymenttype(int ppt_id);
}
