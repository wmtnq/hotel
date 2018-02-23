package hotel.dao;

import java.util.List;

import hotel.entry.Tb_pucategory;

/**
 * 
 * @author dadawang 客人类别表
 */
public interface Tb_pucategoryDao {

	// 获取所有的客人类别
	List<Tb_pucategory> getAllTb_pucategory();

	
}
