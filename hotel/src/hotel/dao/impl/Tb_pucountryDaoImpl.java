package hotel.dao.impl;

import java.util.List;

import org.apache.commons.dbutils.handlers.BeanListHandler;

import hotel.dao.BaseDaoDBUtil;
import hotel.dao.Tb_pucountryDao;
import hotel.entry.Tb_pucountry;

/**
 * 国籍
 * 
 * @author dadawang
 *
 */
public class Tb_pucountryDaoImpl extends BaseDaoDBUtil<Tb_pucountry> implements Tb_pucountryDao {

	// 获取全部国籍
	@Override
	public List<Tb_pucountry> getAllTb_pucountry() {
		// TODO Auto-generated method stub
		String prepardSql = "SELECT * FROM tb_pucountry";
		List<Tb_pucountry> list = super.executeQuery(new BeanListHandler<Tb_pucountry>(Tb_pucountry.class), prepardSql);
		return list;
	}
	
	public static void main(String[] args) {
		Tb_pucountryDaoImpl tb =  new Tb_pucountryDaoImpl();
		System.out.println(tb.getAllTb_pucountry().get(10).getPct_countryName());
	}

}
