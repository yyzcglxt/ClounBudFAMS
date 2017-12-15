package cn.pojo;

import java.util.Date;

/**
 * 采购验收表
 */
public class CKPurchase {
	private Integer ckpuId;			//id
	private String ckpuEmpId;		//验收员
	private Date ckpuDate;			//验收时间
	private String ckpuInvoice;		//发票号码
	private Integer ckpuAfId;		//采购申请ID
	
	public Integer getCkpuId() {
		return ckpuId;
	}
	public void setCkpuId(Integer ckpuId) {
		this.ckpuId = ckpuId;
	}
	public String getCkpuEmpId() {
		return ckpuEmpId;
	}
	public void setCkpuEmpId(String ckpuEmpId) {
		this.ckpuEmpId = ckpuEmpId;
	}
	public Date getCkpuDate() {
		return ckpuDate;
	}
	public void setCkpuDate(Date ckpuDate) {
		this.ckpuDate = ckpuDate;
	}
	public String getCkpuInvoice() {
		return ckpuInvoice;
	}
	public void setCkpuInvoice(String ckpuInvoice) {
		this.ckpuInvoice = ckpuInvoice;
	}
	public Integer getCkpuAfId() {
		return ckpuAfId;
	}
	public void setCkpuAfId(Integer ckpuAfId) {
		this.ckpuAfId = ckpuAfId;
	}
	
	
}
