package hotel.dao;

import java.util.List;

import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_room;

/**
 * 
 * @author dadawang 客房信息表
 */
public interface Tb_roomDao {

	// 查询房间的所有信息
	List<Tb_room> getAllTb_room();

	// 结账同时更新客房信息表(Tb_room)客房状态(RMSTATE)
	int updTb_room(Tb_balancement tb_balancement);

	//入住更新1：客房信息表(tb_room)客房状态(RMSTATE)
	int updTb_room(Tb_checkinitem tb_checkinitem);

}
