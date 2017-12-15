package cn.pojo;

/**
 * 部门表
 */
public class Department {

	private Integer depaId;					//ID
	private String depaName;				//部门名称
	private Integer depaSuperiorid;			//上级部门ID
	
	public Integer getDepaId() {
		return depaId;
	}
	public void setDepaId(Integer depaId) {
		this.depaId = depaId;
	}
	public String getDepaName() {
		return depaName;
	}
	public void setDepaName(String depaName) {
		this.depaName = depaName;
	}
	public Integer getDepaSuperiorid() {
		return depaSuperiorid;
	}
	public void setDepaSuperiorid(Integer depaSuperiorid) {
		this.depaSuperiorid = depaSuperiorid;
	}

	
}
