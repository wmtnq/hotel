package hotel.service.impl;

import java.util.List;

import hotel.dao.Tb_pucategoryDao;
import hotel.dao.impl.Tb_pucategoryDaoImpl;
import hotel.entry.Tb_pucategory;
import hotel.service.Tb_pucategoryService;

public class Tb_pucategoryServiceImpl implements Tb_pucategoryService {
	private Tb_pucategoryDao tb_pucategoryDao = new Tb_pucategoryDaoImpl();

	// 获取所有客户类别
	@Override
	public List<Tb_pucategory> getAllTb_pucategory() {
		List<Tb_pucategory> list = tb_pucategoryDao.getAllTb_pucategory();
		return list;
	}

}
