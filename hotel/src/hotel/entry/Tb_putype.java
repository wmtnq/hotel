package hotel.entry;
/**
 * 
 * @author dadawang
 *客人类型表
 */
public class Tb_putype{
private int GTID;//客人类型编号
private String GTTYPENAME;//客人类型名

public int getGTID(){
	return GTID;
}
public void setGTID(int GTID){
	this.GTID=GTID;
}


public String getGTTYPENAME(){
	return GTTYPENAME;
}
public void setGTTYPENAME(String GTTYPENAME){
	this.GTTYPENAME=GTTYPENAME;
}

}