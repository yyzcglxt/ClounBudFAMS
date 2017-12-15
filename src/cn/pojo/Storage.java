package cn.pojo;

import java.util.Date;

/**
 * 入库表
 */
public class Storage {
	private Integer storId;				// id
	private Date storDate;				//入库时间
	private String storEmplOperation;	// 操作员工
	private String storEmplCause;		//报损原因
	private Integer storFixId;			//固定资产ID
	public Integer getStorId() {
		return storId;
	}
	public void setStorId(Integer storId) {
		this.storId = storId;
	}
	public Date getStorDate() {
		return storDate;
	}
	public void setStorDate(Date storDate) {
		this.storDate = storDate;
	}
	public String getStorEmplOperation() {
		return storEmplOperation;
	}
	public void setStorEmplOperation(String storEmplOperation) {
		this.storEmplOperation = storEmplOperation;
	}
	public String getStorEmplCause() {
		return storEmplCause;
	}
	public void setStorEmplCause(String storEmplCause) {
		this.storEmplCause = storEmplCause;
	}
	public Integer getStorFixId() {
		return storFixId;
	}
	public void setStorFixId(Integer storFixId) {
		this.storFixId = storFixId;
	}
	
	
}
