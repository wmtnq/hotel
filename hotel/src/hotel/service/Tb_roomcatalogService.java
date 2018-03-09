package hotel.service;

import java.util.List;

import hotel.entry.Tb_roomcatalog;

/**
 * 
 * @author dadawang 客房类型表
 */
public interface Tb_roomcatalogService {

	// 获取所有客房类型信息表(Tb_roomcatalog)
	List<Tb_roomcatalog> getAllTb_roomcatalog();

	// 获取所有客房类型信息表状态为可入住(Tb_roomcatalog)
	List<Tb_roomcatalog> getStateAllTb_roomcatalog();

	// 新增客房类型
	int addTb_roomcatalog(Tb_roomcatalog tb_roomcatalog);

	// 修改1：通过id获取该条客房的类型信息
	Tb_roomcatalog getByIdTb_roomcatalog(int id);

	// 修改2：更新客房类型
	int updTb_roomcatalog(Tb_roomcatalog tb_roomcatalog);

	// 暂停客房类型注：暂停该客房类型要先暂停该类型的客房
	boolean pauseTb_roomcatalog(Tb_roomcatalog tb_roomcatalog);

	// 开放客房类型注：开放客房类型要先开放该类型的客房
	boolean startTb_roomcatalog(Tb_roomcatalog tb_roomcatalog);

	// 只开放客房类型
	boolean startTb_roomcatalogx(Tb_roomcatalog tb_roomcatalog);
}
