package hotel.entry;

/**
 * 
 * @author dadawang 支付类型表
 */
public class Tb_pupaymenttype {
	private int ppt_id;// 支付类型编号
	private String ppt_guestTypeName;// 支付类型名
	public int getPpt_id() {
		return ppt_id;
	}
	public void setPpt_id(int ppt_id) {
		this.ppt_id = ppt_id;
	}
	public String getPpt_guestTypeName() {
		return ppt_guestTypeName;
	}
	public void setPpt_guestTypeName(String ppt_guestTypeName) {
		this.ppt_guestTypeName = ppt_guestTypeName;
	}

}