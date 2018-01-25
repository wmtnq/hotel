package hotel.entry;

public class Tb_checkinorder{
private int CIOID;//入住登记编号
private String CIOGUESTNAME;//客人名称
private int CIOMANNUMBER;//人员数目
private int CIOGUESTCATALOG;//客人类别
private int CIOGUESTTYPE;//客人类型
private String CIOGROUPNAME;//团队名称
private int CIOGUESTCARDCATALOG;//客人证件类型
private String CIOGUESTCARDID;//客人证件号码
private String CIOCAUSE;//事由
private int CIOSTATE;//登记状态	0在住，1预定，2退房
private String CIOINDATETIME;//客人入住时间
private String CIOPREOUTDATETIME;//预计离开时间
private String CIOPRCTOUTDATETIME;//实际离开时间
private int CIOPAYMENTMODEL;//支付类型
private int CIOPAIDMONEY;//已付押金	0未付
private int CIOISESERVID;//有无预定	0无预定，1预定
private String CIOOPERATOR;//操作员
private int CIOGUESTGENDER;//客人性别		0女，1男
private double CIOTOTALRATE;//总费用
private double CIOCONSUMPTION;//额外消费
private String CIOCONSUMPTIONDETAILS;//额外消费详情
private String CIOORDERID;//登记单号

public int getCIOID(){
	return CIOID;
}
public void setCIOID(int CIOID){
	this.CIOID=CIOID;
}


public String getCIOGUESTNAME(){
	return CIOGUESTNAME;
}
public void setCIOGUESTNAME(String CIOGUESTNAME){
	this.CIOGUESTNAME=CIOGUESTNAME;
}


public int getCIOMANNUMBER(){
	return CIOMANNUMBER;
}
public void setCIOMANNUMBER(int CIOMANNUMBER){
	this.CIOMANNUMBER=CIOMANNUMBER;
}


public int getCIOGUESTCATALOG(){
	return CIOGUESTCATALOG;
}
public void setCIOGUESTCATALOG(int CIOGUESTCATALOG){
	this.CIOGUESTCATALOG=CIOGUESTCATALOG;
}


public int getCIOGUESTTYPE(){
	return CIOGUESTTYPE;
}
public void setCIOGUESTTYPE(int CIOGUESTTYPE){
	this.CIOGUESTTYPE=CIOGUESTTYPE;
}


public String getCIOGROUPNAME(){
	return CIOGROUPNAME;
}
public void setCIOGROUPNAME(String CIOGROUPNAME){
	this.CIOGROUPNAME=CIOGROUPNAME;
}


public int getCIOGUESTCARDCATALOG(){
	return CIOGUESTCARDCATALOG;
}
public void setCIOGUESTCARDCATALOG(int CIOGUESTCARDCATALOG){
	this.CIOGUESTCARDCATALOG=CIOGUESTCARDCATALOG;
}


public String getCIOGUESTCARDID(){
	return CIOGUESTCARDID;
}
public void setCIOGUESTCARDID(String CIOGUESTCARDID){
	this.CIOGUESTCARDID=CIOGUESTCARDID;
}


public String getCIOCAUSE(){
	return CIOCAUSE;
}
public void setCIOCAUSE(String CIOCAUSE){
	this.CIOCAUSE=CIOCAUSE;
}


public int getCIOSTATE(){
	return CIOSTATE;
}
public void setCIOSTATE(int CIOSTATE){
	this.CIOSTATE=CIOSTATE;
}


public String getCIOINDATETIME(){
	return CIOINDATETIME;
}
public void setCIOINDATETIME(String CIOINDATETIME){
	this.CIOINDATETIME=CIOINDATETIME;
}


public String getCIOPREOUTDATETIME(){
	return CIOPREOUTDATETIME;
}
public void setCIOPREOUTDATETIME(String CIOPREOUTDATETIME){
	this.CIOPREOUTDATETIME=CIOPREOUTDATETIME;
}


public String getCIOPRCTOUTDATETIME(){
	return CIOPRCTOUTDATETIME;
}
public void setCIOPRCTOUTDATETIME(String CIOPRCTOUTDATETIME){
	this.CIOPRCTOUTDATETIME=CIOPRCTOUTDATETIME;
}


public int getCIOPAYMENTMODEL(){
	return CIOPAYMENTMODEL;
}
public void setCIOPAYMENTMODEL(int CIOPAYMENTMODEL){
	this.CIOPAYMENTMODEL=CIOPAYMENTMODEL;
}


public int getCIOPAIDMONEY(){
	return CIOPAIDMONEY;
}
public void setCIOPAIDMONEY(int CIOPAIDMONEY){
	this.CIOPAIDMONEY=CIOPAIDMONEY;
}


public int getCIOISESERVID(){
	return CIOISESERVID;
}
public void setCIOISESERVID(int CIOISESERVID){
	this.CIOISESERVID=CIOISESERVID;
}


public String getCIOOPERATOR(){
	return CIOOPERATOR;
}
public void setCIOOPERATOR(String CIOOPERATOR){
	this.CIOOPERATOR=CIOOPERATOR;
}


public int getCIOGUESTGENDER(){
	return CIOGUESTGENDER;
}
public void setCIOGUESTGENDER(int CIOGUESTGENDER){
	this.CIOGUESTGENDER=CIOGUESTGENDER;
}


public double getCIOTOTALRATE(){
	return CIOTOTALRATE;
}
public void setCIOTOTALRATE(double CIOTOTALRATE){
	this.CIOTOTALRATE=CIOTOTALRATE;
}


public double getCIOCONSUMPTION(){
	return CIOCONSUMPTION;
}
public void setCIOCONSUMPTION(double CIOCONSUMPTION){
	this.CIOCONSUMPTION=CIOCONSUMPTION;
}


public String getCIOCONSUMPTIONDETAILS(){
	return CIOCONSUMPTIONDETAILS;
}
public void setCIOCONSUMPTIONDETAILS(String CIOCONSUMPTIONDETAILS){
	this.CIOCONSUMPTIONDETAILS=CIOCONSUMPTIONDETAILS;
}


public String getCIOORDERID(){
	return CIOORDERID;
}
public void setCIOORDERID(String CIOORDERID){
	this.CIOORDERID=CIOORDERID;
}

}