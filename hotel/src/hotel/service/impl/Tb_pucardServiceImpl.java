package hotel.service.impl;

import java.util.List;

import hotel.dao.Tb_pucardDao;
import hotel.dao.impl.Tb_pucardDaoImpl;
import hotel.entry.Tb_pucard;
import hotel.service.Tb_pucardService;

public class Tb_pucardServiceImpl implements Tb_pucardService {

	private Tb_pucardDao tb_pucardDao = new Tb_pucardDaoImpl();

	// 获取所有的证件类型
	@Override
	public List<Tb_pucard> getAllTb_pucard() {
		List<Tb_pucard> list = tb_pucardDao.getAllTb_pucard();
		return list;
	}

}
