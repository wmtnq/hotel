package hotel.entry;

/**
 * 
 * @author dadawang 客户信息表
 */
public class Tb_operator {
	private String op_userName;// 操作员用户名
	private String op_passWord;// 操作员密码
	private int op_privilege;// 操作员权限 0普通，1管理员，2root
	private String op_address;// 地址
	private String op_name;// 姓名
	private String op_telephone;// 手机电话
	private String op_mobile;// 分机号码
	private String op_zip;// 邮编
	private String op_createTime;// 创建时间
	private int op_state;// 操作员状态
	
	public int getOp_state() {
		return op_state;
	}
	public void setOp_state(int op_state) {
		this.op_state = op_state;
	}
	public String getOp_userName() {
		return op_userName;
	}
	public void setOp_userName(String op_userName) {
		this.op_userName = op_userName;
	}
	public String getOp_passWord() {
		return op_passWord;
	}
	public void setOp_passWord(String op_passWord) {
		this.op_passWord = op_passWord;
	}
	public int getOp_privilege() {
		return op_privilege;
	}
	public void setOp_privilege(int op_privilege) {
		this.op_privilege = op_privilege;
	}
	public String getOp_address() {
		return op_address;
	}
	public void setOp_address(String op_address) {
		this.op_address = op_address;
	}
	public String getOp_name() {
		return op_name;
	}
	public void setOp_name(String op_name) {
		this.op_name = op_name;
	}
	public String getOp_telephone() {
		return op_telephone;
	}
	public void setOp_telephone(String op_telephone) {
		this.op_telephone = op_telephone;
	}
	public String getOp_mobile() {
		return op_mobile;
	}
	public void setOp_mobile(String op_mobile) {
		this.op_mobile = op_mobile;
	}
	public String getOp_zip() {
		return op_zip;
	}
	public void setOp_zip(String op_zip) {
		this.op_zip = op_zip;
	}
	public String getOp_createTime() {
		return op_createTime;
	}
	public void setOp_createTime(String op_createTime) {
		this.op_createTime = op_createTime;
	}

	

}