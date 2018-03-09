package hotel.dao;

import java.util.List;

import hotel.entry.Tb_roomcatalog;

/**
 * 
 * @author dadawang 客房类型表
 */
public interface Tb_roomcatalogDao {

	// 获取所有客房类型信息表(Tb_roomcatalog)
	List<Tb_roomcatalog> getAllTb_roomcatalog();
	
	// 获取所有可以入住的信息表
	List<Tb_roomcatalog> getStateAllTb_roomcatalog();
	
	// 新增客房类型
	int addTb_roomcatalog(Tb_roomcatalog tb_roomcatalog);

	// 修改1：通过id获取该条客房的类型信息
	Tb_roomcatalog getByIdTb_roomcatalog(int id);

	// 修改2：更新客房类型
	int updTb_roomcatalog(Tb_roomcatalog tb_roomcatalog);

	// 暂停入住该客房类型注：暂停入住该客房类型要先暂停入住该类型的客房
	int pauseTb_roomcatalog(Tb_roomcatalog tb_roomcatalog);
	
	// 开放入住该客房类型注：开放入住该客房类型要先开放入住该类型的客房
	int startTb_roomcatalog(Tb_roomcatalog tb_roomcatalog);

}
