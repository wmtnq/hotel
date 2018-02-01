package hotel.entry;

/**
 * 
 * @author dadawang 入住登记表
 */
public class Tb_checkinitem {
	private int cim_id;// 入住登记信息编号
	private int cim_chechinorderId;// 所属登记订单编号
	private int cim_roomId;// 入住房间编号
	private double cim_prctPrice;// 每天实际价格
	private double cim_discount;// 每天实际折扣
	private String cim_inDateTime;// 入住时间
	private String cim_outdateTime;// 离开时间
	private int cim_state;// 登记状态 0在住，1预定，2退房
	private Tb_checkinorder tb_checkinorder;// 入住登记订单表
	private Tb_balancement tb_balancement;// 结账信息表
	private Tb_room tb_room;// 房间信息
	public int getCim_id() {
		return cim_id;
	}
	public void setCim_id(int cim_id) {
		this.cim_id = cim_id;
	}
	public int getCim_chechinorderId() {
		return cim_chechinorderId;
	}
	public void setCim_chechinorderId(int cim_chechinorderId) {
		this.cim_chechinorderId = cim_chechinorderId;
	}
	public int getCim_roomId() {
		return cim_roomId;
	}
	public void setCim_roomId(int cim_roomId) {
		this.cim_roomId = cim_roomId;
	}
	public double getCim_prctPrice() {
		return cim_prctPrice;
	}
	public void setCim_prctPrice(double cim_prctPrice) {
		this.cim_prctPrice = cim_prctPrice;
	}
	public double getCim_discount() {
		return cim_discount;
	}
	public void setCim_discount(double cim_discount) {
		this.cim_discount = cim_discount;
	}
	public String getCim_inDateTime() {
		return cim_inDateTime;
	}
	public void setCim_inDateTime(String cim_inDateTime) {
		this.cim_inDateTime = cim_inDateTime;
	}
	public String getCim_outdateTime() {
		return cim_outdateTime;
	}
	public void setCim_outdateTime(String cim_outdateTime) {
		this.cim_outdateTime = cim_outdateTime;
	}
	public int getCim_state() {
		return cim_state;
	}
	public void setCim_state(int cim_state) {
		this.cim_state = cim_state;
	}
	public Tb_checkinorder getTb_checkinorder() {
		return tb_checkinorder;
	}
	public void setTb_checkinorder(Tb_checkinorder tb_checkinorder) {
		this.tb_checkinorder = tb_checkinorder;
	}
	public Tb_balancement getTb_balancement() {
		return tb_balancement;
	}
	public void setTb_balancement(Tb_balancement tb_balancement) {
		this.tb_balancement = tb_balancement;
	}
	public Tb_room getTb_room() {
		return tb_room;
	}
	public void setTb_room(Tb_room tb_room) {
		this.tb_room = tb_room;
	}


}