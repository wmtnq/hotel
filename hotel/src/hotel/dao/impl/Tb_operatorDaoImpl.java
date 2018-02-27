package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_operatorDao;
import hotel.entry.Tb_checkinorder;
import hotel.entry.Tb_operator;
import hotel.entry.Tb_pucard;

public class Tb_operatorDaoImpl extends  BaseDaoDBUtil<Tb_operator> implements Tb_operatorDao{

	@Override	//获取操作员信息
	public List<Tb_operator> getAllTb_operator() {
		// TODO Auto-generated method stub
		String prepardSql = "SELECT * FROM tb_operator";
		List<Tb_operator> list = super.executeQuery(new BeanListHandler<Tb_operator>(Tb_operator.class), prepardSql);
		return list;
	}

	@Override //添加操作员
	public int addTb_operator(Tb_operator tb_operator) {
		// TODO Auto-generated method stub
		String prepardSql = "INSERT tb_operator VALUES(?,?,?,?,?,?,?,?,?)";
		return super.executeUpdate(prepardSql);
	}

	@Override //通过名字查询信息
	public Tb_operator getByNameTb_operator(String UserName) {
		// TODO Auto-generated method stub
		String prepardSql  = "Select * from tb_operator where UserName = ?";
		return super.executeQuery(new BeanHandler<Tb_operator>(Tb_operator.class), prepardSql,UserName);
	}
	

	@Override	//修改操作员信息
	public int updTb_operator(Tb_operator tb_operator) {
		// TODO Auto-generated method stub
		String prepardSql="UPDATE tb_operator set op_passWord=?,op_privilege=?,op_address=?,op_name=?,op_telephone=?,op_mobile=?,op_zip=?,op_createTime=? where op_userName=? ";
		return super.executeUpdate(prepardSql);
	}

	@Override //删除操作员
	public int delTb_operator(String opusername) {
		// TODO Auto-generated method stub
		String prepardSql="DELETE FROM tb_operator WHERE OPUSERNAME =?";
		return super.executeUpdate(prepardSql,opusername);
	}

}