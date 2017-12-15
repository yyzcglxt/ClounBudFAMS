package cn.pojo;

/**
 * 固定资产变更表
 */
public class FAChange {
	private Integer fachId;				//id
	private Integer fachFixeId;			//固定资产id
	private String fachReason;			//变更原因
	private String fachStaff;			//操作员工
	private Integer fachOriginal;		//原使用部门
	private Integer fachChange;			//变更后部门
	private String fachInitial;			//初始审批人
	private String fachRemarks;			//备注
	
	public Integer getFachId() {
		return fachId;
	}
	public void setFachId(Integer fachId) {
		this.fachId = fachId;
	}
	public Integer getFachFixeId() {
		return fachFixeId;
	}
	public void setFachFixeId(Integer fachFixeId) {
		this.fachFixeId = fachFixeId;
	}
	public String getFachReason() {
		return fachReason;
	}
	public void setFachReason(String fachReason) {
		this.fachReason = fachReason;
	}
	public String getFachStaff() {
		return fachStaff;
	}
	public void setFachStaff(String fachStaff) {
		this.fachStaff = fachStaff;
	}
	public Integer getFachOriginal() {
		return fachOriginal;
	}
	public void setFachOriginal(Integer fachOriginal) {
		this.fachOriginal = fachOriginal;
	}
	public Integer getFachChange() {
		return fachChange;
	}
	public void setFachChange(Integer fachChange) {
		this.fachChange = fachChange;
	}
	public String getFachInitial() {
		return fachInitial;
	}
	public void setFachInitial(String fachInitial) {
		this.fachInitial = fachInitial;
	}
	public String getFachRemarks() {
		return fachRemarks;
	}
	public void setFachRemarks(String fachRemarks) {
		this.fachRemarks = fachRemarks;
	}
	
}
