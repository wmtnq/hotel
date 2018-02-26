package hotel.entry;

/**
 * 
 * @author dadawang 入住订单表
 */
public class Tb_checkinorder {
	private int cio_id;// 入住登记订单编号
	private int cio_guestID;// 客户编号
	private int cio_manNumber;// 人员数目
	private int cio_guestCatalog;// 客户类别
	private int cio_guestType;// 客户类型
	private String cio_groupName;// 团队名称
	private int cio_guestCardCatalog;// 客户证件类型
	private String cio_guestCardId;// 客户证件号码
	private String cio_cause;// 事由
	private int cio_State;// 登记状态 0在住，1预定，2退房
	private String cio_inDateTime;// 客户入住时间
	private String cio_outDateTime;// 预计离开时间
	private String cio_prctOutDateTime;// 实际离开时间
	private int cio_paymentmodel;// 支付类型
	private int cio_paidMoney;// 已付押金 0未付
	private int cio_iseservid;// 有无预定 0无预定，1预定
	private String cio_operator;// 操作员
	private int cio_guestGender;// 客户性别 0女，1男
	private double cio_totalRate;// 总费用
	private double cio_consumption;// 额外消费
	private String cio_consumptionDetails;// 额外消费详情
	private int cio_orderid;// 登记单号
	private Tb_guest tb_guest;// 客户实体
	private Tb_pucard tb_pucard;//客户证件类型
	private Tb_pupaymenttype tb_pupaymenttype;// 支付类型
	private Tb_checkinitem tb_checkinitem;// 入住登记表
	private Tb_balancement tb_balancement;// 结账信息表
	private Tb_pucategory tb_pucategory;//客户类别
	private Tb_putype tb_putype;//客户类型
	public Tb_pucard getTb_pucard() {
		return tb_pucard;
	}

	public void setTb_pucard(Tb_pucard tb_pucard) {
		this.tb_pucard = tb_pucard;
	}

	public Tb_pucategory getTb_pucategory() {
		return tb_pucategory;
	}

	public void setTb_pucategory(Tb_pucategory tb_pucategory) {
		this.tb_pucategory = tb_pucategory;
	}

	public Tb_putype getTb_putype() {
		return tb_putype;
	}

	public void setTb_putype(Tb_putype tb_putype) {
		this.tb_putype = tb_putype;
	}

	public int getCio_id() {
		return cio_id;
	}

	public void setCio_id(int cio_id) {
		this.cio_id = cio_id;
	}

	public int getCio_guestID() {
		return cio_guestID;
	}

	public void setCio_guestID(int cio_guestID) {
		this.cio_guestID = cio_guestID;
	}

	public int getCio_manNumber() {
		return cio_manNumber;
	}

	public void setCio_manNumber(int cio_manNumber) {
		this.cio_manNumber = cio_manNumber;
	}

	public int getCio_guestCatalog() {
		return cio_guestCatalog;
	}

	public void setCio_guestCatalog(int cio_guestCatalog) {
		this.cio_guestCatalog = cio_guestCatalog;
	}

	public int getCio_guestType() {
		return cio_guestType;
	}

	public void setCio_guestType(int cio_guestType) {
		this.cio_guestType = cio_guestType;
	}

	public String getCio_groupName() {
		return cio_groupName;
	}

	public void setCio_groupName(String cio_groupName) {
		this.cio_groupName = cio_groupName;
	}

	public int getCio_guestCardCatalog() {
		return cio_guestCardCatalog;
	}

	public void setCio_guestCardCatalog(int cio_guestCardCatalog) {
		this.cio_guestCardCatalog = cio_guestCardCatalog;
	}

	public String getCio_guestCardId() {
		return cio_guestCardId;
	}

	public void setCio_guestCardId(String cio_guestCardId) {
		this.cio_guestCardId = cio_guestCardId;
	}

	public String getCio_cause() {
		return cio_cause;
	}

	public void setCio_cause(String cio_cause) {
		this.cio_cause = cio_cause;
	}

	public int getCio_State() {
		return cio_State;
	}

	public void setCio_State(int cio_State) {
		this.cio_State = cio_State;
	}

	public String getCio_inDateTime() {
		return cio_inDateTime;
	}

	public void setCio_inDateTime(String cio_inDateTime) {
		this.cio_inDateTime = cio_inDateTime;
	}

	public String getCio_outDateTime() {
		return cio_outDateTime;
	}

	public void setCio_outDateTime(String cio_outDateTime) {
		this.cio_outDateTime = cio_outDateTime;
	}

	public String getCio_prctOutDateTime() {
		return cio_prctOutDateTime;
	}

	public void setCio_prctOutDateTime(String cio_prctOutDateTime) {
		this.cio_prctOutDateTime = cio_prctOutDateTime;
	}

	public int getCio_paymentmodel() {
		return cio_paymentmodel;
	}

	public void setCio_paymentmodel(int cio_paymentmodel) {
		this.cio_paymentmodel = cio_paymentmodel;
	}

	public int getCio_paidMoney() {
		return cio_paidMoney;
	}

	public void setCio_paidMoney(int cio_paidMoney) {
		this.cio_paidMoney = cio_paidMoney;
	}

	public int getCio_iseservid() {
		return cio_iseservid;
	}

	public void setCio_iseservid(int cio_iseservid) {
		this.cio_iseservid = cio_iseservid;
	}

	public String getCio_operator() {
		return cio_operator;
	}

	public void setCio_operator(String cio_operator) {
		this.cio_operator = cio_operator;
	}

	public int getCio_guestGender() {
		return cio_guestGender;
	}

	public void setCio_guestGender(int cio_guestGender) {
		this.cio_guestGender = cio_guestGender;
	}

	public double getCio_totalRate() {
		return cio_totalRate;
	}

	public void setCio_totalRate(double cio_totalRate) {
		this.cio_totalRate = cio_totalRate;
	}

	public double getCio_consumption() {
		return cio_consumption;
	}

	public void setCio_consumption(double cio_consumption) {
		this.cio_consumption = cio_consumption;
	}

	public String getCio_consumptionDetails() {
		return cio_consumptionDetails;
	}

	public void setCio_consumptionDetails(String cio_consumptionDetails) {
		this.cio_consumptionDetails = cio_consumptionDetails;
	}

	public int getCio_orderid() {
		return cio_orderid;
	}

	public void setCio_orderid(int cio_orderid) {
		this.cio_orderid = cio_orderid;
	}

	public Tb_guest getTb_guest() {
		return tb_guest;
	}

	public void setTb_guest(Tb_guest tb_guest) {
		this.tb_guest = tb_guest;
	}

	public Tb_pupaymenttype getTb_pupaymenttype() {
		return tb_pupaymenttype;
	}

	public void setTb_pupaymenttype(Tb_pupaymenttype tb_pupaymenttype) {
		this.tb_pupaymenttype = tb_pupaymenttype;
	}

	public Tb_checkinitem getTb_checkinitem() {
		return tb_checkinitem;
	}

	public void setTb_checkinitem(Tb_checkinitem tb_checkinitem) {
		this.tb_checkinitem = tb_checkinitem;
	}

	public Tb_balancement getTb_balancement() {
		return tb_balancement;
	}

	public void setTb_balancement(Tb_balancement tb_balancement) {
		this.tb_balancement = tb_balancement;
	}

}