package hotel.service.impl;

import java.util.List;

import hotel.dao.Tb_operatorDao;
import hotel.dao.impl.Tb_operatorDaoImpl;
import hotel.entry.Tb_operator;
import hotel.service.Tb_operatorService;

public class Tb_operatorServiceImpl implements Tb_operatorService {

	private Tb_operatorDao tb_operatorDao = new Tb_operatorDaoImpl();

	// 获取所有的操作员信息
	@Override
	public List<Tb_operator> getAllTb_operator() {
		return tb_operatorDao.getAllTb_operator();
	}

	// 新增操作员
	@Override
	public int addTb_operator(Tb_operator tb_operator) {
		return tb_operatorDao.addTb_operator(tb_operator);
	}

	// 修改1：通过用户名获取获取该操作员信息
	public Tb_operator getByNameTb_operator(String opusername) {
		return tb_operatorDao.getByNameTb_operator(opusername);
	}

	// 修改2：更新修改后的操作员信息
	@Override
	public int updTb_operator(Tb_operator tb_operator) {
		return tb_operatorDao.updTb_operator(tb_operator);
	}

	// 删除操作员以用户名为条件
	@Override
	public int delTb_operator(String opusername) {
		return tb_operatorDao.delTb_operator(opusername);
	}

	// 验证登录
	@Override
	public Tb_operator getByNameByPass(String opusername, String pass) {
		Tb_operator tb_operator = tb_operatorDao.getByNameByPass(opusername, pass);
		return tb_operator;
	}

}
