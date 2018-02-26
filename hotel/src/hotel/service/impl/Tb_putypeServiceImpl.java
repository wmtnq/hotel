package hotel.service.impl;

import java.util.List;

import hotel.dao.Tb_putypeDao;
import hotel.dao.impl.Tb_putypeDaoImpl;
import hotel.entry.Tb_putype;
import hotel.service.Tb_putypeService;

public class Tb_putypeServiceImpl implements Tb_putypeService {
	private Tb_putypeDao tb_putypeDao = new Tb_putypeDaoImpl();

	// 获取所有类型
	@Override
	public List<Tb_putype> getAllTb_putype() {
		List<Tb_putype> list = tb_putypeDao.getAllTb_putype();
		return list;
	}

}
