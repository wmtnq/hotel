package hotel.entry;

/**
 * 
 * @author dadawang 客人类别表
 */
public class Tb_pucategory {
	private int pcg_cio;// 客人类别编号
	private String pcg_categoryName;// 客人类别名
	private String pcg_expenditure;// 消费额
	public int getPcg_cio() {
		return pcg_cio;
	}
	public void setPcg_cio(int pcg_cio) {
		this.pcg_cio = pcg_cio;
	}
	public String getPcg_categoryName() {
		return pcg_categoryName;
	}
	public void setPcg_categoryName(String pcg_categoryName) {
		this.pcg_categoryName = pcg_categoryName;
	}
	public String getPcg_expenditure() {
		return pcg_expenditure;
	}
	public void setPcg_expenditure(String pcg_expenditure) {
		this.pcg_expenditure = pcg_expenditure;
	}
	
}