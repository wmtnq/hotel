package hotel.entry;

/**
 * 
 * @author dadawang 客户信息表
 */
public class Tb_operator {
	private String OPUSERNAME;// 操作员用户名
	private String OPPASSWORD;// 操作员密码
	private int OPPRIVILEGE;// 操作员权限 0普通，1管理员，2root
	private String OPADDRESS;// 地址
	private String OPNAME;// 姓名
	private String OPTELEPHONE;// 手机电话
	private String OPMOBILE;// 分机号码
	private String OPZIP;// 邮编
	private String OPCREATETIME;// 创建时间

	public String getOPUSERNAME() {
		return OPUSERNAME;
	}

	public void setOPUSERNAME(String OPUSERNAME) {
		this.OPUSERNAME = OPUSERNAME;
	}

	public String getOPPASSWORD() {
		return OPPASSWORD;
	}

	public void setOPPASSWORD(String OPPASSWORD) {
		this.OPPASSWORD = OPPASSWORD;
	}

	public int getOPPRIVILEGE() {
		return OPPRIVILEGE;
	}

	public void setOPPRIVILEGE(int OPPRIVILEGE) {
		this.OPPRIVILEGE = OPPRIVILEGE;
	}

	public String getOPADDRESS() {
		return OPADDRESS;
	}

	public void setOPADDRESS(String OPADDRESS) {
		this.OPADDRESS = OPADDRESS;
	}

	public String getOPNAME() {
		return OPNAME;
	}

	public void setOPNAME(String OPNAME) {
		this.OPNAME = OPNAME;
	}

	public String getOPTELEPHONE() {
		return OPTELEPHONE;
	}

	public void setOPTELEPHONE(String OPTELEPHONE) {
		this.OPTELEPHONE = OPTELEPHONE;
	}

	public String getOPMOBILE() {
		return OPMOBILE;
	}

	public void setOPMOBILE(String OPMOBILE) {
		this.OPMOBILE = OPMOBILE;
	}

	public String getOPZIP() {
		return OPZIP;
	}

	public void setOPZIP(String OPZIP) {
		this.OPZIP = OPZIP;
	}

	public String getOPCREATETIME() {
		return OPCREATETIME;
	}

	public void setOPCREATETIME(String OPCREATETIME) {
		this.OPCREATETIME = OPCREATETIME;
	}

}