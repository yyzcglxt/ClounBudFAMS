package cn.pojo;

/**
 * 职位表
 */
public abstract class Position {
	
	private Integer posiId;				//ID
	private String posiName;			//职位名称
	private Integer posiDepaId;			//部门ID
	public Integer getPosiId() {
		return posiId;
	}
	public void setPosiId(Integer posiId) {
		this.posiId = posiId;
	}
	public String getPosiName() {
		return posiName;
	}
	public void setPosiName(String posiName) {
		this.posiName = posiName;
	}
	public Integer getPosiDepaId() {
		return posiDepaId;
	}
	public void setPosiDepaId(Integer posiDepaId) {
		this.posiDepaId = posiDepaId;
	}
	
}
