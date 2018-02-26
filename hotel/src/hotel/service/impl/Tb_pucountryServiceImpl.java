package hotel.service.impl;

import java.util.List;

import hotel.dao.Tb_pucountryDao;
import hotel.dao.impl.Tb_pucountryDaoImpl;
import hotel.entry.Tb_pucountry;
import hotel.service.Tb_pucountryService;

public class Tb_pucountryServiceImpl implements Tb_pucountryService {

	private Tb_pucountryDao Tb_pucountryDao = new Tb_pucountryDaoImpl();

	// 获取所有的国籍
	@Override
	public List<Tb_pucountry> getAllTb_pucountry() {
		List<Tb_pucountry> list = Tb_pucountryDao.getAllTb_pucountry();
		return list;
	}

}
