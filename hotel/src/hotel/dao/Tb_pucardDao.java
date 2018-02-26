package hotel.dao;

import java.util.List;

import hotel.entry.Tb_pucard;

/**
 * 
 * @author dadawang 证件类型
 */
public interface Tb_pucardDao {

	// 获取所有的证件类型
	List<Tb_pucard> getAllTb_pucard();

	// 通过id获取证件类型
	Tb_pucard getByIdTb_pucard(int pc_id);
}
