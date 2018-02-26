package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_pucardDao;
import hotel.entry.Tb_pucard;

/**
 * 证件类型
 * 
 * @author dadawang
 *
 */
public class Tb_pucardDaoImpl extends BaseDaoDBUtil<Tb_pucard> implements Tb_pucardDao {

	// 证件类型
	@Override
	public List<Tb_pucard> getAllTb_pucard() {
		// TODO Auto-generated method stub
		String prepardSql = "SELECT * FROM tb_pucard";
		List<Tb_pucard> list = super.executeQuery(new BeanListHandler<Tb_pucard>(Tb_pucard.class), prepardSql);
		return list;
	}

	// 通过id获取证件类型
	@Override
	public Tb_pucard getByIdTb_pucard(int pc_id) {
		String prepardSql = "SELECT * FROM tb_pucard WHERE pc_id = ?";
		Tb_pucard tb_pucard = super.executeQuery(new BeanHandler<Tb_pucard>(Tb_pucard.class), prepardSql, pc_id);
		return tb_pucard;
	}

}
