package hotel.dao;

import java.util.List;

import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_room;
import hotel.entry.Tb_roomcatalog;

/**
 * 
 * @author dadawang 客房信息表
 */
public interface Tb_roomDao {

	// 查询房间的所有信息
	List<Tb_room> getAllTb_room();

	// 查询房间的所有信息
	List<Tb_room> getStateAllTb_room();

	// 新增客房
	int addTb_room(Tb_room tb_room);

	// 修改1：通过id获取该条客房的信息
	Tb_room getByIdTb_room(int id);

	// 修改2：更新客房信息
	int updTb_room(Tb_room tb_room);

	// 结账同时更新客房信息表(Tb_room)客房状态(RMSTATE)
	int updTb_room(Tb_balancement tb_balancement);

	// 入住更新1：客房信息表(tb_room)客房状态(RMSTATE)
	int updTb_room(Tb_checkinitem tb_checkinitem);

	// 暂停入住该客房
	int pauseTb_room(Tb_room tb_room);

	// 开放入住该客房
	int startTb_room(Tb_room tb_room);

	// 暂停入住该类客房
	int pauseTb_rooms(Tb_roomcatalog Tb_roomcatalog);

	// 开放入住该类客房
	int startTb_rooms(Tb_roomcatalog Tb_roomcatalog);
}
