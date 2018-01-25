package hotel.dao;

import java.util.List;

import hotel.entry.Tb_operator;

public interface Tb_operatorDao {

	// 获取全部的操作员列表
	public List<Tb_operator> getAllTb_operator();

	// 添加操作员
	public int addTb_operator(Tb_operator tb_operator);

	// 删除操作员
	public int delTb_operator(String opusername);

	// 修改1：以id为条件查询获取一条对象
	public Tb_operator getByNameTb_operator(String opusername);

	// 修改2：传修改后的操作员对象更新到数据库
	public int updTb_operator(Tb_operator tb_operator);
}
