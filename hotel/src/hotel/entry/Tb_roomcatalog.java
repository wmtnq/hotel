package hotel.entry;

/**
 * 
 * @author dadawang 客房类型表
 */
public class Tb_roomcatalog {
	private int rc_id;// 客房类型编号
	private String rc_name;// 客房类型名称
	private int rc_bedNumber;// 床位数
	private double rc_prePrice;// 预定价格
	private double rc_prediscount;// 预订折扣
	private double rc_hourbasePrice;// 计时最低价
	private double rc_perhourPrice;// 计时每小时价
	private int rc_state;// 客房类型状态
	
	public int getRc_state() {
		return rc_state;
	}
	public void setRc_state(int rc_state) {
		this.rc_state = rc_state;
	}
	public int getRc_id() {
		return rc_id;
	}
	public void setRc_id(int rc_id) {
		this.rc_id = rc_id;
	}
	public String getRc_name() {
		return rc_name;
	}
	public void setRc_name(String rc_name) {
		this.rc_name = rc_name;
	}
	public int getRc_bedNumber() {
		return rc_bedNumber;
	}
	public void setRc_bedNumber(int rc_bedNumber) {
		this.rc_bedNumber = rc_bedNumber;
	}
	public double getRc_prePrice() {
		return rc_prePrice;
	}
	public void setRc_prePrice(double rc_prePrice) {
		this.rc_prePrice = rc_prePrice;
	}
	public double getRc_prediscount() {
		return rc_prediscount;
	}
	public void setRc_prediscount(double rc_prediscount) {
		this.rc_prediscount = rc_prediscount;
	}
	public double getRc_hourbasePrice() {
		return rc_hourbasePrice;
	}
	public void setRc_hourbasePrice(double rc_hourbasePrice) {
		this.rc_hourbasePrice = rc_hourbasePrice;
	}
	public double getRc_perhourPrice() {
		return rc_perhourPrice;
	}
	public void setRc_perhourPrice(double rc_perhourPrice) {
		this.rc_perhourPrice = rc_perhourPrice;
	}

}