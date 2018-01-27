package hotel.service;

import java.util.List;

import hotel.entry.Tb_operator;

/**
 * 
 * @author dadawang 操作员信息表
 */
public interface Tb_operatorService {

	// 获取所有的操作员信息
	public List<Tb_operator> getAllTb_operator();

	// 新增操作员
	public int addTb_operator(Tb_operator tb_operator);

	// 修改1：通过用户名获取获取该操作员信息
	public Tb_operator getByIdTb_operator(String opusername);

	// 修改2：更新修改后的操作员信息
	public int updTb_operator(Tb_operator tb_operator);

	// 删除操作员以用户名为条件
	public int delTb_operator(String opusername);

	//获取该用户的条目核对密码
	Tb_operator getByNameTb_operator(String UserName);

}
