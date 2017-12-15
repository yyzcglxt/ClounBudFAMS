package cn.pojo;

/**
 * 固定资产报损表
 */
public class AFSpoilage {
	
	private Integer faspId;						//ID
	private Integer faspFixeId;					//固定资产ID
	private String faspReason;					//报损原因
	private String faspStaff;					//操作员工
	private String faspApprover;				//初始审批人
	public Integer getFaspId() {
		return faspId;
	}
	public void setFaspId(Integer faspId) {
		this.faspId = faspId;
	}
	public Integer getFaspFixeId() {
		return faspFixeId;
	}
	public void setFaspFixeId(Integer faspFixeId) {
		this.faspFixeId = faspFixeId;
	}
	public String getFaspReason() {
		return faspReason;
	}
	public void setFaspReason(String faspReason) {
		this.faspReason = faspReason;
	}
	public String getFaspStaff() {
		return faspStaff;
	}
	public void setFaspStaff(String faspStaff) {
		this.faspStaff = faspStaff;
	}
	public String getFaspApprover() {
		return faspApprover;
	}
	public void setFaspApprover(String faspApprover) {
		this.faspApprover = faspApprover;
	}
	

}
