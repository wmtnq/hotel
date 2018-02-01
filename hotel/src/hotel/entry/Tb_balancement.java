package hotel.entry;

/**
 * 
 * @author dadawang 结账信息表
 */
public class Tb_balancement {
	private int bm_id;// 结账信息编号
	private int bm_checkinorderId;// 入住登记订单编号
	private int bm_roomId;// 客房编号
	private int bm_guestId;// 客户编号
	private int bm_paymentmodel;// 支付类型
	private double bm_totalRate;// 应收金额
	private double bm_paidMoney;// 已付押金 0未付
	private double bm_receivMoney;// 续收金额
	private double bm_refund;// 退款金额
	private int bm_refundState;// 退款状态 0处理中 1已退款
	private String bm_cardName;// 持卡人姓名
	private String bm_cardNumber;// 卡号
	private String bm_cardId;// 持卡人身份证号
	private String bm_cardPhone; // 持卡人手机号
	private String bm_createTime;// 创建时间
	private String bm_operator;// 操作员
	private int bm_receipt;// 是否开票 0否1是
	private String bm_company;// 公司名称
	private String bm_phone;// 收件人手机号
	private String bm_address;// 邮寄地址
	private int bm_receiptStatus;// 开票状态
	private String bm_remark;// 结账说明
	private Tb_room tb_room;//客房信息表
	private Tb_guest tb_guest;//客户实体
	private Tb_checkinitem tb_checkinitem;//登记入住信息表
	public int getBm_id() {
		return bm_id;
	}
	public void setBm_id(int bm_id) {
		this.bm_id = bm_id;
	}
	public int getBm_checkinorderId() {
		return bm_checkinorderId;
	}
	public void setBm_checkinorderId(int bm_checkinorderId) {
		this.bm_checkinorderId = bm_checkinorderId;
	}
	public int getBm_roomId() {
		return bm_roomId;
	}
	public void setBm_roomId(int bm_roomId) {
		this.bm_roomId = bm_roomId;
	}
	public int getBm_guestId() {
		return bm_guestId;
	}
	public void setBm_guestId(int bm_guestId) {
		this.bm_guestId = bm_guestId;
	}
	public int getBm_paymentmodel() {
		return bm_paymentmodel;
	}
	public void setBm_paymentmodel(int bm_paymentmodel) {
		this.bm_paymentmodel = bm_paymentmodel;
	}
	public double getBm_totalRate() {
		return bm_totalRate;
	}
	public void setBm_totalRate(double bm_totalRate) {
		this.bm_totalRate = bm_totalRate;
	}
	public double getBm_paidMoney() {
		return bm_paidMoney;
	}
	public void setBm_paidMoney(double bm_paidMoney) {
		this.bm_paidMoney = bm_paidMoney;
	}
	public double getBm_receivMoney() {
		return bm_receivMoney;
	}
	public void setBm_receivMoney(double bm_receivMoney) {
		this.bm_receivMoney = bm_receivMoney;
	}
	public double getBm_refund() {
		return bm_refund;
	}
	public void setBm_refund(double bm_refund) {
		this.bm_refund = bm_refund;
	}
	public int getBm_refundState() {
		return bm_refundState;
	}
	public void setBm_refundState(int bm_refundState) {
		this.bm_refundState = bm_refundState;
	}
	public String getBm_cardName() {
		return bm_cardName;
	}
	public void setBm_cardName(String bm_cardName) {
		this.bm_cardName = bm_cardName;
	}
	public String getBm_cardNumber() {
		return bm_cardNumber;
	}
	public void setBm_cardNumber(String bm_cardNumber) {
		this.bm_cardNumber = bm_cardNumber;
	}
	public String getBm_cardId() {
		return bm_cardId;
	}
	public void setBm_cardId(String bm_cardId) {
		this.bm_cardId = bm_cardId;
	}
	public String getBm_cardPhone() {
		return bm_cardPhone;
	}
	public void setBm_cardPhone(String bm_cardPhone) {
		this.bm_cardPhone = bm_cardPhone;
	}
	public String getBm_createTime() {
		return bm_createTime;
	}
	public void setBm_createTime(String bm_createTime) {
		this.bm_createTime = bm_createTime;
	}
	public String getBm_operator() {
		return bm_operator;
	}
	public void setBm_operator(String bm_operator) {
		this.bm_operator = bm_operator;
	}
	public int getBm_receipt() {
		return bm_receipt;
	}
	public void setBm_receipt(int bm_receipt) {
		this.bm_receipt = bm_receipt;
	}
	public String getBm_company() {
		return bm_company;
	}
	public void setBm_company(String bm_company) {
		this.bm_company = bm_company;
	}
	public String getBm_phone() {
		return bm_phone;
	}
	public void setBm_phone(String bm_phone) {
		this.bm_phone = bm_phone;
	}
	public String getBm_address() {
		return bm_address;
	}
	public void setBm_address(String bm_address) {
		this.bm_address = bm_address;
	}
	public int getBm_receiptStatus() {
		return bm_receiptStatus;
	}
	public void setBm_receiptStatus(int bm_receiptStatus) {
		this.bm_receiptStatus = bm_receiptStatus;
	}
	public String getBm_remark() {
		return bm_remark;
	}
	public void setBm_remark(String bm_remark) {
		this.bm_remark = bm_remark;
	}
	public Tb_room getTb_room() {
		return tb_room;
	}
	public void setTb_room(Tb_room tb_room) {
		this.tb_room = tb_room;
	}
	public Tb_guest getTb_guest() {
		return tb_guest;
	}
	public void setTb_guest(Tb_guest tb_guest) {
		this.tb_guest = tb_guest;
	}
	public Tb_checkinitem getTb_checkinitem() {
		return tb_checkinitem;
	}
	public void setTb_checkinitem(Tb_checkinitem tb_checkinitem) {
		this.tb_checkinitem = tb_checkinitem;
	}
	

}