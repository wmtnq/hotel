package hotel.entry;

/**
 * 
 * @author dadawang 客人信息表
 */
public class Tb_guest {
	private int GTID;// 客人编号
	private String GTNAME;// 客人姓名
	private int GTTYPE;// 客人类型
	private int GTCARDCATALOG;// 客人证件类型
	private String GTCARDID;// 客人证件号码
	private int GTCOUNTRY;// 国籍
	private String GTADDRESS;// 地址
	private String GTZIP;// 邮编
	private String GTCOMPANY;// 公司(工作单位)
	private String CTTELPHONE;// 固定电话
	private String GTMOBILE;// 手机号码
	private int GTGENDER;// 性别 0=女,1=男
	private String GTEMAIL;// Email地址
	private String GTCREATETIME;// 资料创建时间
	private String GTNUBER;// 消费次数
	private String GTEXPENDITURE;// 消费的金额
	private String GTGRADE;// 会员等级

	public int getGTID() {
		return GTID;
	}

	public void setGTID(int GTID) {
		this.GTID = GTID;
	}

	public String getGTNAME() {
		return GTNAME;
	}

	public void setGTNAME(String GTNAME) {
		this.GTNAME = GTNAME;
	}

	public int getGTTYPE() {
		return GTTYPE;
	}

	public void setGTTYPE(int GTTYPE) {
		this.GTTYPE = GTTYPE;
	}

	public int getGTCARDCATALOG() {
		return GTCARDCATALOG;
	}

	public void setGTCARDCATALOG(int GTCARDCATALOG) {
		this.GTCARDCATALOG = GTCARDCATALOG;
	}

	public String getGTCARDID() {
		return GTCARDID;
	}

	public void setGTCARDID(String GTCARDID) {
		this.GTCARDID = GTCARDID;
	}

	public int getGTCOUNTRY() {
		return GTCOUNTRY;
	}

	public void setGTCOUNTRY(int GTCOUNTRY) {
		this.GTCOUNTRY = GTCOUNTRY;
	}

	public String getGTADDRESS() {
		return GTADDRESS;
	}

	public void setGTADDRESS(String GTADDRESS) {
		this.GTADDRESS = GTADDRESS;
	}

	public String getGTZIP() {
		return GTZIP;
	}

	public void setGTZIP(String GTZIP) {
		this.GTZIP = GTZIP;
	}

	public String getGTCOMPANY() {
		return GTCOMPANY;
	}

	public void setGTCOMPANY(String GTCOMPANY) {
		this.GTCOMPANY = GTCOMPANY;
	}

	public String getCTTELPHONE() {
		return CTTELPHONE;
	}

	public void setCTTELPHONE(String CTTELPHONE) {
		this.CTTELPHONE = CTTELPHONE;
	}

	public String getGTMOBILE() {
		return GTMOBILE;
	}

	public void setGTMOBILE(String GTMOBILE) {
		this.GTMOBILE = GTMOBILE;
	}

	public int getGTGENDER() {
		return GTGENDER;
	}

	public void setGTGENDER(int GTGENDER) {
		this.GTGENDER = GTGENDER;
	}

	public String getGTEMAIL() {
		return GTEMAIL;
	}

	public void setGTEMAIL(String GTEMAIL) {
		this.GTEMAIL = GTEMAIL;
	}

	public String getGTCREATETIME() {
		return GTCREATETIME;
	}

	public void setGTCREATETIME(String GTCREATETIME) {
		this.GTCREATETIME = GTCREATETIME;
	}

	public String getGTNUBER() {
		return GTNUBER;
	}

	public void setGTNUBER(String gTNUBER) {
		GTNUBER = gTNUBER;
	}

	public String getGTGRADE() {
		return GTGRADE;
	}

	public void setGTGRADE(String GTGRADE) {
		GTGRADE = GTGRADE;
	}

	public String getGTEXPENDITURE() {
		return GTEXPENDITURE;
	}

	public void setGTEXPENDITURE(String gTEXPENDITURE) {
		GTEXPENDITURE = gTEXPENDITURE;
	}

}