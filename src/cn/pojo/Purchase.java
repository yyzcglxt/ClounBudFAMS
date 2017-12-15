package cn.pojo;

import java.util.Date;

/**
 * 采购表
 */
public class Purchase {
	private Integer purc_id;						//id
	private Date purc_date;						    //采购时间
	private Integer purc_mate_id; 					//物资详情ID
	private String purc_buyer;						//采购员
	public Integer getPurc_id() {
		return purc_id;
	}
	public void setPurc_id(Integer purc_id) {
		this.purc_id = purc_id;
	}
	public Date getPurc_date() {
		return purc_date;
	}
	public void setPurc_date(Date purc_date) {
		this.purc_date = purc_date;
	}
	public Integer getPurc_mate_id() {
		return purc_mate_id;
	}
	public void setPurc_mate_id(Integer purc_mate_id) {
		this.purc_mate_id = purc_mate_id;
	}
	public String getPurc_buyer() {
		return purc_buyer;
	}
	public void setPurc_buyer(String purc_buyer) {
		this.purc_buyer = purc_buyer;
	}
	
	
}
