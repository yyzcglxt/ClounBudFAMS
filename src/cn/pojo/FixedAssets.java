package cn.pojo;

/**
 * 固定资产表
 */
public class FixedAssets {
	private Integer fixeId;			//id
	private Integer fixeHaseId;		//采购单id
	private Integer fixeMateId;		//物资id
	private double fixeYz;			//原值
	private double fixeJcz;			//净残值
	private double fixeJz;			//净值
	private double fixeTime;		//可使用年限
	private String fixeCode;		//资产编码
	private String fixePosition;	//仓储位置
	private String fixeState;		//状态
	private Integer fixeDepa;		//使用编码
	
	public Integer getFixeId() {
		return fixeId;
	}
	public void setFixeId(Integer fixeId) {
		this.fixeId = fixeId;
	}
	public Integer getFixeHaseId() {
		return fixeHaseId;
	}
	public void setFixeHaseId(Integer fixeHaseId) {
		this.fixeHaseId = fixeHaseId;
	}
	public Integer getFixeMateId() {
		return fixeMateId;
	}
	public void setFixeMateId(Integer fixeMateId) {
		this.fixeMateId = fixeMateId;
	}
	public double getFixeYz() {
		return fixeYz;
	}
	public void setFixeYz(double fixeYz) {
		this.fixeYz = fixeYz;
	}
	public double getFixeJcz() {
		return fixeJcz;
	}
	public void setFixeJcz(double fixeJcz) {
		this.fixeJcz = fixeJcz;
	}
	public double getFixeJz() {
		return fixeJz;
	}
	public void setFixeJz(double fixeJz) {
		this.fixeJz = fixeJz;
	}
	public double getFixeTime() {
		return fixeTime;
	}
	public void setFixeTime(double fixeTime) {
		this.fixeTime = fixeTime;
	}
	public String getFixeCode() {
		return fixeCode;
	}
	public void setFixeCode(String fixeCode) {
		this.fixeCode = fixeCode;
	}
	public String getFixePosition() {
		return fixePosition;
	}
	public void setFixePosition(String fixePosition) {
		this.fixePosition = fixePosition;
	}
	public String getFixeState() {
		return fixeState;
	}
	public void setFixeState(String fixeState) {
		this.fixeState = fixeState;
	}
	public Integer getFixeDepa() {
		return fixeDepa;
	}
	public void setFixeDepa(Integer fixeDepa) {
		this.fixeDepa = fixeDepa;
	}
	
}
