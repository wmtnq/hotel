package hotel.entry;

public class Tb_room{
private int RMID;//客房编号
private String RMAREA;//所属区域
private String RMFLOOR;//所属楼层
private double RMPRCTPRICE;//实际价格
private String RMTELPHONE;//分机电话
private int RMSTATE;//客房状态	0非空闲，1空闲
private int RMAVAILABLE;//是否可用	0不可用，1可用
private String RMCATALOG;//房间类型
private String RMPICTURE;//房间图片
private double RMPRCTDISCOUNT;//实际折扣

public int getRMID(){
	return RMID;
}
public void setRMID(int RMID){
	this.RMID=RMID;
}


public String getRMAREA(){
	return RMAREA;
}
public void setRMAREA(String RMAREA){
	this.RMAREA=RMAREA;
}


public String getRMFLOOR(){
	return RMFLOOR;
}
public void setRMFLOOR(String RMFLOOR){
	this.RMFLOOR=RMFLOOR;
}


public double getRMPRCTPRICE(){
	return RMPRCTPRICE;
}
public void setRMPRCTPRICE(double RMPRCTPRICE){
	this.RMPRCTPRICE=RMPRCTPRICE;
}


public String getRMTELPHONE(){
	return RMTELPHONE;
}
public void setRMTELPHONE(String RMTELPHONE){
	this.RMTELPHONE=RMTELPHONE;
}


public int getRMSTATE(){
	return RMSTATE;
}
public void setRMSTATE(int RMSTATE){
	this.RMSTATE=RMSTATE;
}


public int getRMAVAILABLE(){
	return RMAVAILABLE;
}
public void setRMAVAILABLE(int RMAVAILABLE){
	this.RMAVAILABLE=RMAVAILABLE;
}


public String getRMCATALOG(){
	return RMCATALOG;
}
public void setRMCATALOG(String RMCATALOG){
	this.RMCATALOG=RMCATALOG;
}


public String getRMPICTURE(){
	return RMPICTURE;
}
public void setRMPICTURE(String RMPICTURE){
	this.RMPICTURE=RMPICTURE;
}


public double getRMPRCTDISCOUNT(){
	return RMPRCTDISCOUNT;
}
public void setRMPRCTDISCOUNT(double RMPRCTDISCOUNT){
	this.RMPRCTDISCOUNT=RMPRCTDISCOUNT;
}

}