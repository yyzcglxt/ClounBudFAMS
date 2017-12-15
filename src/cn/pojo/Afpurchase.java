package cn.pojo;

import java.util.Date;

/**
 * 采购申请表
 *
 */
public class Afpurchase {
	private Integer afpuId;							//采购申请ID
	private String afpuInitialapprover;				//初始审批人
	private Date afpuApdate;						//申请日期
	private Integer afpuMaterialdetailsId;			//物资详情ID
	private Integer afpuMaterialapplicationId;		//物资申请ID
	
	public Integer getAfpuId() {
		return afpuId;
	}
	public void setAfpuId(Integer afpuId) {
		this.afpuId = afpuId;
	}
	public String getAfpuInitialapprover() {
		return afpuInitialapprover;
	}
	public void setAfpuInitialapprover(String afpuInitialapprover) {
		this.afpuInitialapprover = afpuInitialapprover;
	}
	public Date getAfpuApdate() {
		return afpuApdate;
	}
	public void setAfpuApdate(Date afpuApdate) {
		this.afpuApdate = afpuApdate;
	}
	public Integer getAfpuMaterialdetailsId() {
		return afpuMaterialdetailsId;
	}
	public void setAfpuMaterialdetailsId(Integer afpuMaterialdetailsId) {
		this.afpuMaterialdetailsId = afpuMaterialdetailsId;
	}
	public Integer getAfpuMaterialapplicationId() {
		return afpuMaterialapplicationId;
	}
	public void setAfpuMaterialapplicationId(Integer afpuMaterialapplicationId) {
		this.afpuMaterialapplicationId = afpuMaterialapplicationId;
	}
	
}
