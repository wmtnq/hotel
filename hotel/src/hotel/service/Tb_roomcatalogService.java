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

	// 新增客房类型
	int addTb_roomcatalog();

	// 修改1：通过id获取该条客房的类型信息
	Tb_roomcatalog getByIdTb_roomcatalog(int id);

	// 修改2：更新客房类型
	int addTb_roomcatalog(Tb_roomcatalog tb_roomcatalog);

	// 删除客房类型注：删除客房类型要先删除该类型的客房
	boolean delTb_roomcatalog(Tb_roomcatalog tb_roomcatalog);

}
