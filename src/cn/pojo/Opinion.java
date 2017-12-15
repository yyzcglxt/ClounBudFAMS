package cn.pojo;

import java.util.Date;

/**
 * 审批表
 */
public class Opinion {
	private Integer opinId;				//id
	private Date opinTime;				//审批日期
	private String opinAppr;			//审批人
	private String opinNextappr;		//下一审批人
	private String opinView;			//审批意见
	private String opinExplain;			//审批说明
	public Integer getOpinId() {
		return opinId;
	}
	public void setOpinId(Integer opinId) {
		this.opinId = opinId;
	}
	public Date getOpinTime() {
		return opinTime;
	}
	public void setOpinTime(Date opinTime) {
		this.opinTime = opinTime;
	}
	public String getOpinAppr() {
		return opinAppr;
	}
	public void setOpinAppr(String opinAppr) {
		this.opinAppr = opinAppr;
	}
	public String getOpinNextappr() {
		return opinNextappr;
	}
	public void setOpinNextappr(String opinNextappr) {
		this.opinNextappr = opinNextappr;
	}
	public String getOpinView() {
		return opinView;
	}
	public void setOpinView(String opinView) {
		this.opinView = opinView;
	}
	public String getOpinExplain() {
		return opinExplain;
	}
	public void setOpinExplain(String opinExplain) {
		this.opinExplain = opinExplain;
	}
	
	
	
}
