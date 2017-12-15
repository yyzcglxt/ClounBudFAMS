package cn.pojo;

import java.util.Date;

/**
 * 出库表
 */
public class Output {
	private Integer outpId ;						// id
	private Integer outpFixId ;						//固定资产ID
	private Date outpDate ;							//出库时间
	private String outpEmpOperation ;				//操作员工
	private String outpEmpExtraction;				//提取员工
	private Integer outpDepaId;						//使用部门
	
	public Integer getOutpId() {
		return outpId;
	}
	public void setOutpId(Integer outpId) {
		this.outpId = outpId;
	}
	public Integer getOutpFixId() {
		return outpFixId;
	}
	public void setOutpFixId(Integer outpFixId) {
		this.outpFixId = outpFixId;
	}
	public Date getOutpDate() {
		return outpDate;
	}
	public void setOutpDate(Date outpDate) {
		this.outpDate = outpDate;
	}
	public String getOutpEmpOperation() {
		return outpEmpOperation;
	}
	public void setOutpEmpOperation(String outpEmpOperation) {
		this.outpEmpOperation = outpEmpOperation;
	}
	public String getOutpEmpExtraction() {
		return outpEmpExtraction;
	}
	public void setOutpEmpExtraction(String outpEmpExtraction) {
		this.outpEmpExtraction = outpEmpExtraction;
	}
	public Integer getOutpDepaId() {
		return outpDepaId;
	}
	public void setOutpDepaId(Integer outpDepaId) {
		this.outpDepaId = outpDepaId;
	}
	
	
}
