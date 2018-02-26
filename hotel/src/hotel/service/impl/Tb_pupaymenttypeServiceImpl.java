package hotel.service.impl;

import java.util.List;

import hotel.dao.Tb_pupaymenttypeDao;
import hotel.dao.impl.Tb_pupaymenttypeDaoImpl;
import hotel.entry.Tb_pupaymenttype;
import hotel.service.Tb_pupaymenttypeService;

public class Tb_pupaymenttypeServiceImpl implements Tb_pupaymenttypeService {
	private Tb_pupaymenttypeDao tb_pupaymenttypeDao = new Tb_pupaymenttypeDaoImpl();

	//获取所有支付类型
	@Override
	public List<Tb_pupaymenttype> getAllTb_pupaymenttype() {
		List<Tb_pupaymenttype> list = tb_pupaymenttypeDao.getAllTb_pupaymenttype();
		return list;
	}

}
