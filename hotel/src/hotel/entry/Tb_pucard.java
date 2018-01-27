package hotel.entry;

/**
 * 
 * @author dadawang 证件类型表
 */
public class Tb_pucard {
	private int GTID;// 证件类型编号
	private String GTCARDCATALOGNAME;// 证件名

	public int getGTID() {
		return GTID;
	}

	public void setGTID(int GTID) {
		this.GTID = GTID;
	}

	public String getGTCARDCATALOGNAME() {
		return GTCARDCATALOGNAME;
	}

	public void setGTCARDCATALOGNAME(String GTCARDCATALOGNAME) {
		this.GTCARDCATALOGNAME = GTCARDCATALOGNAME;
	}

}