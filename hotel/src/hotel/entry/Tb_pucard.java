package hotel.entry;

/**
 * 
 * @author dadawang 证件类型表
 */
public class Tb_pucard {
	private int pc_id;// 证件类型编号
	private String pc_cardCatalogName;// 证件名
	public int getPc_id() {
		return pc_id;
	}
	public void setPc_id(int pc_id) {
		this.pc_id = pc_id;
	}
	public String getPc_cardCatalogName() {
		return pc_cardCatalogName;
	}
	public void setPc_cardCatalogName(String pc_cardCatalogName) {
		this.pc_cardCatalogName = pc_cardCatalogName;
	}
	
}