package hotel.entry;

/**
 * 
 * @author dadawang 入住登记表
 */
public class Tb_checkinitem {
	private int CIMID;// 入住登记信息编号
	private int CICHECHINORDER_CIOID;// 所属登记订单编号
	private int CIROOM_RMID;// 入住房间编号
	private double CIMPRCTPRICE;// 每天实际价格
	private double CIMDISCOUNT;// 每天实际折扣
	private String CIMINDATETIME;// 入住时间
	private String CIMOUTDATETIME;// 离开时间
	private int CIMSTATE;// 登记状态 0在住，1预定，2退房
	private Tb_checkinorder tb_checkinorder;// 入住登记订单表
	private Tb_balancement tb_balancement;// 结账信息表

	public int getCIMID() {
		return CIMID;
	}

	public void setCIMID(int CIMID) {
		this.CIMID = CIMID;
	}

	public int getCICHECHINORDER_CIOID() {
		return CICHECHINORDER_CIOID;
	}

	public void setCICHECHINORDER_CIOID(int CICHECHINORDER_CIOID) {
		this.CICHECHINORDER_CIOID = CICHECHINORDER_CIOID;
	}

	public int getCIROOM_RMID() {
		return CIROOM_RMID;
	}

	public void setCIROOM_RMID(int CIROOM_RMID) {
		this.CIROOM_RMID = CIROOM_RMID;
	}

	public double getCIMPRCTPRICE() {
		return CIMPRCTPRICE;
	}

	public void setCIMPRCTPRICE(double CIMPRCTPRICE) {
		this.CIMPRCTPRICE = CIMPRCTPRICE;
	}

	public double getCIMDISCOUNT() {
		return CIMDISCOUNT;
	}

	public void setCIMDISCOUNT(double CIMDISCOUNT) {
		this.CIMDISCOUNT = CIMDISCOUNT;
	}

	public String getCIMINDATETIME() {
		return CIMINDATETIME;
	}

	public void setCIMINDATETIME(String CIMINDATETIME) {
		this.CIMINDATETIME = CIMINDATETIME;
	}

	public String getCIMOUTDATETIME() {
		return CIMOUTDATETIME;
	}

	public void setCIMOUTDATETIME(String CIMOUTDATETIME) {
		this.CIMOUTDATETIME = CIMOUTDATETIME;
	}

	public int getCIMSTATE() {
		return CIMSTATE;
	}

	public void setCIMSTATE(int CIMSTATE) {
		this.CIMSTATE = CIMSTATE;
	}

}