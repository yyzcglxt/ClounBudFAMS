package cn.pojo;
/**
 * 物资类型表（materialsType）
 */
public class MaterialsType {
	private Integer matyId;					//物资类型ID
	private String matyTypename;			//类型名称
	private Integer matyParentId;			//父类型ID
	public Integer getMatyId() {
		return matyId;
	}
	public void setMatyId(Integer matyId) {
		this.matyId = matyId;
	}
	public String getMatyTypename() {
		return matyTypename;
	}
	public void setMatyTypename(String matyTypename) {
		this.matyTypename = matyTypename;
	}
	public Integer getMatyParentId() {
		return matyParentId;
	}
	public void setMatyParentId(Integer matyParentId) {
		this.matyParentId = matyParentId;
	}
	
}
