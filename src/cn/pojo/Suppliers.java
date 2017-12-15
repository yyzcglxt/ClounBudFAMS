package cn.pojo;

import java.util.Date;

/**
 * 物资申请表（AF_ materials）
 *
 */
public class Suppliers {
	private Integer afmaId;					//物资申请ID
	private Integer afmaMaterialdetailsId;	//物资详情ID
	private Date afmaAppdate;				//申请时间
	private String afmaInitiala;			//初始审批人
	public Integer getAfmaId() {
		return afmaId;
	}
	public void setAfmaId(Integer afmaId) {
		this.afmaId = afmaId;
	}
	public Integer getAfmaMaterialdetailsId() {
		return afmaMaterialdetailsId;
	}
	public void setAfmaMaterialdetailsId(Integer afmaMaterialdetailsId) {
		this.afmaMaterialdetailsId = afmaMaterialdetailsId;
	}
	public Date getAfmaAppdate() {
		return afmaAppdate;
	}
	public void setAfmaAppdate(Date afmaAppdate) {
		this.afmaAppdate = afmaAppdate;
	}
	public String getAfmaInitiala() {
		return afmaInitiala;
	}
	public void setAfmaInitiala(String afmaInitiala) {
		this.afmaInitiala = afmaInitiala;
	}
	
}
