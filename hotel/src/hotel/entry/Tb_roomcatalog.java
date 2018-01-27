package hotel.entry;

/**
 * 
 * @author dadawang 客房类型表
 */
public class Tb_roomcatalog {
	private int RCID;// 客房类型编号
	private String RCNAME;// 客房类型名称
	private int RCBEDNUMBER;// 床位数
	private double RCPREPRICE;// 预定价格
	private double RCPREDISCOUNT;// 预订折扣
	private double RCHOURBASEPRICE;// 计时最低价
	private double RCPERHOURPRICE;// 计时每小时价

	public int getRCID() {
		return RCID;
	}

	public void setRCID(int RCID) {
		this.RCID = RCID;
	}

	public String getRCNAME() {
		return RCNAME;
	}

	public void setRCNAME(String RCNAME) {
		this.RCNAME = RCNAME;
	}

	public int getRCBEDNUMBER() {
		return RCBEDNUMBER;
	}

	public void setRCBEDNUMBER(int RCBEDNUMBER) {
		this.RCBEDNUMBER = RCBEDNUMBER;
	}

	public double getRCPREPRICE() {
		return RCPREPRICE;
	}

	public void setRCPREPRICE(double RCPREPRICE) {
		this.RCPREPRICE = RCPREPRICE;
	}

	public double getRCPREDISCOUNT() {
		return RCPREDISCOUNT;
	}

	public void setRCPREDISCOUNT(double RCPREDISCOUNT) {
		this.RCPREDISCOUNT = RCPREDISCOUNT;
	}

	public double getRCHOURBASEPRICE() {
		return RCHOURBASEPRICE;
	}

	public void setRCHOURBASEPRICE(double RCHOURBASEPRICE) {
		this.RCHOURBASEPRICE = RCHOURBASEPRICE;
	}

	public double getRCPERHOURPRICE() {
		return RCPERHOURPRICE;
	}

	public void setRCPERHOURPRICE(double RCPERHOURPRICE) {
		this.RCPERHOURPRICE = RCPERHOURPRICE;
	}

}