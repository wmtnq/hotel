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
	private String BMREFUNDSTATE;
	private String BMCARDNAME;
	private String BMCARDNUMBER;
	private String BMCARDID;
	private String BMCARDPHONE;	
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
	public void setBMID(int bMID) {
		BMID = bMID;
	}
	public int getBMCHECKINORDERID() {
		return BMCHECKINORDERID;
	}
	public void setBMCHECKINORDERID(int bMCHECKINORDERID) {
		BMCHECKINORDERID = bMCHECKINORDERID;
	}
	public int getBMROOM_RMID() {
		return BMROOM_RMID;
	}
	public void setBMROOM_RMID(int bMROOM_RMID) {
		BMROOM_RMID = bMROOM_RMID;
	}
	public int getBMGUESTID() {
		return BMGUESTID;
	}
	public void setBMGUESTID(int bMGUESTID) {
		BMGUESTID = bMGUESTID;
	}
	public int getBMTYPE() {
		return BMTYPE;
	}
	public void setBMTYPE(int bMTYPE) {
		BMTYPE = bMTYPE;
	}
	public double getBMTOTALRATE() {
		return BMTOTALRATE;
	}
	public void setBMTOTALRATE(double bMTOTALRATE) {
		BMTOTALRATE = bMTOTALRATE;
	}
	public double getBMPAIDMONEY() {
		return BMPAIDMONEY;
	}
	public void setBMPAIDMONEY(double bMPAIDMONEY) {
		BMPAIDMONEY = bMPAIDMONEY;
	}
	public double getBMRECEIVMONEY() {
		return BMRECEIVMONEY;
	}
	public void setBMRECEIVMONEY(double bMRECEIVMONEY) {
		BMRECEIVMONEY = bMRECEIVMONEY;
	}
	public double getBMREFUND() {
		return BMREFUND;
	}
	public void setBMREFUND(double bMREFUND) {
		BMREFUND = bMREFUND;
	}
	public String getBMREFUNDSTATE() {
		return BMREFUNDSTATE;
	}
	public void setBMREFUNDSTATE(String bMREFUNDSTATE) {
		BMREFUNDSTATE = bMREFUNDSTATE;
	}
	public String getBMCARDNAME() {
		return BMCARDNAME;
	}
	public void setBMCARDNAME(String bMCARDNAME) {
		BMCARDNAME = bMCARDNAME;
	}
	public String getBMCARDNUMBER() {
		return BMCARDNUMBER;
	}
	public void setBMCARDNUMBER(String bMCARDNUMBER) {
		BMCARDNUMBER = bMCARDNUMBER;
	}
	public String getBMCARDID() {
		return BMCARDID;
	}
	public void setBMCARDID(String bMCARDID) {
		BMCARDID = bMCARDID;
	}
	public String getBMCARDPHONE() {
		return BMCARDPHONE;
	}
	public void setBMCARDPHONE(String bMCARDPHONE) {
		BMCARDPHONE = bMCARDPHONE;
	}
	public String getBMCREATETIME() {
		return BMCREATETIME;
	}
	public void setBMCREATETIME(String bMCREATETIME) {
		BMCREATETIME = bMCREATETIME;
	}
	public String getBMOPERATOR() {
		return BMOPERATOR;
	}
	public void setBMOPERATOR(String bMOPERATOR) {
		BMOPERATOR = bMOPERATOR;
	}
	public String getBMPAYMENTMODEL() {
		return BMPAYMENTMODEL;
	}
	public void setBMPAYMENTMODEL(String bMPAYMENTMODEL) {
		BMPAYMENTMODEL = bMPAYMENTMODEL;
	}
	public int getBMRECEIPT() {
		return BMRECEIPT;
	}
	public void setBMRECEIPT(int bMRECEIPT) {
		BMRECEIPT = bMRECEIPT;
	}
	public String getBMCOMPANY() {
		return BMCOMPANY;
	}
	public void setBMCOMPANY(String bMCOMPANY) {
		BMCOMPANY = bMCOMPANY;
	}
	public String getBMPHONE() {
		return BMPHONE;
	}
	public void setBMPHONE(String bMPHONE) {
		BMPHONE = bMPHONE;
	}
	public String getBMADDRESS() {
		return BMADDRESS;
	}
	public void setBMADDRESS(String bMADDRESS) {
		BMADDRESS = bMADDRESS;
	}
	public int getBMRECEIPTSTATUS() {
		return BMRECEIPTSTATUS;
	}
	public void setBMRECEIPTSTATUS(int bMRECEIPTSTATUS) {
		BMRECEIPTSTATUS = bMRECEIPTSTATUS;
	}
	public String getBMREMARK() {
		return BMREMARK;
	}
	public void setBMREMARK(String bMREMARK) {
		BMREMARK = bMREMARK;
	}


}