package hotel.dao;

import java.util.List;

import hotel.entry.Tb_pucountry;

/**
 * 
 * @author dadawang 国籍表
 */
public interface Tb_pucountryDao {

	// 获取所有国籍
	List<Tb_pucountry> getAllTb_pucountry();

	//通过id获取国籍
	Tb_pucountry getByIdTb_pucountry(int pct_id);
}
