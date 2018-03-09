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
		String prepardSql = "SELECT * FROM tb_operator where op_privilege < 2 ";
		List<Tb_operator> list = super.executeQuery(new BeanListHandler<Tb_operator>(Tb_operator.class), prepardSql);
		return list;
	}

	@Override //添加操作员
	public int addTb_operator(Tb_operator tb_operator) {
		// TODO Auto-generated method stub
		String prepardSql = "INSERT tb_operator VALUES(?,?,?,?,?,?,?,?,?,?)";
		return super.executeUpdate(prepardSql,tb_operator.getOp_userName(),tb_operator.getOp_passWord(),tb_operator.getOp_privilege()
				,tb_operator.getOp_address(),tb_operator.getOp_name(),tb_operator.getOp_telephone(),tb_operator.getOp_mobile(),tb_operator.getOp_zip(),tb_operator.getOp_createTime(),tb_operator.getOp_state());
	}

	@Override //通过名字查询信息
	public Tb_operator getByNameTb_operator(String UserName) {
		// TODO Auto-generated method stub
		String prepardSql  = "Select * from tb_operator where op_userName = ?";
		return super.executeQuery(new BeanHandler<Tb_operator>(Tb_operator.class), prepardSql,UserName);
	}
	

	@Override	//修改操作员信息
	public int updTb_operator(Tb_operator tb_operator) {
		// TODO Auto-generated method stub
		String prepardSql="UPDATE tb_operator set op_passWord=?,op_privilege=?,op_address=?,op_telephone=?,op_mobile=?,op_zip=?where op_userName=? ";
		return super.executeUpdate(prepardSql,tb_operator.getOp_passWord(),tb_operator.getOp_privilege(),tb_operator.getOp_address(),tb_operator.getOp_telephone(),tb_operator.getOp_mobile(),tb_operator.getOp_zip(),tb_operator.getOp_userName());
	}

	@Override //停止使用操作员
	public int pauseTb_operator(String opusername) {
		// TODO Auto-generated method stub
		String prepardSql="UPDATE tb_operator SET op_state = 0 where op_userName = ?";
		return super.executeUpdate(prepardSql,opusername);
	}
	

	@Override //开放使用操作员
	public int startTb_operator(String opusername) {
		// TODO Auto-generated method stub
		String prepardSql="UPDATE tb_operator SET op_state = 1 where op_userName = ?";
		return super.executeUpdate(prepardSql,opusername);
	}

	//验证登录
	@Override
	public Tb_operator getByNameByPass(String opusername, String pass) {
		String prepardSql = "SELECT * FROM tb_operator WHERE op_userName=? and op_passWord = ?";
		Tb_operator tb_operator = super.executeQuery(new BeanHandler<Tb_operator>(Tb_operator.class), prepardSql, opusername,pass);
		return tb_operator;
	}
	
	//修改密码
	@Override
	public int updPassTb_operator(Tb_operator tb_operator) {
		String prepardSql="UPDATE tb_operator SET op_passWord = ? where op_userName = ?";
		int count = super.executeUpdate(prepardSql, tb_operator.getOp_passWord(),tb_operator.getOp_userName());
		return count;
	}

}