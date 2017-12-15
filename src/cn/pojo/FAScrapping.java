package cn.pojo;

/**
 * 固定资产报废表
 */
public class FAScrapping {

	private Integer fascId;					//ID
	private Integer fascFixeId;				//固定资产ID
	private String fascReason;				//报废原因
	private String fascStaff;				//操作员工
	private String fascApprover;			//初始审批人
	public Integer getFascId() {
		return fascId;
	}
	public void setFascId(Integer fascId) {
		this.fascId = fascId;
	}
	public Integer getFascFixeId() {
		return fascFixeId;
	}
	public void setFascFixeId(Integer fascFixeId) {
		this.fascFixeId = fascFixeId;
	}
	public String getFascReason() {
		return fascReason;
	}
	public void setFascReason(String fascReason) {
		this.fascReason = fascReason;
	}
	public String getFascStaff() {
		return fascStaff;
	}
	public void setFascStaff(String fascStaff) {
		this.fascStaff = fascStaff;
	}
	public String getFascApprover() {
		return fascApprover;
	}
	public void setFascApprover(String fascApprover) {
		this.fascApprover = fascApprover;
	}
	
}
