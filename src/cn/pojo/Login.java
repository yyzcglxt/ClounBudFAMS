package cn.pojo;

/**
 * 登录账户表
 */
public class Login {
	private Integer loginId;				//ID
	private Integer loginStaffId;			//工号
	private Integer loginName;				//账户名
	private Integer loginPassword;			//密码
	
	public Integer getLoginId() {
		return loginId;
	}
	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
	}
	public Integer getLoginStaffId() {
		return loginStaffId;
	}
	public void setLoginStaffId(Integer loginStaffId) {
		this.loginStaffId = loginStaffId;
	}
	public Integer getLoginName() {
		return loginName;
	}
	public void setLoginName(Integer loginName) {
		this.loginName = loginName;
	}
	public Integer getLoginPassword() {
		return loginPassword;
	}
	public void setLoginPassword(Integer loginPassword) {
		this.loginPassword = loginPassword;
	}
}
