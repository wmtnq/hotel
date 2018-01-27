package hotel.entry;

/**
 * 
 * @author dadawang 结账信息表
 */
public class Tb_balancement {
	private int BMID;// 结账信息编号
	private int BMCHECKINORDERID;// 入住登记订单编号
	private int BMROOM_RMID;// 客房编号
	private int BMGUESTID;// 客人编号
	private int BMTYPE;// 结账类型
	private double BMTOTALRATE;// 应收金额
	private double BMPAIDMONEY;// 已付押金 0未付
	private double BMRECEIVMONEY;// 续收金额
	private double BMREFUND;// 退款金额
	private String BMCREATETIME;// 创建时间
	private String BMOPERATOR;// 操作员
	private String BMPAYMENTMODEL;// 支付类型
	private int BMRECEIPT;// 是否开票
	private String BMCOMPANY;// 公司名称
	private String BMPHONE;// 手机号
	private String BMADDRESS;// 邮寄地址
	private int BMRECEIPTSTATUS;// 开票状态
	private String BMREMARK;// 结账说明

	public int getBMID() {
		return BMID;
	}

	public void setBMID(int BMID) {
		this.BMID = BMID;
	}

	public int getBMCHECKINORDERID() {
		return BMCHECKINORDERID;
	}

	public void setBMCHECKINORDERID(int BMCHECKINORDERID) {
		this.BMCHECKINORDERID = BMCHECKINORDERID;
	}

	public int getBMGUESTID() {
		return BMGUESTID;
	}

	public void setBMGUESTID(int BMGUESTID) {
		this.BMGUESTID = BMGUESTID;
	}

	public int getBMTYPE() {
		return BMTYPE;
	}

	public void setBMTYPE(int BMTYPE) {
		this.BMTYPE = BMTYPE;
	}

	public double getBMTOTALRATE() {
		return BMTOTALRATE;
	}

	public void setBMTOTALRATE(double BMTOTALRATE) {
		this.BMTOTALRATE = BMTOTALRATE;
	}

	public double getBMPAIDMONEY() {
		return BMPAIDMONEY;
	}

	public void setBMPAIDMONEY(double BMPAIDMONEY) {
		this.BMPAIDMONEY = BMPAIDMONEY;
	}

	public double getBMRECEIVMONEY() {
		return BMRECEIVMONEY;
	}

	public void setBMRECEIVMONEY(double BMRECEIVMONEY) {
		this.BMRECEIVMONEY = BMRECEIVMONEY;
	}

	public double getBMREFUND() {
		return BMREFUND;
	}

	public void setBMREFUND(double BMREFUND) {
		this.BMREFUND = BMREFUND;
	}

	public String getBMCREATETIME() {
		return BMCREATETIME;
	}

	public void setBMCREATETIME(String BMCREATETIME) {
		this.BMCREATETIME = BMCREATETIME;
	}

	public String getBMOPERATOR() {
		return BMOPERATOR;
	}

	public void setBMOPERATOR(String BMOPERATOR) {
		this.BMOPERATOR = BMOPERATOR;
	}

	public String getBMPAYMENTMODEL() {
		return BMPAYMENTMODEL;
	}

	public void setBMPAYMENTMODEL(String BMPAYMENTMODEL) {
		this.BMPAYMENTMODEL = BMPAYMENTMODEL;
	}

	public int getBMRECEIPT() {
		return BMRECEIPT;
	}

	public void setBMRECEIPT(int BMRECEIPT) {
		this.BMRECEIPT = BMRECEIPT;
	}

	public String getBMCOMPANY() {
		return BMCOMPANY;
	}

	public void setBMCOMPANY(String BMCOMPANY) {
		this.BMCOMPANY = BMCOMPANY;
	}

	public String getBMPHONE() {
		return BMPHONE;
	}

	public void setBMPHONE(String BMPHONE) {
		this.BMPHONE = BMPHONE;
	}

	public String getBMADDRESS() {
		return BMADDRESS;
	}

	public void setBMADDRESS(String BMADDRESS) {
		this.BMADDRESS = BMADDRESS;
	}

	public int getBMRECEIPTSTATUS() {
		return BMRECEIPTSTATUS;
	}

	public void setBMRECEIPTSTATUS(int BMRECEIPTSTATUS) {
		this.BMRECEIPTSTATUS = BMRECEIPTSTATUS;
	}

	public String getBMREMARK() {
		return BMREMARK;
	}

	public void setBMREMARK(String BMREMARK) {
		this.BMREMARK = BMREMARK;
	}

}