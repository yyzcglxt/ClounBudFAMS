package cn.pojo;

/**
 * 固定资产报增表
 */
public class FAIncrease {
	private Integer fainId;		//id
	private Integer fainListId;	//物资详情id
	private String fainAppr;	//初始审批人
	private String fainStaff;	//操作员工
	private String fainRemarks;	//备注
	
	public Integer getFainId() {
		return fainId;
	}
	public void setFainId(Integer fainId) {
		this.fainId = fainId;
	}
	public Integer getFainListId() {
		return fainListId;
	}
	public void setFainListId(Integer fainListId) {
		this.fainListId = fainListId;
	}
	public String getFainAppr() {
		return fainAppr;
	}
	public void setFainAppr(String fainAppr) {
		this.fainAppr = fainAppr;
	}
	public String getFainStaff() {
		return fainStaff;
	}
	public void setFainStaff(String fainStaff) {
		this.fainStaff = fainStaff;
	}
	public String getFainRemarks() {
		return fainRemarks;
	}
	public void setFainRemarks(String fainRemarks) {
		this.fainRemarks = fainRemarks;
	}
}
