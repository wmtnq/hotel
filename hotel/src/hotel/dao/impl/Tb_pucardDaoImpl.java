package hotel.dao.impl;

import java.util.List;

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
public static void main(String[] args) {
	Tb_pucardDaoImpl tb = new Tb_pucardDaoImpl();
	System.out.println(tb.getAllTb_pucard().get(1).getPc_cardCatalogName());
}
}
