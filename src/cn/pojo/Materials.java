package cn.pojo;
/**
 * 物资表（materials）
 * @author Administrator
 *
 */
public class Materials {
	private Integer malsId;				//物资ID
	private String malsName;			//物资名称
	private Double malsUnitorice;		//物资单价
	private String malsUnit;			//单位
	private String malsModel;			//型号
	private Integer malsSupplier_Id;	//供应商ID
	private Integer malsType;			//物资类型
	
	public Integer getMalsId() {
		return malsId;
	}
	public void setMalsId(Integer malsId) {
		this.malsId = malsId;
	}
	public String getMalsName() {
		return malsName;
	}
	public void setMalsName(String malsName) {
		this.malsName = malsName;
	}
	public Double getMalsUnitorice() {
		return malsUnitorice;
	}
	public void setMalsUnitorice(Double malsUnitorice) {
		this.malsUnitorice = malsUnitorice;
	}
	public String getMalsUnit() {
		return malsUnit;
	}
	public void setMalsUnit(String malsUnit) {
		this.malsUnit = malsUnit;
	}
	public String getMalsModel() {
		return malsModel;
	}
	public void setMalsModel(String malsModel) {
		this.malsModel = malsModel;
	}
	public Integer getMalsSupplier_Id() {
		return malsSupplier_Id;
	}
	public void setMalsSupplier_Id(Integer malsSupplier_Id) {
		this.malsSupplier_Id = malsSupplier_Id;
	}
	public Integer getMalsType() {
		return malsType;
	}
	public void setMalsType(Integer malsType) {
		this.malsType = malsType;
	}
	
	
}
