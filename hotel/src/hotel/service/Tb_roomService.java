package hotel.service;

import java.util.List;

import hotel.entry.Tb_balancement;
import hotel.entry.Tb_checkinitem;
import hotel.entry.Tb_room;

/**
 * 
 * @author dadawang 客房信息表
 */
public interface Tb_roomService {

	// 查询房间的所有信息
	List<Tb_room> getAllTb_room();

	// 查询房间的所有信息状态为可入住
	List<Tb_room> getStateAllTb_room();

	// 结账同时更新客房信息表(Tb_room)客房状态(RMSTATE)
	int updTb_room(Tb_balancement tb_balancement);

	// 入住更新1：客房信息表(tb_room)客房状态(RMSTATE)
	int updTb_room(Tb_checkinitem tb_checkinitem);

	// 新增客房
	int addTb_room(Tb_room tb_room);

	// 修改1：通过id获取客房信息
	Tb_room getByIdTb_room(int rm_id);

	// 修改2：更新客房信息
	int updTb_room(Tb_room tb_room);

	// 暂停该客房信息
	int pauseTb_room(Tb_room tb_room);

	// 开放该客房信息
	int startTb_room(Tb_room tb_room);

}
