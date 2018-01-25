package hotel.entry;

public class Tb_checkinitem{
private int CIMID;//入住登记信息编号
private int CHECHINORDER_CIOID;//所属登记订单编号
private int ROOM_RMID;//入住房间编号
private double CIMPRCTPRICE;//实际价格
private double CIMDISCOUNT;//实际折扣
private String CIMINDATETIME;//入住时间
private String CIMOUTDATETIME;//离开时间
private int CIMSTATE;//登记状态	 0在住，1预定，2退房

public int getCIMID(){
	return CIMID;
}
public void setCIMID(int CIMID){
	this.CIMID=CIMID;
}


public int getCHECHINORDER_CIOID(){
	return CHECHINORDER_CIOID;
}
public void setCHECHINORDER_CIOID(int CHECHINORDER_CIOID){
	this.CHECHINORDER_CIOID=CHECHINORDER_CIOID;
}


public int getROOM_RMID(){
	return ROOM_RMID;
}
public void setROOM_RMID(int ROOM_RMID){
	this.ROOM_RMID=ROOM_RMID;
}


public double getCIMPRCTPRICE(){
	return CIMPRCTPRICE;
}
public void setCIMPRCTPRICE(double CIMPRCTPRICE){
	this.CIMPRCTPRICE=CIMPRCTPRICE;
}


public double getCIMDISCOUNT(){
	return CIMDISCOUNT;
}
public void setCIMDISCOUNT(double CIMDISCOUNT){
	this.CIMDISCOUNT=CIMDISCOUNT;
}


public String getCIMINDATETIME(){
	return CIMINDATETIME;
}
public void setCIMINDATETIME(String CIMINDATETIME){
	this.CIMINDATETIME=CIMINDATETIME;
}


public String getCIMOUTDATETIME(){
	return CIMOUTDATETIME;
}
public void setCIMOUTDATETIME(String CIMOUTDATETIME){
	this.CIMOUTDATETIME=CIMOUTDATETIME;
}


public int getCIMSTATE(){
	return CIMSTATE;
}
public void setCIMSTATE(int CIMSTATE){
	this.CIMSTATE=CIMSTATE;
}

}