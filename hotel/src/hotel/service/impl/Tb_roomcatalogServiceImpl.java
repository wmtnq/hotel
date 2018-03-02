package hotel.service.impl;

import java.util.List;

import hotel.dao.Tb_roomDao;
import hotel.dao.Tb_roomcatalogDao;
import hotel.dao.impl.Tb_roomDaoImpl;
import hotel.dao.impl.Tb_roomcatalogDaoImpl;
import hotel.entry.Tb_roomcatalog;
import hotel.service.Tb_roomcatalogService;

public class Tb_roomcatalogServiceImpl implements Tb_roomcatalogService {
	private Tb_roomcatalogDao tb_roomcatalogDao = new Tb_roomcatalogDaoImpl();
	private Tb_roomDao tb_roomDao = new Tb_roomDaoImpl();

	// 查询所有房间类型数据(查)
	@Override
	public List<Tb_roomcatalog> getAllTb_roomcatalog() {
		return tb_roomcatalogDao.getAllTb_roomcatalog();
	}

	// 新增客房类型(增)
	@Override
	public int addTb_roomcatalog(Tb_roomcatalog tb_roomcatalog) {
		return tb_roomcatalogDao.addTb_roomcatalog(tb_roomcatalog);
	}

	// 修改1：通过id获取该条客房的类型信息
	@Override
	public Tb_roomcatalog getByIdTb_roomcatalog(int id) {
		return tb_roomcatalogDao.getByIdTb_roomcatalog(id);
	}

	// 修改2：更新客房类型(更)
	@Override
	public int updTb_roomcatalog(Tb_roomcatalog tb_roomcatalog) {
		return tb_roomcatalogDao.updTb_roomcatalog(tb_roomcatalog);
	}

	// 删除客房类型注：删除客房类型要先删除该类型的客房(删)
	@Override
	public boolean delTb_roomcatalog(Tb_roomcatalog tb_roomcatalog) {
		boolean flag = true;
		if (tb_roomDao.delTb_rooms(tb_roomcatalog) <= 0) {
			flag = false;
		}
		if (tb_roomcatalogDao.delTb_roomcatalog(tb_roomcatalog) <= 0) {
			flag = false;
		}
		return flag;

	}

}
