package hotel.entry;

/**
 * 
 * @author dadawang 支付类型表
 */
public class Tb_pupaymenttype {
	private int COID;// 支付类型编号
	private String CIOGUESTTYPENAME;// 支付类型名

	public int getCOID() {
		return COID;
	}

	public void setCOID(int COID) {
		this.COID = COID;
	}

	public String getCIOGUESTTYPENAME() {
		return CIOGUESTTYPENAME;
	}

	public void setCIOGUESTTYPENAME(String CIOGUESTTYPENAME) {
		this.CIOGUESTTYPENAME = CIOGUESTTYPENAME;
	}

}