package hotel.entry;

/**
 * 
 * @author dadawang 客人类别表
 */
public class Tb_pucategory {
	private int CIOID;// 客人类别编号
	private String CIOPAYMENTMODELNAME;// 客人类别名

	public int getCIOID() {
		return CIOID;
	}

	public void setCIOID(int CIOID) {
		this.CIOID = CIOID;
	}

	public String getCIOPAYMENTMODELNAME() {
		return CIOPAYMENTMODELNAME;
	}

	public void setCIOPAYMENTMODELNAME(String CIOPAYMENTMODELNAME) {
		this.CIOPAYMENTMODELNAME = CIOPAYMENTMODELNAME;
	}

}