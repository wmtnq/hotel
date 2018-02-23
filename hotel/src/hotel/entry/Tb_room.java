package hotel.entry;

/**
 * 
 * @author dadawang 客房信息表
 */
public class Tb_room {
	private int rm_id;// 客房编号
	private String rm_area;// 所属区域
	private String rm_floor;// 所属楼层
	private double rm_prctPrice;// 实际价格
	private String rm_telphone;// 分机电话
	private int rm_state;// 客房状态 0非空闲，1空闲
	private int rm_available;// 是否可用 0不可用，1可用
	private int rm_catalog;// 房间类型
	private String rm_picture;// 房间图片
	private double rm_prctdiscount;// 实际折扣
	private Tb_roomcatalog tb_roomcatalog;// 房间类型

	public int getRm_id() {
		return rm_id;
	}

	public void setRm_id(int rm_id) {
		this.rm_id = rm_id;
	}

	public String getRm_area() {
		return rm_area;
	}

	public void setRm_area(String rm_area) {
		this.rm_area = rm_area;
	}

	public String getRm_floor() {
		return rm_floor;
	}

	public void setRm_floor(String rm_floor) {
		this.rm_floor = rm_floor;
	}

	public double getRm_prctPrice() {
		return rm_prctPrice;
	}

	public void setRm_prctPrice(double rm_prctPrice) {
		this.rm_prctPrice = rm_prctPrice;
	}

	public String getRm_telphone() {
		return rm_telphone;
	}

	public void setRm_telphone(String rm_telphone) {
		this.rm_telphone = rm_telphone;
	}

	public int getRm_state() {
		return rm_state;
	}

	public void setRm_state(int rm_state) {
		this.rm_state = rm_state;
	}

	public int getRm_available() {
		return rm_available;
	}

	public void setRm_available(int rm_available) {
		this.rm_available = rm_available;
	}

	public int getRm_catalog() {
		return rm_catalog;
	}

	public void setRm_catalog(int rm_catalog) {
		this.rm_catalog = rm_catalog;
	}

	public String getRm_picture() {
		return rm_picture;
	}

	public void setRm_picture(String rm_picture) {
		this.rm_picture = rm_picture;
	}

	public double getRm_prctdiscount() {
		return rm_prctdiscount;
	}

	public void setRm_prctdiscount(double rm_prctdiscount) {
		this.rm_prctdiscount = rm_prctdiscount;
	}

	public Tb_roomcatalog getTb_roomcatalog() {
		return tb_roomcatalog;
	}

	public void setTb_roomcatalog(Tb_roomcatalog tb_roomcatalog) {
		this.tb_roomcatalog = tb_roomcatalog;
	}

}