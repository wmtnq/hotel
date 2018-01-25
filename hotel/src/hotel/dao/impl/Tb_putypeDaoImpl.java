package hotel.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import hotel.dao.BaseDao;
import hotel.dao.Tb_putypeDao;
import hotel.entry.Tb_putype;

public class Tb_putypeDaoImpl extends BaseDao implements Tb_putypeDao {

	@Override
	public List<Tb_putype> getAllTb_putype() {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM tb_putype";
		ResultSet res = super.executeQuery(sql);
		List<Tb_putype> list = new ArrayList<Tb_putype>();
		try {
			while(res.next()) {
				Tb_putype tb_putype = new Tb_putype();
				tb_putype.setGTID(res.getInt("GTID"));
				tb_putype.setGTTYPENAME(res.getString("GTTYPENAME"));
				list.add(tb_putype);
					
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
