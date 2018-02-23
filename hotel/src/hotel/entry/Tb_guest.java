package hotel.entry;

/**
 * 
 * @author dadawang 客人信息表
 */
public class Tb_guest {
	private int gt_id;// 客人编号
	private String gt_name;// 客人姓名
	private int gt_type;// 客人类型
	private int gt_pucategory;// 客人类别
	private int gt_cardcatalog;// 客户证件类型
	private String gt_cardId;// 客人证件号码
	private int gt_country;//国籍
	private String gt_address;// 地址
	private String gt_zip;// 邮编
	private String gt_company;// 公司(工作单位)
	private String gt_telPhone;// 固定电话
	private String gt_mobile;// 手机号码
	private String gt_gender;// 性别 0=女,1=男
	private String gt_email;// Email地址
	private String gt_createtime;// 资料创建时间
	private String gt_nuber;// 消费次数
	private String gt_expenditure;// 消费的金额
	private Tb_pucategory tb_pucategory;// 客户类别
	private Tb_pucard tb_pucard;// 证件类型
	private Tb_pucountry tb_pucountry;// 国籍
	private Tb_putype tb_putype;// 客户类型

	public int getGt_id() {
		return gt_id;
	}

	public void setGt_id(int gt_id) {
		this.gt_id = gt_id;
	}

	public String getGt_name() {
		return gt_name;
	}

	public void setGt_name(String gt_name) {
		this.gt_name = gt_name;
	}

	public int getGt_type() {
		return gt_type;
	}

	public void setGt_type(int gt_type) {
		this.gt_type = gt_type;
	}

	public int getGt_pucategory() {
		return gt_pucategory;
	}

	public void setGt_pucategory(int gt_pucategory) {
		this.gt_pucategory = gt_pucategory;
	}

	public int getGt_cardcatalog() {
		return gt_cardcatalog;
	}

	public void setGt_cardcatalog(int gt_cardcatalog) {
		this.gt_cardcatalog = gt_cardcatalog;
	}

	public String getGt_cardId() {
		return gt_cardId;
	}

	public void setGt_cardId(String gt_cardId) {
		this.gt_cardId = gt_cardId;
	}

	
	public int getGt_country() {
		return gt_country;
	}

	public void setGt_country(int gt_country) {
		this.gt_country = gt_country;
	}

	public String getGt_address() {
		return gt_address;
	}

	public void setGt_address(String gt_address) {
		this.gt_address = gt_address;
	}

	public String getGt_zip() {
		return gt_zip;
	}

	public void setGt_zip(String gt_zip) {
		this.gt_zip = gt_zip;
	}

	public String getGt_company() {
		return gt_company;
	}

	public void setGt_company(String gt_company) {
		this.gt_company = gt_company;
	}

	public String getGt_telPhone() {
		return gt_telPhone;
	}

	public void setGt_telPhone(String gt_telPhone) {
		this.gt_telPhone = gt_telPhone;
	}

	public String getGt_mobile() {
		return gt_mobile;
	}

	public void setGt_mobile(String gt_mobile) {
		this.gt_mobile = gt_mobile;
	}

	public String getGt_gender() {
		return gt_gender;
	}

	public void setGt_gender(String gt_gender) {
		this.gt_gender = gt_gender;
	}

	public String getGt_email() {
		return gt_email;
	}

	public void setGt_email(String gt_email) {
		this.gt_email = gt_email;
	}

	public String getGt_createtime() {
		return gt_createtime;
	}

	public void setGt_createtime(String gt_createtime) {
		this.gt_createtime = gt_createtime;
	}

	public String getGt_nuber() {
		return gt_nuber;
	}

	public void setGt_nuber(String gt_nuber) {
		this.gt_nuber = gt_nuber;
	}

	public String getGt_expenditure() {
		return gt_expenditure;
	}

	public void setGt_expenditure(String gt_expenditure) {
		this.gt_expenditure = gt_expenditure;
	}

	public Tb_pucategory getTb_pucategory() {
		return tb_pucategory;
	}

	public void setTb_pucategory(Tb_pucategory tb_pucategory) {
		this.tb_pucategory = tb_pucategory;
	}

	public Tb_pucard getTb_pucard() {
		return tb_pucard;
	}

	public void setTb_pucard(Tb_pucard tb_pucard) {
		this.tb_pucard = tb_pucard;
	}

	public Tb_pucountry getTb_pucountry() {
		return tb_pucountry;
	}

	public void setTb_pucountry(Tb_pucountry tb_pucountry) {
		this.tb_pucountry = tb_pucountry;
	}

	public Tb_putype getTb_putype() {
		return tb_putype;
	}

	public void setTb_putype(Tb_putype tb_putype) {
		this.tb_putype = tb_putype;
	}

}